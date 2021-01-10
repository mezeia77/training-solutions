package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String text, char c){
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i<text.length(); i++){
            if(text.toLowerCase().charAt(i) == c){
                result.add(i);
            }
        }
        return result;
    }

}
