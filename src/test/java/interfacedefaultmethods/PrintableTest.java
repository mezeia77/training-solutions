package interfacedefaultmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintableTest {
    @Test
    public void testGetColorWithDefaultImplementation() {
        Printable printable = new TestPrintable();
        assertEquals(printable.getColor(0),Printable.BLACK);
    }
}
