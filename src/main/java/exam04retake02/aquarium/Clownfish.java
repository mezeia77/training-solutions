package exam04retake02.aquarium;

public class Clownfish implements Fish {

    private String name;
    private int weight;
    private String color;


    public Clownfish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String status() {
        return getName() + ", weight: " + getWeight() + ", color: " + getColor() + ", short-term memory loss: " + hasMemoryLoss();
    }

    @Override
    public int feed() {
        return weight+=1;
    }


    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return false;
    }
}
