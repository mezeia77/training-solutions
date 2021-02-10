package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private List<Student> students = new ArrayList<>();
    private Random rnd;

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student){
        for (Student s:students){
            if(s.getName().equals(student.getName())){
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student){
        for (Student s:students){
            if(s.getName().equals(student.getName())){
                students.remove(s);
                return true;
            }
        }
        return false;
    }

    public double calculateClassAverage(){
        if(students.isEmpty()){
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double i = 0;
        for (Student s: students){
            i+=s.calculateAverage();
        }
        if(i==0){
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return i/ students.size();
    }

    public double calculateClassAverageBySubject(Subject subject){
        double i = 0;
        int count = 0;
        for (Student s:students){
            if(s.calculateSubjectAverage(subject)!=0.0) {
                i += s.calculateSubjectAverage(subject);
                    count++;
                }
            }
        return i/count;
    }

    public Student findStudentByName(String name){
        if(isEmpty(name)){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if(students.isEmpty()){
            throw new IllegalStateException("No students to search!");
        }
        for(Student s:students){
            if(s.getName().equals(name)){
                return s;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition(){
        if(students.isEmpty()){
            throw new IllegalStateException("No students to select for repetition!");
        }
        Random rnd2 = new Random(5);
        return students.get(rnd2.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults(){
        List<StudyResultByName> srbn = new ArrayList<>();
        for(Student s : students){
            srbn.add(new StudyResultByName(s.getName(), s.calculateAverage()));
        }
        return srbn;
    }


    public String listStudentNames(){
        String result = "";
        for (Student s : students){
            result += (s.getName()+", ");
        }
        int necessaryLenght=result.length()-2;
        result = result.substring(0, necessaryLenght);
        return result;
    }

    public boolean isEmpty(String s){
        if(s==null || s.trim().equals("")){
            return true;
        }
        return false;
    }

}
