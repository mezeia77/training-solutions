package week05d02;


import java.util.Arrays;
import java.util.List;

public class ChangeLetter {

    private static final List<String> LETTERS= Arrays.asList("a", "e", "i", "o", "u");

    public String changeVowels(String text){
        text=text.toLowerCase();

        for (int i=0; i< LETTERS.size();i++){
            text=text.replaceAll(LETTERS.get(i), "*");
            }
        return text;
        }
    }
