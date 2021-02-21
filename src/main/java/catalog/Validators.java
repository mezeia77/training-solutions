package catalog;

import java.util.List;

public class Validators {

    public Validators() {
    }

    public static boolean isBlank(String s){
        return s==null || "".equals(s.trim());
    }

    public static boolean isEmpty(List<String> strings){
        return strings==null || strings.isEmpty();
    }

}
