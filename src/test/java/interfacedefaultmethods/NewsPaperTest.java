package interfacedefaultmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewsPaperTest {

    @Test
    public void testCreateAndAddPage() {
        NewsPaper newspaper = new NewsPaper();

        assertEquals(newspaper.getLength(), 0);

        newspaper.addPage("Page1");
        assertEquals(newspaper.getLength(),1);
        assertEquals(newspaper.getPage(0), "Page1");
        assertEquals(newspaper.getColor(0), Printable.BLACK);
    }


}
