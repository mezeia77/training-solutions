package ioreadstring.names;

public class Human {

    private String familyName;
    private String givenName;

    public Human(String givenName, String familyName) {
        this.familyName = familyName;
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getGivenName() {
        return givenName;
    }
}
