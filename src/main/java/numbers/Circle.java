package numbers;

public class Circle {

    private final double PI = 3.14;

    public double perimeter (int diameter){
        return 2*PI*diameter;
    }

    public double area (int diameter){
        return diameter*diameter*PI;
    }

}
