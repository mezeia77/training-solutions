package ioreader.grades;

import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double average(){
        int sum = 0;
        for(Integer number:grades){
            sum+=number;
        }
        return sum/ grades.size();
    }

    public boolean isIncreasing(){
        if(average()<grades.get(grades.size()-1)){
            return true;
        }
        return false;
    }
}
