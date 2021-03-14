package exam03retake01;

public class CdvCheck {

    public boolean check(String s) {
        if(s.length()!=10){
            throw new IllegalArgumentException("Length must be 10");
            }
        int sum = 0;
        for(int i = 0; i<s.length()-1; i++){
            if (s.charAt(i) < 48 || s.charAt(i) > 57) {
                throw new IllegalArgumentException("Only numbers allowed");
                }
            sum += (i+1)*Character.getNumericValue(s.charAt(i));
            }
        int result = sum%11;
        return result==Character.getNumericValue(s.charAt(9));
        }
}
