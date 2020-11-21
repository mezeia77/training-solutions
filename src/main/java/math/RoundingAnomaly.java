package math;

import java.util.Arrays;
import java.util.Random;

public class RoundingAnomaly {

    //private double[] numbers;

    double[] randomNumbers(int size, double max, int scale){
       double[] numbers = new double[size];
       Random random = new Random();
       double factor = Math.pow(10, scale);
        for (int i=0; i<size; i++){
           double number = Math.round(random.nextDouble()*max*factor)/factor;
           numbers[i] = number;
        } return numbers;
    }



    public static void main(String[] args) {

        RoundingAnomaly roundingAnomaly = new RoundingAnomaly();

        System.out.println(Arrays.asList(roundingAnomaly.randomNumbers(1000, 1000000, 5)));

    }
}
