package statements;

public class statementsMain {
    public static void main(String[] args) {

        int x = 5 + 6;
        int y = 11-x;

        int z = 8;
        boolean b = x > y;

        System.out.println(b);

        boolean c = z > 5 || b;

        System.out.println(c);

        ++z;

        System.out.println(z);
    }
}
