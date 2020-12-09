package week07d02;

public class DigitSum {

    public int sumOfDigits(int x){
        int result=0;
        x=Math.abs(x);

        while (x>=1){
            result = result+x%10;
            x=x/10;

        } return result;
    }
}
