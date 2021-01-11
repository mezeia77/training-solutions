package abstractclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    @Test
    public void creation() {
        Point point = new Point(5,6);

        assertEquals(point.getX(), 5L);
        assertEquals(point.getY(), 6L);
    }

    @Test
    public void distance() {
        Point point1 = new Point(0,0);
        Point point2 = new Point(100,100);


        assertEquals(point1.distance(point2), 141L);
    }
}
