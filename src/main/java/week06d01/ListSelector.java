package week06d01;

import java.util.List;

public class ListSelector {

    //List<String> text = new ArrayList<>();

    public String selector (List<String> text) {

        StringBuilder found = new StringBuilder();

        if (text == null) {
            throw new IllegalArgumentException("Must not be null");
        }

        if (text.size() != 0) {
            found.append("[");
            for (int i = 0; i < text.size(); i+=2) {
                found.append(text.get(i));
            } found.append("]");

        } return found.toString();
    }
}
