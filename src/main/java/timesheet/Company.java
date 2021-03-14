package timesheet;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private InputStream employeesFile;
    private InputStream projectsFile;

    private List<TimeSheetItem> itemList = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();

    public Company(InputStream employeesFile, InputStream projectsFile) {
        this.employeesFile = employeesFile;
        this.projectsFile = projectsFile;
        readEmployeesFromFile();
        readProjectsFromFile();
    }

    public Company() {
    }

    private void readEmployeesFromFile(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(employeesFile))) {
            String line;
            while ((line= br.readLine())!=null){
                String[] nameParts = line.split(" ");
                employees.add(new Employee(nameParts[0], nameParts[1]));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("File not found", ioException);
        }
    }

    private void readProjectsFromFile(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(projectsFile, StandardCharsets.UTF_8))) {
            String line;
            while ((line= br.readLine())!=null){
                projects.add(new Project(line));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("File not found", ioException);
        }
    }

    public List<TimeSheetItem> getItemList() {
        return itemList;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addTimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate){
        itemList.add(new TimeSheetItem(employee, project, beginDate, endDate));
    }

    public List<ReportLine> calculateProjectByNameYearMonth(String name, int year, int month) {
        checkName(name);
        List<ReportLine> result = new ArrayList<>();
        for (TimeSheetItem item:itemList){
            if(item.getEmployee().getName().equals(name) &&
            item.getBeginDate().getYear() == year &&
            item.getBeginDate().getMonthValue() == month){
                addItem(result, item);
            }
        }
        return result;
    }

    private void checkName(String name) {
        if(!name.contains(" ")){
            throw new IllegalArgumentException("Invalid name");
        }
    }

    private void addItem(List<ReportLine> result, TimeSheetItem item) {
        if(result.isEmpty()) {
            result.add(new ReportLine(item.getProject(), item.hoursBetweenDates()));
        } else {
            ifItemExists(result, item);
        }
    }

    private void ifItemExists(List<ReportLine> result, TimeSheetItem item) {
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).getProject().getName().equals(item.getProject().getName())) {
                result.get(i).addTime(item.hoursBetweenDates());
            } else {
                result.add(new ReportLine(item.getProject(), item.hoursBetweenDates()));
                return;
            }
        }
    }

    public void printToFile(String name, int year, int month, Path report) {
        if(!isEmployeeWorking(name)){
            throw new IllegalArgumentException("No such employee");
        }
        List<ReportLine> result = new ArrayList<>(calculateProjectByNameYearMonth(name, year, month));
        String line;
        try(BufferedWriter bw = Files.newBufferedWriter(report)) {
            String header = generateHeader(name, year, month, result);
            bw.write(header);
            for(ReportLine reportLine: result){
                line = reportLine.getProject().toString() + " " + reportLine.getTime() + '\n';
                bw.write(line);
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can't write file");
        }
    }

    private String generateHeader(String name, int year, int month, List<ReportLine> result) throws IOException {
                String header = "";
                int hours = 0;
                for (ReportLine reportLine:result){
                    hours+=reportLine.getTime();
                }
                header = name + " " + year + "-" + month + " " + hours + '\n';
                return header;
    }

    private boolean isEmployeeWorking(String name) {
        boolean result = false;
        for(Employee employee:employees){
            if(employee.getName().equals(name)){
                result = true;
            }
        }
        return result;
    }

}
