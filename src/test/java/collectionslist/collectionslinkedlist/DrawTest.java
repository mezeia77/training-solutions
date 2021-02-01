package collectionslist.collectionslinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawTest {

    Draw draw = new Draw();

    @Test
    void wrongParametersThrowsException(){
        draw.create(90);
        assertThrows(IllegalArgumentException.class, ()->draw.drawNumbers(7, 6));
    }

}