package exam04retake02.aquarium_ver_B;

public class Kong extends Fish {

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
        setShortTermMemoryLoss(false);
    }

    @Override
    public void feed() {
        increaseWeight(2);
    }
}
