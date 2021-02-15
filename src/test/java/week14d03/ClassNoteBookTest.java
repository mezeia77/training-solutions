package week14d03;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ClassNoteBookTest {

    @Test
    void createTest(){
        Student student = new Student("Kiss");
        assertEquals("Kiss", student.getName());

        assertEquals(0, student.getNotes().size());
        student.setNotes("matematika", 3);
        assertEquals(1, student.getNotes().size());
    }

    @Test
    void setNoteTest(){
        Student student = new Student("Kiss");

        student.setNotes("matematika", 5);
        assertEquals(1, student.getNotes().size());
        assertEquals(5, student.getNotes().get("matematika").get(0));

        student.setNotes("matematika", 4);
        assertEquals(2, student.getNotes().get("matematika").size());

        student.setNotes("biológia", 3);
        assertEquals(1, student.getNotes().get("biológia").size());
    }

    @Test
    void sortNoteBookTest(){
        ClassNoteBook classNoteBook = new ClassNoteBook(new ArrayList<>(List.of(new Student("Nagy"), new Student("Kovács"), new Student("Aranyosi"))));

        System.out.println(classNoteBook.sortNoteBook());

    }

}