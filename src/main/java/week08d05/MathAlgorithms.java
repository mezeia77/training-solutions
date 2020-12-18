package week08d05;

public class MathAlgorithms {
    public int greatestCommonAdvisor (int a, int b){
        int result = 0;
        for (int i=1; i<b; i++){
            if (a%i==0 && b%i==0){
                result = i;
            }
        } return result;
    }
}
