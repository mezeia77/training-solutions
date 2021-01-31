package collectionslist;

import collectionslist.collectionsarraylist.Lottery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    Lottery lottery = new Lottery();

    @Test
    void wrongParametersThrowsException(){
     lottery.create(90);
        assertThrows(IllegalArgumentException.class, ()->lottery.selectWinningNumbers(5, 6));
    }

}