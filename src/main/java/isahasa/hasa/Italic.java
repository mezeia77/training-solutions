package isahasa.hasa;

import isahasa.TextSource;

public class Italic extends TextDecorator{

    public Italic(TextSource textSource) {
        super(textSource);
    }

    @Override
    public String getPlainText() {
        return "<i>" + getTextSource().getPlainText() + "</i>";
    }
}
