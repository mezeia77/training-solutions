package week08d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer> getNumbers(int interval, int numbers){
        Random rnd = new Random(5);
        List<Integer> result = new ArrayList<>(numbers);

        while(result.size()<numbers){
            int number = rnd.nextInt(interval)+1;
            if(!result.contains(number)){
                result.add(number);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println(lottery.getNumbers(90, 5));
    }
}
