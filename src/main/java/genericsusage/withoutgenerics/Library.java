package genericsusage.withoutgenerics;

import exceptionclass.bank.Bank;
import genericsusage.Book;

import java.util.List;

public class Library {

    public Book getFirstBook(List bookList){
        if (bookList == null) {
            throw new NullPointerException("Argument should not be null!");
        }
        if (bookList.isEmpty()) {
            throw new IllegalArgumentException("Argument should not be empty!");
        }

        Object o = bookList.get(0);
        if(!(o instanceof Book)) {
            throw new ClassCastException("Not a book");
        }
        return (Book) o;
    }
}
