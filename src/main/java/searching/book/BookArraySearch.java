package searching.book;

public class BookArraySearch {

    private Book[] bookArray;

    public BookArraySearch(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book findBookByAuthorTitle(String author, String title){
        if(isEmpty(author) || isEmpty(title)){
            throw new IllegalArgumentException("Empty data");
        }
        for(Book book:bookArray){
            if(book.getAuthor().equals(author) && book.getTitle().equals(title)){
                return new Book(book.getId(),  book.getTitle(), book.getAuthor());
            }
        }
        throw new IllegalArgumentException("No book found by " + author + " with title " + title);
//        Book key = new Book(author, title);
//        Arrays.sort(bookArray);
//        int index = Arrays.binarySearch(bookArray, key);
//        if(index<0){
//            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
//        }
//        return bookArray[index];
    }

    private boolean isEmpty(String s){
        return s == null || "".equals(s.trim());
    }
}
