package week09d02;

public class FibCalculator {

    public static long sumEvens (int bound){

        long result = 0;
        long F = 0;
        long prev = 1;
        long next;


        for (long i = 1; i < bound; i++){
            next = F + prev;

            if(F%2 == 0){
                result +=F;
            }

            prev = F;
            F = next;

        } return result;
    }

    public static void main(String[] args) {
        System.out.println(sumEvens(11));
    }

}
