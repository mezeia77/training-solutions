package algorithmsmax.integers;

import java.util.List;

public class IntegerMaxCalculator {

    public int maxNumber (List<Integer> numbers){
        int result = //Integer.MIN_VALUE;
        0;
        for (Integer number: numbers){
            if (number > result){
                result = number;
            }
        } return result;
    }

}
