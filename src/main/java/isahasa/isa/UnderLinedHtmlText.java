package isahasa.isa;

import isahasa.HtmlText;

public class UnderLinedHtmlText extends HtmlText {

    public UnderLinedHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        return "<u>" + super.getPlainText() + "</u>";
    }
}
