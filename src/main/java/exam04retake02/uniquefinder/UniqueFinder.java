package exam04retake02.uniquefinder;

import java.util.*;

public class UniqueFinder {
    public List<Character> uniqueChars(String s) {
        Set<Character> collect = new LinkedHashSet<>();
        if(s==null){
            throw new IllegalArgumentException("Null not allowed");
        }

        for(int i = 0; i<s.length();i++){
            collect.add(s.charAt(i));
        }

        List<Character> result = new ArrayList<>();

        result.addAll(collect);

        return result;
    }
}
