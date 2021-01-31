package week13d05;

import java.util.TreeSet;

public class LetterCounterWithTreeSet {

    public int countLetters(String word){
        if(!isEmpty(word)){
            throw new IllegalArgumentException("Empty file");
        }

        TreeSet<Character> letters = new TreeSet<>();
        String temp = word.strip();
        for (int i = 0; i<temp.length(); i++){
            if(temp.charAt(i)>='a' && temp.charAt(i)<='z') {
                letters.add(temp.charAt(i));
            }
        }

        return letters.size();
    }

    private boolean isEmpty(String s){
        return s != null && !"".equals(s.trim());
    }
}
