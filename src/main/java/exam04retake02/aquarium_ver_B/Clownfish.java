package exam04retake02.aquarium_ver_B;

public class Clownfish extends Fish{

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
        setShortTermMemoryLoss(false);
    }

    @Override
    public void feed() {
      increaseWeight(1);
    }
}
