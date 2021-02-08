package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

    private Set<Book> libraryBooks;

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber){
        Iterator<Book> bookIterator = libraryBooks.iterator();
        Book result;
        while (bookIterator.hasNext()){
            result=bookIterator.next();
            if(result.getRegNumber()==regNumber){
                return result;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public int libraryBooksCount() {
        return libraryBooks.size();
    }

    public int removeBookByRegNumber(int regNumber){
        Iterator<Book> bookIterator = libraryBooks.iterator();
        while (bookIterator.hasNext()){
            if(bookIterator.next().getRegNumber()==regNumber){
                bookIterator.remove();
                return regNumber;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }


    public Set<Book> selectBooksByAuthor(String author){
        Iterator<Book> bookIterator = libraryBooks.iterator();
        Set<Book> bookSet = new HashSet<>();
        Book foundBook;
        while (bookIterator.hasNext()){
            foundBook = bookIterator.next();
            if(foundBook.getAuthor().equals(author)){
                bookSet.add(foundBook);
            }
        }
        if(bookSet.isEmpty()){
            throw new MissingBookException("No books found by " + author);
        }
        return bookSet;
    }
}
