package primitivetypes;

public class PrimitiveTypes {

    public String toBynaryString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n < 0) {
            return "Invalid number";
        }
            do {
                sb.append(n % 2);
                if(n%2==1){
                    n-=1;
                }
                n=n/2;
            } while (n > 0);

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int number = 500032;
        PrimitiveTypes pt = new PrimitiveTypes();
        System.out.println(pt.toBynaryString(number));
        System.out.println(Integer.toBinaryString(number));
        System.out.println(new Integer(1) + new Integer(2));
    }
}
