package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature{

    private List<String> composer = new ArrayList<>();
    private static int lenght;
    private List<String> performers = new ArrayList<>();
    private String title;

    public AudioFeatures(String title, int lenght, List<String> performers) {
        if(lenght<1){
            throw new IllegalArgumentException("Too short!");
        }
        this.lenght = lenght;
        if(new Validators().isEmpty(performers)){
            throw new IllegalArgumentException("Empty!");
        }
        this.performers = performers;
        if(new Validators().isBlank(title)){
            throw new IllegalArgumentException("Empty!");
        }
        this.title = title;
    }

    public AudioFeatures( String title,  int lenght, List<String> performers, List<String> composer) {
        this.composer = composer;
        if(lenght<1){
            throw new IllegalArgumentException("Too short!");
        }
        this.lenght = lenght;
        if(new Validators().isEmpty(performers)){
            throw new IllegalArgumentException("Empty!");
        }
        this.performers = performers;
        if(new Validators().isBlank(title)){
            throw new IllegalArgumentException("Empty!");
        }
        this.title = title;
    }
    public static int getLenght() {
        return lenght;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getComposer() {
        return composer;
    }

    public List<String> getPerformers() {
        return performers;
    }

    @Override
    public List<String> getContributors() {
        if(getComposer().size()==0){
            return getPerformers();
        } else {
            List<String> result=new ArrayList<>(getComposer());
            for (String s : getPerformers()){
                result.add(s);
            }
            return result;
        }
    }
}
