package methodstructure.bodymass;

public class BodyMass {

    private int weight;
    private int height;

    public BodyMass(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public double bodyMassIndex(){
        return weight*10000/(height*height);
    }

    public BmiCategory body(){
        double bmi = bodyMassIndex();
        if (bmi < 18.5)
            return BmiCategory.UNDERWEIGHT;
        if (bmi > 25)
            return BmiCategory.OVERWEIGHT;
        return BmiCategory.NORMAL;
    }

    public boolean isThinnerThan (BodyMass other) {
        return bodyMassIndex() < other.bodyMassIndex();
    }
}
