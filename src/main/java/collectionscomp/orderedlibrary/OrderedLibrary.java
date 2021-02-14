package collectionscomp.orderedlibrary;

import java.text.Collator;
import java.util.*;

public class OrderedLibrary {
    private List<Book> libraryBooks;

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> orderedByTitle(){
    List<Book> books = new ArrayList<>(libraryBooks);
    Collections.sort(books);
    return books;
    }


    public List<Book> orderedByAuthor(){
        List<Book> books = new ArrayList<>(libraryBooks);
        Collections.sort(books, new AuthorComparator());
        return books;
    }

    public class AuthorComparator implements Comparator<Book>{
        @Override
        public int compare (Book o1, Book o2){
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    }

    public List<String> orderedByTitleLocale(Locale locale){
        List<Book> books = new ArrayList<>(libraryBooks);
        List<String> titles = new ArrayList<>();
        for (Book book : books){
            titles.add(book.getTitle());
        }
        Collections.sort(titles, Collator.getInstance(locale));
        return titles;
    }
}
