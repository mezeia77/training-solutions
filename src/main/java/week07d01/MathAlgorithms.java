package week07d01;

public class MathAlgorithms {

    public boolean isPrime(int x){

        if (x<2){
            throw new IllegalArgumentException("min. 2");
        }

        for (int y=2; y<=(x/2); y++){
                if (x%y==0){
                    return false;
                }
            }
        return true;


    }

}
