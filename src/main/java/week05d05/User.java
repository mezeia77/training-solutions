package week05d05;

public class User {

    private String firstName;
    private String lastName;
    private String email;

    /*public User (String firstName, String lastName, String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }*/

    public String fullName(String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }

    public boolean isValidEmail(String email){
        if(!email.contains(".") || !email.contains("@")){
            return false;
        }
        return true;
    }
}


