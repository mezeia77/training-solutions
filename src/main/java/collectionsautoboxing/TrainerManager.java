package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class TrainerManager {
    public static void main(String[] args) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('a', 1);

        System.out.println(m.get('a'));

        System.out.println(m);

        m.put('a', m.get('a')+1);
        System.out.println(m);

        m.put('a', 15);
        System.out.println(m);

        m.put('a', null);
        System.out.println(m);

    }




}
