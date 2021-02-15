package week14d03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements Comparable<Student>{
    private String name;
    private Map<String, List<Integer>> notes = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public Student(Student s){
        name = s.name;
        notes=new HashMap<>(s.notes);
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Integer>> getNotes() {
        return notes;
    }

    public void setNotes(String subject, int value) {
        if(!notes.containsKey(subject)){
            notes.put(subject, new ArrayList<>());
        }
        notes.get(subject).add(value);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", notes=" + notes +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

}


//    Készíts egy diák (`Student`) osztályt melyben egy diák jegyeit tárolod egy Map-ben.
//        A map kulcsa a tantárgy, értéke pedig az adott tantárgy jegyeinek listája.
//        Ezen felül a diáknak legyen neve, melyet konstruktorban kap meg.
//        Legyen benne egy metódus, ami paraméterül vár egy tantárgyat és egy jegyet, és beírja a jegyet a megfelelő tantárgyhoz.
//        Készítsd el a `ClassNotebook` nevű osztályt melyben diákok listája található.
//        Készíts egy lekérdező metódust a `ClassNoteBook` osztályban, legyen a neve `sortNotebook` mely a diákok listáját ABC sorrendben adja vissza
