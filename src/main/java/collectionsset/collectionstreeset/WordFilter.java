package collectionsset.collectionstreeset;

import java.util.Set;
import java.util.TreeSet;

public class WordFilter {
    public Set<String> filterWords(String[] randomStrings){
        Set<String> orderedStrings = new TreeSet<>();
        for (String s:randomStrings){
            orderedStrings.add(s);
        }
        return orderedStrings;
    }
}
