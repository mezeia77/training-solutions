package searching;

import collectionscomp.trainer.Trainer;

import java.util.*;

public class Practice {

    void array(){
        int[] i = {1,3,5,6,7,9,12,4};

        int index = Arrays.binarySearch(i, 4);
        System.out.println(index);

        Arrays.sort(i);
        index = Arrays.binarySearch(i, 4);
        System.out.println(index);

        index = Arrays.binarySearch(i, 5);
        System.out.println(index);
    }

    void list(){
//        List<Integer> i = new ArrayList<>(List.of(1,3,5,6,7,9,12));
//        System.out.println(Collections.binarySearch(i, 6));
//        System.out.println(i.contains(1));
//        System.out.println(i.contains(2));
//        System.out.println(i.containsAll(List.of(1, 2)));
//        System.out.println(i.get(0));
//        System.out.println(i.indexOf(6));
//        System.out.println(i.indexOf(2));
//        System.out.println("max " +Collections.max(i));
//        System.out.println("min " + Collections.min(i));

        List<Trainer> trainers = new ArrayList<>(List.of(
                new Trainer("John", 3),
                new Trainer("Jack", 2),
                new Trainer("Jane", 1)));

        System.out.println(Collections.min(trainers));
        System.out.println(Collections.min(trainers,
                new Comparator<Trainer>()
                {
                    @Override
                    public int compare(Trainer o1, Trainer o2){
                        return o1.getSalary()- o2.getSalary();
                    }
                }));

//        (o1, o2) -> o1.getSalary()- o2.getSalary()));
//        Comparator.comparingInt(Trainer::getSalary)));
    }

    public static void main(String[] args) {
//        new Practice().array();
        new Practice().list();
    }
}
