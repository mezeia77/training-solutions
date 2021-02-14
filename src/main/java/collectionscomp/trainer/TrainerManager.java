package collectionscomp.trainer;

import java.text.Collator;
import java.util.*;

public class TrainerManager {

    private void nameOrdering(){
        List<String> names = new ArrayList<>(List.of("Joe", "Jack", "Jane"));
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
    }

    private void comparableNaturalordering (){
        List<Trainer> trainers = new ArrayList<>(List.of(
                new Trainer("Joe", 3),
                new Trainer("Jack", 2),
                new Trainer("Jane", 1)));

        Collections.sort(trainers);
        System.out.println(trainers);
        Collections.sort(trainers, new SalaryComparator() {
            @Override
            public int compare(Trainer o1, Trainer o2){
                return o2.getSalary()- o1.getSalary(); //reverse
            }
        });
        System.out.println(trainers);
    }

    public class SalaryComparator implements Comparator<Trainer>{
        @Override
        public int compare(Trainer o1, Trainer o2){
            return o1.getSalary()-o2.getSalary();
        }
    }

    public void sortWithAccutes(){
        List<String> names = new ArrayList<>(List.of("Joe", "Jack", "Jane", "Ábel", "éva", "jack"));
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        Collections.sort(names, Collator.getInstance());
        System.out.println(names);
//        Collections.sort(names, Collator.getInstance(new Locale("hu", "HU")));
//        System.out.println(names);
    }

    public static void main(String[] args) {
//        new TrainerManager().nameOrdering();
//        new TrainerManager().comparableNaturalordering();
        new TrainerManager().sortWithAccutes();
    }
}
