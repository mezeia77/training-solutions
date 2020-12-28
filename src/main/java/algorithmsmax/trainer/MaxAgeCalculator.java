package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public int trainerWithMaxAge(List<Trainer> trainers){
        int age = Integer.MIN_VALUE;
        for (Trainer trainer: trainers){
            if (trainer.getAge() > age){
                age = trainer.getAge();
            }
        } return age;

    }

}
