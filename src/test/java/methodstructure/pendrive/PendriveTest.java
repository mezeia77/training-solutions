package methodstructure.pendrive;

import methodstructure.pendrives.Pendrive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PendriveTest {
    @Test
    public void constructorShouldInitialize() {
        Pendrive pendrive = new Pendrive("Datatraveller", 32, 5000);

        assertEquals(pendrive.getName(), "Datatraveller");
        assertEquals(pendrive.getCapacity(), 32);
        assertEquals(pendrive.getPrice(), 5000);
    }

    @Test
    public void risePrice() {
        Pendrive pendrive = new Pendrive("Datatraveller", 32, 5000);

        pendrive.risePrice(10);
        assertEquals(pendrive.getPrice(), 5500);
    }

    @Test
    public void comparePricePerCapacity() {
        Pendrive pendrive = new Pendrive("Datatraveller", 32, 5000);    //0,0064
        Pendrive pendrive2 = new Pendrive("Kingston", 64, 7000);        //0,0091
        Pendrive pendrive3 = new Pendrive("Datatraveller", 32, 5001);   //0,00639

        assertEquals(pendrive.comparePricePerCapacity(pendrive2), -1);
        assertEquals(pendrive2.comparePricePerCapacity(pendrive), 1);
        assertEquals(pendrive.comparePricePerCapacity(pendrive), 0);
        assertEquals(pendrive.comparePricePerCapacity(pendrive3), 0);
    }

    @Test
    public void cheaperThan() {
        Pendrive pendrive = new Pendrive("Datatraveller", 32, 5000);
        Pendrive pendrive2 = new Pendrive("Kingston", 64, 7000);

        assertTrue(pendrive.cheaperThan(pendrive2));
        assertFalse(pendrive2.cheaperThan(pendrive));
    }
}
