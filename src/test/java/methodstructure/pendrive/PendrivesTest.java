package methodstructure.pendrive;

import methodstructure.pendrives.Pendrive;
import methodstructure.pendrives.Pendrives;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PendrivesTest {

    private static final List<Pendrive> PENDRIVE_LIST = Arrays.asList(
            new Pendrive("p1", 64, 3500),   //0,018
            new Pendrive("p2", 32, 2000),   //0,016
            new Pendrive("p3", 64, 3000),   //0,021
            new Pendrive("p4", 32, 2500)    //0,0128
    );

    @Test
    public void best() {
        Pendrives pendrives = new Pendrives();

        assertEquals(pendrives.best(PENDRIVE_LIST), PENDRIVE_LIST.get(2));
    }

    @Test
    public void cheapest() {
        Pendrives pendrives = new Pendrives();

        assertEquals(pendrives.cheapest(PENDRIVE_LIST), PENDRIVE_LIST.get(1));
    }

    @Test
    public void risePriceWhereCapacity() {
        Pendrives pendrives = new Pendrives();

        int[] expected = {3500, 2200, 3000, 2750};
        pendrives.risePriceWhereCapacity(PENDRIVE_LIST, 10, 32);
        for (int j = 0; j < PENDRIVE_LIST.size(); j++) {
            assertEquals(expected[j], PENDRIVE_LIST.get(j).getPrice());
        }
    }

}
