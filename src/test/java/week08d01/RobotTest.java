package week08d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    void move() {
        Robot robot = new Robot();
        String data = "FFLLLLLBBBBJJJJJJJ";
        int[] goodResult = new int[2];
        goodResult[0] = -3;
        goodResult[1] = -3;

        //assertEquals(Arrays.asList(-3, -3), Arrays.toString(robot.move(data)));
        assertEquals(Arrays.toString(goodResult), Arrays.toString(robot.move(data)));
    }

    @Test
    void wrongMove() {
        Robot robot = new Robot();
        String data = "FFLLLLLBBBB4JJJJJJJ";
        assertThrows(IllegalArgumentException.class, ()->robot.move(data));
    }
}