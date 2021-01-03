package isahasa.hasa;

import isahasa.TextSource;

public abstract class TextDecorator implements TextSource {

    private TextSource textSource;

    public TextDecorator(TextSource textSource) {
        this.textSource = textSource;
    }

    protected TextSource getTextSource() {
        return textSource;
    }
}
