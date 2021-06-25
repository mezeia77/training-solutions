package lambdastream;

import java.util.stream.Stream;

public class Book {

    private String title;
    private int year;
    private int price;
    private int quantity;

    public Book(String title, int year, int price, int quantity) {
        this.title = title;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
