package exam04retake02.aquarium_ver_B;

public abstract class Fish {

    private String name;
    private int weight;
    private String color;
    private boolean shortTermMemoryLoss;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String status(){
    return name + ", weight: " + weight + ", color: " + ", short-term memory loss: " + shortTermMemoryLoss;
    }

    public void increaseWeight(int amount){
        weight += amount;
    }

    public abstract void feed();

    public void setShortTermMemoryLoss(boolean shortTermMemoryLoss) {
        this.shortTermMemoryLoss = shortTermMemoryLoss;
    }

    public boolean hasMemoryLoss(){
        return shortTermMemoryLoss;
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
}
