package stringconcat.stringconcat;

public class Name {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and/or given name is empty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name (String familyName, String middleName, String givenName){
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and/or given name is empty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle(){
        String nameString;

        if (title != null) {
            nameString = title.getTitleString();
            nameString = nameString.concat(" ");
            nameString = nameString.concat(givenName);
        } else {
            nameString = givenName;
        }
        nameString = nameString.concat(" ");
        if (!isEmpty(middleName)) {
            nameString = nameString.concat(middleName);
            nameString = nameString.concat(" ");
        }
        nameString = nameString.concat(familyName);

        return nameString;
    }

    public String concatNameHungarianStyle(){
        String nameString;

        if (title != null) {
            nameString = title.getTitleString();
            nameString += " ";
            nameString += familyName;
        } else {
            nameString = familyName;
        }

        nameString += " ";

        if (!isEmpty(middleName)) {
            nameString += middleName;
            nameString += " ";
        }
        nameString += givenName;

        return nameString;
    }

    public boolean isEmpty(String name){
        if (name=="" || name.isBlank()){
            return true;
        } return false;
    }

}
