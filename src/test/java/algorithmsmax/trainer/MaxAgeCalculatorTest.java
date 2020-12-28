package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAgeCalculatorTest {
    @Test
    void trainerMaxAgeTest(){
        List<Trainer> trainers = Arrays.asList(
                new Trainer("John Doe", 52),
                new Trainer("Jack Doe", 48),
                new Trainer("Jane Doe", 38),
                new Trainer("Jyll Doe", 28)
        );
        //MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();
        assertEquals( new MaxAgeCalculator().trainerWithMaxAge(trainers).getName(), "John Doe");
    }
}
