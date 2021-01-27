package ioreader.grades;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SchoolRecordsManager {

    private List<Student> studentList= new ArrayList<>();
    private static final String directory = "src/main/resources/ioreader/";

    public List<Student> getStudentList() {
        return studentList;
    }

    public void readGradesFromFile(String filename){
        Path filePath = Path.of(directory+filename);
        try (BufferedReader br = Files.newBufferedReader(filePath)){
            String line;
            while ((line=br.readLine())!=null){
                String[] temp = line.split(" ");
                List<Integer> grades = new ArrayList<>();
                for (int i = 1; i < temp.length; i++) {
                    grades.add(Integer.parseInt(temp[i]));
                }
                studentList.add(new Student(temp[0],grades));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cant' find file ", e);
        }
    }

    public double classAverage(){
        double averageSum = 0;
        for(Student student : studentList){
            averageSum += student.average();
        }
        return averageSum/studentList.size();
    }
}
