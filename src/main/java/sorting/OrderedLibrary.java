package sorting;

import week15d04.CoronaData;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class OrderedLibrary {

    private static Set<Book> library = new TreeSet<>();

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

    public Book lendFirstBook(){
        Iterator<Book> bookIterator = library.iterator();
        if(bookIterator.hasNext()){
            return bookIterator.next();
        }
        throw new NullPointerException("Library is empty!");
    }
    
    public static void main(String[] args) {
        new OrderedLibrary().readFile("books.csv");
        System.out.println(library);
        List<Book> books = new ArrayList<>(library);
        Collections.shuffle(books);
        System.out.println(books);
        System.out.println(new OrderedLibrary().lendFirstBook());
    }
}
