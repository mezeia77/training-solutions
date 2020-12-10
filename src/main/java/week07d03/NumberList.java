package week07d03;

import java.util.List;

public class NumberList {

    public boolean isIncreasing(List<Integer> numbers){
        int count = 0;

        for (int i=0; i<numbers.size()-1;i++) {
            if (numbers.get(i)<= numbers.get(i+1)){
                count++;
            }
        }
        if (count==numbers.size()-1){
            return true;
        } return false;

    }
}

