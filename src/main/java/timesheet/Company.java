package timesheet;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Company {
    private InputStream employeesFile;
    private InputStream projectsFile;

    private List<TimeSheetItem> itemList = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();

    public Company(InputStream employeesFile, InputStream projectsFile) {
        this.employeesFile = employeesFile;
        this.projectsFile = projectsFile;
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
        List<ReportLine> result = new ArrayList<>();
        for (TimeSheetItem item:itemList){
            if(item.getEmployee().getName().equals(name) &&
            item.getBeginDate().getYear() == year &&
            item.getBeginDate().getMonthValue() == month){
                result.add(item.getProject(), item.hoursBetweenDates());
            }
        }
        return result;
    }

}
