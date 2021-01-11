package interfaceextends;

import abstractclass.Point;

import java.util.List;

public interface MoveableRobot {
    void moveTo(Point position);
    void fastMoveTo(Point position);
    void rotate(int angle);
    List<Point> getPath();
}
