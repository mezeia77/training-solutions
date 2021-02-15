package week14d03;

import java.util.*;

public class ClassNoteBook {

    private List<Student> students;

    public ClassNoteBook(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Set<Student> sortNoteBook(){
        Set<Student> result = new TreeSet<>(students);
        return result;
    }
}
