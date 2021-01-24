package ioreader.grades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolRecordsManagerTest {

    SchoolRecordsManager schoolRecordsManager = new SchoolRecordsManager();

    @Test
    void readFileTest(){
        assertEquals(0, schoolRecordsManager.getStudentList().size());
        schoolRecordsManager.readGradesFromFile("grades.txt");
        assertEquals( "John_Smith",schoolRecordsManager.getStudentList().get(0).getName());
    }

    @Test
    void isIncreasingTest(){
        schoolRecordsManager.readGradesFromFile("grades.txt");
        assertFalse(schoolRecordsManager.getStudentList().get(0).isIncreasing());
        assertTrue(schoolRecordsManager.getStudentList().get(2).isIncreasing());
    }

    @Test
    void averageTest(){
        schoolRecordsManager.readGradesFromFile("grades.txt");
        assertEquals(4, schoolRecordsManager.getStudentList().get(2).average());
        assertEquals(3.2, schoolRecordsManager.getStudentList().get(3).average(), 0.3);
    }

    @Test
    void classAverageTest(){
        schoolRecordsManager.readGradesFromFile("grades.txt");
        assertEquals(3.2, schoolRecordsManager.classAverage(), 0.1);
    }

}