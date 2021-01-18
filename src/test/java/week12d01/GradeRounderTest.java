package week12d01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GradeRounderTest {


    GradeRounder gradeRounder = new GradeRounder();
    int[] test ={25, 32, 39, 42, 43, 44, 52, 69, 72, 84, 85, 86, 87, 92};

    @Test
    void roundGrades() {
        assertEquals("[25, 32, 39, 42, 45, 45, 52, 70, 72, 85, 85, 86, 87, 92]", Arrays.toString(gradeRounder.roundGrades(test)));
    }

    @Test
    void roundGrades2() {
        assertEquals("[25, 32, 39, 42, 45, 45, 52, 70, 72, 85, 85, 86, 87, 92]", Arrays.toString(gradeRounder.roundGrades2(test)));
    }

    @Test
    void roundGrades3() {
        assertEquals("[25, 32, 39, 42, 45, 45, 52, 70, 72, 85, 85, 86, 87, 92]", Arrays.toString(gradeRounder.roundGrades3(test)));
    }
}