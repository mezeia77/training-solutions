package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Books {

    List<String> titles = new ArrayList<>();

    public void add(String title) {
        titles.add(title);
    }

    public List<String> findAllByPrefix(String prefix){
        List<String> found = new ArrayList<>();
        for (String title : titles) {
            if (title.startsWith(prefix)) {
                found.add(title);
            }
        }
        return found;

    }

    public List<String> getTitles(){
        return titles;
    }

    public void removeByPrefix(String prefix) {
        List<String> remove = new ArrayList<>();
        for (String title : titles) {
            if (title.startsWith(prefix)) {
                remove.add(title);
            }
        }
        titles.removeAll(remove);
    }

    public static void main(String[] args) {
        Books books = new Books();

        books.add("Made in Japan");
        books.add("Kétévi vakáció");

        System.out.println(books.getTitles());
        System.out.println(books.findAllByPrefix("Made"));

        books.removeByPrefix("Ma");
        System.out.println(books.getTitles());

    }
}