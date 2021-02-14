package sorting;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private int id;
    private String title;
    private String author;

    @Override
    public String toString() {
        return  id + " " + title + " " + author;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
