package interfacedefaultmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest {
    @Test
    public void printNewsPaper() {
        NewsPaper newspaper = new NewsPaper();
        newspaper.addPage("Page1");
        //assertEquals(new Printer().print(newspaper), "Page1\n");
    }

    @Test
    public void printStoryBook() {
        StoryBook storyBook = new StoryBook();
        storyBook.addPages("Page1", Printable.BLACK);
        storyBook.addPages("Page2", "#ff0000");

        assertEquals(new Printer().print(storyBook), "Page1\n[#ff0000]Page2\n");
    }
}
