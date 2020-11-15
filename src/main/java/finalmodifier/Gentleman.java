package finalmodifier;

public class Gentleman {

    private static final String MESSAGE_PREFIX="Mr/Mrs.";

    public static String sayHello(String name){
        String sum = MESSAGE_PREFIX + " " + name;
        return sum;
    }

    public static void main(String[] args) {

        Gentleman gentleman = new Gentleman();

        System.out.println(Gentleman.sayHello("zsombor"));


    }
}
