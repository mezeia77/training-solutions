package collectionsclass;

import sorting.Book;
import sorting.OrderedLibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class CollectionsManager {

    private static List<Book> library = new ArrayList<>();

    private void readFile(String filename) {
        Path file = Path.of("src/main/resources/searching" + "\\" + filename);
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(";");
                library.add(new Book(Integer.parseInt(temp[0]), temp[1], temp[2] ));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't find file");
        }
    }

    public List<Book> createUnmodifiableLibrary() //módosíthatatlan listát eredményez
    {
    return Collections.unmodifiableList(library);
    }

    public List<Book> reverseLibrary() //az eredeti lista másolatán dolgozik!
    {
        List<Book> reverse = new ArrayList<>(library);
        Collections.reverse(reverse);
        return reverse;
    }

    public Book getFirstBook() //a legrégebbi (legkisebb id) könyvet adja vissza
    {
    return Collections.min(library);
    }

    public Book getLastBook() // a legújabb (legnagyobb id) könyvet adja vissza
    {
        return Collections.max(library);
    }
    public static void main(String[] args) {
        new CollectionsManager().readFile("books.csv");
        System.out.println(library);
    }
}
