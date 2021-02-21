package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature{
    private List<String> authors;
    private static int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if(new Validators().isEmpty(authors)){
            throw new IllegalArgumentException("Empty!");
        }
        this.authors = authors;
        if(numberOfPages<1){
            throw new IllegalArgumentException("Too short!");
        }
        this.numberOfPages = numberOfPages;
        if(new Validators().isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }
        this.title = title;
    }

    public static int getNumberOfPages() {
        return numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getContributors() {
        return authors;
    }
}
