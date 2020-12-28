package stringconcat.stringconcat;

public enum Title {
Mr("Mr."), Ms("Ms."), Dr("Dr."), Eng("Eng"), Prof("Prof");

    private String titleString;

    Title(String titleString) {
        this.titleString = titleString;
    }

    public String getTitleString() {
        return titleString;
    }
}
