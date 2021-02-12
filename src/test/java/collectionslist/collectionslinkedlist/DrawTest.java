package collectionslist.collectionslinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawTest {

    Draw draw = new Draw();

    @Test
    void numbersDrawn(){
        System.out.println(draw.drawNumbers(6, 90));
    }

    @Test
    void wrongParametersThrowsException(){
        assertThrows(IllegalArgumentException.class, ()->draw.drawNumbers(7, 6));
    }

}