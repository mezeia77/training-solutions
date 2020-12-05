package stringbasic;

import java.time.LocalDate;

public class Pet {

    private String name;
    private LocalDate date;
    private Gender gender;
    private String id;

    public Pet(String name, LocalDate date, Gender gender, String id) {
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getId() {
        return id;
    }
}
