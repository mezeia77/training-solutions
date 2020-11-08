package array;

public class ArrayMain {
    public static void main(String[] args) {

        String[] days = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println(days[1]);
        System.out.println(days.length);

        int[] square = new int[5];
        square[0] = 1;
        System.out.println(square[0]);

        for (int i=1; i<5; i++){
            square[i] = square[i-1]*2;
            System.out.println(square[i]);
        }

        boolean[] bool = new boolean[6];
        for (int i=0; i< bool.length; i++){
            if (i%2 == 0) {
                bool[i] = false;
            } else {
                bool[i] = true;
            }
            System.out.println(i + ": " + bool[i]);

        }
    }

}
