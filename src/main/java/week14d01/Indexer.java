package week14d01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names){
        Map<Character, List<String>> result = new TreeMap<>();
        char c;
        for(String s : names){
            List<String> temp = new ArrayList<>();
            c = s.charAt(0);
            for (String s1 : names){
                if(s1.charAt(0)==c){
                    temp.add(s1);
                }
            }
            result.put(Character.valueOf(c), temp);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Indexer().index(List.of("Adam", "Eva", "Arnold", "Balint", "David", "Botond")));
    }

}
