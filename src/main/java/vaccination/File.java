package vaccination;

import java.time.LocalTime;

public class File {

    private LocalTime time;
    private String name;
    private String ZIP;
    private int year_of_birth;
    private String email;
    private String TAJ;


    public File(LocalTime time, String name, String ZIP, int year_of_birth, String email, String TAJ) {
        this.time = time;
        this.name = name;
        this.ZIP = ZIP;
        this.year_of_birth = year_of_birth;
        this.email = email;
        this.TAJ = TAJ;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getZIP() {
        return ZIP;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public String getEmail() {
        return email;
    }

    public String getTAJ() {
        return TAJ;
    }

    @Override
    public String toString() {
        return  time + ";" +
                name + ";" +
                ZIP  + ";" +
                year_of_birth + ";" +
                email + ";" +
                TAJ + ";" + "\n";
    }
}
