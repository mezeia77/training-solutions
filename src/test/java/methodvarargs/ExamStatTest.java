package methodvarargs;

import methodevarargs.ExamStats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExamStatTest {

    ExamStats examStats = new ExamStats(4 );


    @Test
    public void testGetNumberOfTopGrades() {

        assertEquals(examStats.getNumberOfTopGrades(85, 2, 3, 4, 5, 86, 90, 99), 3);
        assertEquals(examStats.getNumberOfTopGrades(85, 2, 3, 4, 5, 56, 34, 70), 0);
    }


    @Test
    public void testHasAnyFailed() {

        assertEquals(examStats.hasAnyFailed(50, 10, 90), true);
        assertEquals(examStats.hasAnyFailed(50, 60, 90), false);
    }

}
