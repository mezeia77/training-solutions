package week07d04;

import org.junit.jupiter.api.Test;


import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LabTest {

    @Test
    public void createWithTitle(){
        Lab lab = new Lab("Task1");
        assertEquals("Task1", lab.getTitle());
        assertFalse(lab.isCompleted());
    }

    @Test
    public void createWithTitleAndDate(){
        Lab lab = new Lab("Task1", LocalDate.of(2020, 12, 12));
        assertEquals("Task1", lab.getTitle());
        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.of(2020,12,12), lab.getCopletedAt());
    }

    @Test
    public void completeNowTest(){
        Lab lab = new Lab("Task1");
        lab.complete();

        assertTrue(lab.isCompleted());
    }

}
