package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List <String> stringListsUnion(List<String> first, List<String> second){
        List<String> result = new ArrayList<>(first);
        for(String temp:second){
         if(!result.contains(temp)){
             result.add(temp);
         }
        }
        return result;
    }
}
