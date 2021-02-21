package catalog;

public class SearchCriteria {

    public String contributor;
    public String title;
    private static String contributorOrTitle;

    public SearchCriteria(String title, String contributor) {
        if(new Validators().isBlank(title) || new Validators().isBlank(contributor)){
            throw new IllegalArgumentException("Empty");
        }
        this.contributor = contributor;
        this.title = title;
    }

    public SearchCriteria(String s) {
        if(new Validators().isBlank(s)){
            throw new IllegalArgumentException("Empty");
        }
        if(contributorOrTitle.equals("c")){
            this.contributor = s;
        }
        if(contributorOrTitle.equals("t")) {
            this.title = s;
        }
    }


    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public boolean hasContributor(){
        boolean b = new Validators().isBlank(contributor);
        return !b;
    }

    public boolean hasTitle(){
        boolean b = new Validators().isBlank(title);
        return !b;
    }

    public static SearchCriteria createByBoth(String contributor, String title){
        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByContributor(String contributor){
        contributorOrTitle = "c";
        return new SearchCriteria(contributor);
    }

    public static SearchCriteria createByTitle(String title){
        contributorOrTitle = "t";
        return new SearchCriteria(title);
    }
}
