package recursion;

public class FactorialCalculator {

    public long getFactorial(int n) {
        if(n > 1) {
            long solution = getFactorial(n - 1);
            return n * solution;
        } else {
            return 1;
        }
    }

}
