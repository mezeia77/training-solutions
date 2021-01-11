package week08d04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @BeforeEach
    void setUp() {
        Trainer goodTrainer = new Trainer(new GoodMood());
        Trainer badTrainer = new Trainer(new BadMood());
    }

    @Test
    void giveMark() {
        Trainer goodTrainer = new Trainer(new GoodMood());
        Trainer badTrainer = new Trainer(new BadMood());

        assertEquals(5, new GoodMood().giveMark());
        assertEquals(5, goodTrainer.giveMark());
        assertEquals(3, new BadMood().giveMark());
        assertEquals(3, badTrainer.giveMark());
    }
}