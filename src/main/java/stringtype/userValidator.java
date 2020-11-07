package stringtype;

public class userValidator {

    private String username;
    private String password1;
    private String password2;
    private String email;

    public userValidator (String username, String password1, String password2, String email){
        this.username = username;
        this.password1 = password1;
        this.password2 = password2;
        this.email = email;

    }

    public boolean isValidUserName(String username){
        return username.length()>=1;
    }

    public boolean pswLenght(String password1){
        return password1.length()>=8;
    }

    public boolean pswEquals(String password1, String password2){
        return password1.equals(password2);
    }

    public boolean isValidEmail(String email){
        int whereAtExists = email.indexOf("@");
        int whereDotExists = email.indexOf('.');
        return whereAtExists > 0
                && whereDotExists > whereAtExists+1
                && whereDotExists != email.length()-1;

    }
}
