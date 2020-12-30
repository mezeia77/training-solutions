package methodoverloading.pub;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListOfGoodPubsTest {

//    @Rule
//    public final ExpectedException exception = ExpectedException.none();

//    @Test
//    public void emptyPubListShouldThrowException() throws IllegalArgumentException {
//        // Given
//        exception.expect(IllegalArgumentException.class);
//        exception.expectMessage("Pub list is empty!");
//        // When
//        new ListOfGoodPubs(new ArrayList<>());
//    }

    @Test
    public void testFindTheBest() {

        ListOfGoodPubs goodPubs = new ListOfGoodPubs(Arrays.asList(
                new Pub("A két rablóhoz", 12, 20),
                new Pub("Kurta kocsma", 9, 0),
                new Pub("Kings", 23, 0),
                new Pub("Fehér ló", 22, 30),
                new Pub("Fekete macska", 23, 30)
        ));

        assertEquals(goodPubs.findTheBest().toString(), "Kurta kocsma;9:0");
    }

}
