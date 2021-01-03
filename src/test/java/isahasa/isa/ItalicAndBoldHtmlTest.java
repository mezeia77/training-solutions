package isahasa.isa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItalicAndBoldHtmlTest {

    @Test
    public void getBytes() throws Exception {
        ItalicBoldHtmlText italicBoldHtmlText = new ItalicBoldHtmlText("asd");

        assertEquals(italicBoldHtmlText.getPlainText() , "<i><b>asd</b></i>");
    }
}
