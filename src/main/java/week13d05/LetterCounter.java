package week13d05;

public class LetterCounter {

    public int countLetters(String word){
        if(!isEmpty(word)){
            throw new IllegalArgumentException("Empty file");
        }

        int result = 0;
        for (int position:arrayFill(word)){
            if(position>0){
                result++;
            }
        }
        return result;
    }

    private boolean isEmpty(String s){
        return s != null && !"".equals(s.trim());
    }

    private int[] arrayFill(String s){
        int[] letters = new int[100];
        for (int i = 0; i<s.length(); i++){
            char c = s.toUpperCase().charAt(i);
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                letters[c]++;
            }
        }
        return letters;
    }
}
