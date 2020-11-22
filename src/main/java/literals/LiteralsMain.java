package literals;

public class LiteralsMain {
    public static void main(String[] args) {

        int a=1;
        int b=2;

        System.out.println(a+b);
        System.out.println(1+2);
        System.out.println("1"+"2");
        System.out.println(1 + "" + 2);

        double quotient = 3/4F;
        System.out.println(quotient);

        long big = 3_244_444_444L;
        System.out.println(big);

        String s = "árvíztűrőtükörfúrógép";
        System.out.println(s);

        String word ="TITLE".toLowerCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
        System.out.println(Integer.toBinaryString(8));
    }

}
