package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String text, char c){
        List<Integer> result = new ArrayList<>();
        String temp = text.toLowerCase();

        for(int i = 0; i<temp.length(); i++){
            if(temp.charAt(i) == c){
                result.add(i);
            }
        }
        return result;
    }

}
