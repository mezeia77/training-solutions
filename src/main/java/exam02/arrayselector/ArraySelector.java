package exam02.arrayselector;

import java.util.ArrayList;
import java.util.List;

public class ArraySelector {

    public String selectEvens(int[] numbers){
        String result = "";

        if(numbers.length==0){
            return result;
        }

        List<String> selectedNumbers = new ArrayList<>();

        for(int i = 0; i<numbers.length; i+=2){
            Integer temp = numbers[i];
            selectedNumbers.add(temp.toString());
        }

        result= result + "[" + selectedNumbers.get(0);

        for(int i = 1; i<selectedNumbers.size(); i++){
                result = result.concat(", ").concat(selectedNumbers.get(i));
        }
        return result + "]";
    }
}
