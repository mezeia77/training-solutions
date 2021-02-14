package collectionsiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorManager {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
//        System.out.println(l);
//        for (int i : l){
//            if(i%2==0){
//                l.remove(Integer.valueOf(i));
//            }
//        }
//        System.out.println(l);
//        ConcurrentModificationException

        Iterator<Integer> i = l.iterator();
        System.out.println(i.toString());
        while (i.hasNext()){
            System.out.println(i.next());
            if(i.next()%2==0){
                i.remove();
            }
        }
    }



}
