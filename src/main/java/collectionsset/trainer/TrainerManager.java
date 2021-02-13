package collectionsset.trainer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TrainerManager {

    public static void main(String[] args) {
        Set<Trainer> trainers = new HashSet<>();

//        trainers.add(new Trainer("John"));
        trainers.add(new Trainer("Jack"));
        trainers.add(new Trainer("John"));

        System.out.println(trainers);
    }
}
