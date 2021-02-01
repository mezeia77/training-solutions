package collectionsautoboxing;

import java.util.ArrayList;
import java.util.List;

public class IntegerOperations {

    public List<Integer> createList(int...numbers){
        List<Integer> integers = new ArrayList<>();
        for(int i:numbers){
            integers.add(i);
        }
        return integers;
    }

    public int sumIntegerList(List<Integer> integers){
        int result=0;
        for(int i:integers){
            result+=i;
        }
        return result;
    }

    public int sumIntegerObjects(Integer...integers){
        int result=0;
        for(Integer i:integers){
            result+=i;
        }
        return result;
    }
}
