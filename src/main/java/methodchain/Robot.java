package methodchain;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int distance;
    private int azimut;

    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }

    public Robot go(int meter){
        this.distance = this.distance + meter;
        return this;
    }

    public Robot rotate(int angle){
        this.azimut = this.azimut + angle;
        return this;
    }



}
