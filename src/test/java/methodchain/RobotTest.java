package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    Robot robot = new Robot();

    @Test
    public void testGoAndRotate() {
        //When
        robot.go(5).go(10).rotate(30);
        //Then
        assertEquals(robot.getDistance(), 15);
        assertEquals(robot.getAzimut(), 30);
    }

    @Test
    public void testRotate() {
        //When
        robot.rotate(45).rotate(45).rotate(-90);
        //Then
        assertEquals(robot.getAzimut(), 0);
    }

}
