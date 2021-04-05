package exam04retake02.aquarium_ver_B;

public class Tang extends Fish{

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
        setShortTermMemoryLoss(true);
    }

    @Override
    public void feed() {
        increaseWeight(1);
    }
}
