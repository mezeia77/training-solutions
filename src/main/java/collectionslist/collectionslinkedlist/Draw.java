package collectionslist.collectionslinkedlist;

import java.util.*;

public class Draw {

    public List<Integer> create(int maxNumber){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i<= maxNumber; i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers;
    }

    public Set<Integer> drawNumbers(int type, int maxNumber){
        if(type>=maxNumber){
            throw new IllegalArgumentException("Invalid numbers");
        }
        return new TreeSet<>(create(maxNumber).subList(0, type));
    }
}
