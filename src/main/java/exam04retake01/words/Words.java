package exam04retake01.words;

public class Words {
    public boolean hasMoreDigits(String s) {
        int counter = 0;
        for (int i = 0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                counter++;
            }
        }
        return counter>s.length()/2;
    }
}
