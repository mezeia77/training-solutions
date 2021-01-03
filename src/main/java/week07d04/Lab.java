package week07d04;

import java.time.LocalDate;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDate copletedAt;

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getCopletedAt() {
        return copletedAt;
    }

    public Lab(String title) {
        this.title = title;
        this.completed = false;
    }

    public Lab(String title, LocalDate copletedAt) {
        this.title = title;
        this.completed = true;
        this.copletedAt = copletedAt;
    }

    public void complete(LocalDate copletedAt) {
        this.completed = true;
        this.copletedAt = copletedAt;
    }

    public void complete() {
        this.completed = true;
        this.copletedAt = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Lab{" +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", copletedAt=" + copletedAt +
                '}';
    }

}
