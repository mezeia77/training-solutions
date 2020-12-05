package week05d05;

public class User {


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


