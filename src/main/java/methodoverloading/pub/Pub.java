package methodoverloading.pub;

import methodoverloading.time.Time;

public class Pub {

    private String name;
    private Time opening;

    public Pub(String name, int hours, int minutes) {
        this.name = name;
        this.opening = new Time (hours, minutes);
    }

    public String getName() {
        return name;
    }

    public Time getOpening() {
        return opening;
    }

    public String toString() {
        return name + ";" + opening.getHours() + ":" + opening.getMinutes();
    }
//
//    @Override
//    public String toString() {
//        return "Pub{" +
//                "name='" + name + '\'' +
//                ", opening=" + opening +
//                '}';
//    }
}
