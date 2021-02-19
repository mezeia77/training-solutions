package sorting;

import java.util.*;

public class Practice {

    private void sortArray(){
        int[] i = {3, 1, 6, 9, 5, 3};
        System.out.println(Arrays.toString(i));
        Arrays.sort(i);
        System.out.println(Arrays.toString(i));
    }

    private void sortList(){
        List<Integer> l = new ArrayList<>(List.of(3, 1, 6, 9, 5, 3));
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        l.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(l);
    }

    private void sortSet(){
        Set<String> s = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.length();
                }
                return o1.length()-o2.length();
            }
        });

        s.add("Jack");
        s.add("Joe");
        s.add("Jane");
        System.out.println(s);
    }

    public static void main(String[] args) {
//        new Practice().sortArray();
//        new Practice().sortList();
        new Practice().sortSet();
    }

}
