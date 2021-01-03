package week03d02;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public static void main(String[] args) {
        List<Position> positions = new ArrayList<>();
        positions.add(new Position("director", 1_000_000));
        positions.add(new Position("manager", 750_000));
        positions.add(new Position("team_leader", 50_000));
        positions.add(new Position("operator", 30_000));

        for(Position position: positions){
            if(position.bonus>150000){
                System.out.println(position.toString());
            }
        }
    }
}
