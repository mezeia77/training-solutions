package scoolrecords;

import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> subjects;

    public Tutor(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject){
        for(Subject s: subjects){
            if(s.getSubjectName().equals(subject.getSubjectName())){
                return true;
            }
        }
        return false;
    }
}
