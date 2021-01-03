package isahasa.isa;

import isahasa.HtmlText;

public class ItalicBoldHtmlText extends HtmlText {

    public ItalicBoldHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        return "<i><b>" + super.getPlainText() + "</b></i>";
    }
}
