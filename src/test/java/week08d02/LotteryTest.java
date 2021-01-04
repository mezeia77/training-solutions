package week08d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void numbers() {
        Lottery lottery= new Lottery();
        List<Integer> result = Arrays.asList(18, 83, 45, 15, 67);
        assertEquals(Arrays.asList(18, 83, 45, 15, 67), new Lottery().getNumbers(90, 5));

    }
}