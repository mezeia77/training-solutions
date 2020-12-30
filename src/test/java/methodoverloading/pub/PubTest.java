package methodoverloading.pub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PubTest {

    @Test
    public void constructorTest() {
        //Given
        Pub pub = new Pub("Kurta kocsma", 10, 30);
        //Then
        assertEquals(pub.getName(),"Kurta kocsma");
        assertEquals(pub.getOpening().getHours(), 10);
        assertEquals(pub.getOpening().getMinutes(), 30);
    }

    @Test
    public void toStringTest() {
        //Given
        Pub pub = new Pub("Kurta kocsma", 10, 30);
        //Then
        assertEquals(pub.toString(), "Kurta kocsma;10:30");
    }

}
