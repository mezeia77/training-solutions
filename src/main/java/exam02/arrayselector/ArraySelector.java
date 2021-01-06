package exam02.arrayselector;

import java.util.Arrays;

public class ArraySelector {

    public String selectEvens(int[] numbers){
        String result = "";

        if(numbers.length==0){
            return result;
        }

        int[] selectedNumbers = new int[5];

        for(int i = 0; i<numbers.length; i+=2){
            int j = 0;
            selectedNumbers[j] = numbers[i];
            j++;
        }

        result= result + "[";

        for(int i = 0; i<selectedNumbers.length; i++){
            Integer temp = numbers[i];

                result = result + temp.toString();
        }
        return result + "]";
    }
}
