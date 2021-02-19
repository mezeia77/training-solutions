package week15d03;

import java.time.LocalDate;

public class Post {

    private String title;
    private LocalDate publishedAt;
    private String content;
    private String owner;

    public Post(String title, LocalDate publishedAt, String content, String owner) {
        if(isNullOrEmpty(title)){
            throw new IllegalArgumentException("Empty or null not allowed");
        }
        this.title = title;
        this.publishedAt = publishedAt;
        if(isNullOrEmpty(content)){
            throw new IllegalArgumentException("Empty or null not allowed");
        }
        this.content = content;
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getPublishedAt() {
        return publishedAt;
    }

    public String getContent() {
        return content;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isNullOrEmpty(String s){
        return s == null || "".equals(s.strip());
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", publishedAt=" + publishedAt +
                ", content='" + content + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
