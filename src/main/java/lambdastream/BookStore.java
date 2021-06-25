package lambdastream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookStore {

    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public int getNumberOfBooks() {
        return books.stream().reduce(0, (a, b)->a+b.getQuantity(), (x,y)->x+y);
//        return books.stream().reduce(0, (a, b)->a+b/.getQuantity(), Integer::sum);
//        int result = 0;
//        for (Book book:books){
//            result+=book.getQuantity();
//        }
//        return result;
    }


    public Optional<Book> findNewestBook() {
//        return books.stream().max(Comparator.comparingInt(Book::getYear));
        return books.stream().max((a,b)->a.getYear()-b.getYear());
    }

    public int getTotalValue() {
        return books.stream().reduce(0, (a,b)->a+b.getPrice()*b.getQuantity(), (x,y)->x+y);
//        return books.stream().reduce(0, (a,b)->a+b.getPrice()*b.getQuantity(), Integer::sum);
    }

    public List<Book> getByYearOfPublish(int year) {
        List<Book> result = new ArrayList<>();
        return books.stream().collect(Collectors.groupingBy(Book::getYear)).get(year);
    }
}
