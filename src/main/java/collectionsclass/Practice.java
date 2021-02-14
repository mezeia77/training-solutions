package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Practice {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(List.of(1, 2));
        List<Integer> unmod = Collections.unmodifiableList(l);
        System.out.println(l);
        l.add(3);
        System.out.println(l);

        Collections.reverse(l);
        System.out.println(l);
        Collections.shuffle(l);
        System.out.println(l);
        Random random = new Random(5);
        Collections.shuffle(l,random);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
    }
}
