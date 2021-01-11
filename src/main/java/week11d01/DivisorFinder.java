package week11d01;

public class DivisorFinder {

    public int findDivisors(int n){
        String number = Integer.toString(Math.abs(n));
        int sum = 0;

        for(int i = 0; i<number.length(); i++){
            int digit = number.charAt(i)-48;
//            digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (digit == 0){
                break;
            }
            if(n%digit==0){
                sum++;
            }
        }
        return sum;
    }
}
