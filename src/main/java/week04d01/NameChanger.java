package week04d01;

public class NameChanger {

    private String fullName;

    public NameChanger(String fullName) {
        if (isEmpty(fullName)){
            throw new IllegalArgumentException("Name empty!");
        }
        this.fullName = fullName;
    }

    public boolean isEmpty (String s){
        return (s==null || "".equals(s.trim()));
    }

    public String getFullName() {
        return fullName;
    }

    public String changeFirstName(String firstName) {
        int spacePosition = fullName.indexOf(" ");
        String givenName = fullName.substring(spacePosition+1);
        return firstName + " " + givenName;

    }
}
