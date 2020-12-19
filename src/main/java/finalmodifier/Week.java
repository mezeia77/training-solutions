package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {

    public static List<String> DAYS = Arrays.asList("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY");

    public static void main(String[] args) {
        DAYS.set(1, "Szerda");

        System.out.println(DAYS);
    }

}
