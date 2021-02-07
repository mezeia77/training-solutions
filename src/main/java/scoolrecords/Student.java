package scoolrecords;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        if(isEmpty(name)){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        int i = name.indexOf(name);
        return name + " marks: " +  marks.get(i).getSubject().getSubjectName() +
                ": " + marks.get(i).getMarkType().getDescription() + "(" + marks.get(i).getMarkType().getValue() + ")";
    }

    public void grading(Mark mark){
        if(mark==null){
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage(){
        double i = 0;
        if(marks.size()==0){
            return 0.0;
        }
        for(Mark mark:marks){
            i+= mark.getMarkType().getValue();
        }
        BigDecimal bigDecimal = BigDecimal.valueOf(i/ marks.size());
        bigDecimal= bigDecimal.setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public double calculateSubjectAverage(Subject subject){
        if(marks.size()==0){
            return 0.0;
        }
        double result = 0;
        int i = 0;
        for(Mark mark:marks){
            if(mark.getSubject().getSubjectName().equals(subject.getSubjectName())){
                result+= mark.getMarkType().getValue();
                i++;
            }
        }
        if(i==0){
            return 0.0;
        }
        return result / i;
    }

    public boolean isEmpty(String s){
        if(s==null || s.trim().equals("")){
            return true;
        }
        return false;
    }
}
