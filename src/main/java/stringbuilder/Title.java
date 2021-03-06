package stringbuilder;

public enum Title {
    MR("Mr."), MRS("Mrs."), MS("Ms."), DR("Dr."), PROF("Prof."), DIPLENG("Dipl.Eng.");

    private final String titleString;

    Title(String titleString) {
        this.titleString = titleString;
    }

    public String getTitleString() {
        return titleString;
    }
}
