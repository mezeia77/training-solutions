package abc;

import java.text.Collator;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class NameSorter {
    public static void main(String[] args) {
        List<String> names = List.of("Ádám", "Aranka", "Ágota");
        System.out.println(names);
        Collections.sort(names, Collator.getInstance(new Locale("hu", "HU")));
        System.out.println(names);
    }
}
