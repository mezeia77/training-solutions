package week10d02;

import java.util.ArrayList;
import java.util.List;

public class MaxTravel {

    public int getMaxIndex(List<Integer> stations){

        List<Integer> copyOfStations = new ArrayList<>(stations);
        int [] data = new int[30];

//        for(int i = 0; i< copyOfStations.size(); i++){
//            data[copyOfStations.get(i)]++;
//        }

        for(int i : copyOfStations){
            data[i]++;
        }

        int result = 0;
        int temp = 0;

        for(int j = 0; j < data.length; j++){
            if (data[j] > temp){
                temp = data[j];
                result = j;
            }
        }
        return result;
    }

}
