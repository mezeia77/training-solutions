package interfacedefaultmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoryBookTest {
    @Test
    public void testCreateAndAddPage() {
        StoryBook storyBook = new StoryBook();

        assertEquals(storyBook.getLength(), 0);

        storyBook.addPages("Page1", Printable.BLACK);
        storyBook.addPages("Page2", "#FF0000");
        assertEquals(storyBook.getLength(),2);
        assertEquals(storyBook.getPage(0), "Page1");
        assertEquals(storyBook.getColor(0), Printable.BLACK);
        assertEquals(storyBook.getPage(1), "Page2");
        assertEquals(storyBook.getColor(1), "#FF0000");
    }
}
