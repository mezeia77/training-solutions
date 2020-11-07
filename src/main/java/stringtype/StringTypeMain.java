package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";

        String message = prefix + name;
        message = message + 444;


        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");

        String x = "";
        String y = "";
        String z = x+y;

        System.out.println("Message: " + message);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("Z: " + z);

        String abcde = "Abcde";
        System.out.println("Abcde hossza: " + abcde.length());
        System.out.println("1., 3. " + abcde.substring(0, 1) + "," + abcde.substring(2, 3));
        System.out.println("1-3: " + abcde.substring(0, 3));
    }
}
