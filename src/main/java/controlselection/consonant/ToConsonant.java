package controlselection.consonant;

public class ToConsonant {

    private String abc = "abcdefghijklmnopqrstuvwxyz";

    public int position (char a){
        return abc.indexOf(a);
    }

    public boolean isVowel (char a){
        switch (a) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public char toConsonant(char a){
        if (isVowel(a)){
            return abc.charAt((position(a)+1));
        } return a;
    }

    //István:
    public static final String VOWELS = "aeiou";

    public char convertToConsonant(char c) {
        if (VOWELS.indexOf(c) >= 0) {
            return (char) (c + 1);
        }
        else {
            return c;
        }
    }
}
