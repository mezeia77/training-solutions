package vaccination;

import java.time.LocalDate;
import java.time.temporal.TemporalAmount;

public class Citizen {

    private String fullName;
    private String ZIP;
    private int year_of_birth;
    private String TAJ;
    private String email;
    private int numberOfVaccination;
    private LocalDate lastVaccination;

    public Citizen(String fullName, String ZIP, int year_of_birth, String TAJ) {
        this.fullName = fullName;
        this.ZIP = ZIP;
        this.year_of_birth = year_of_birth;
        this.TAJ = TAJ;
        this.email = "email";
    }

    public Citizen(String fullName, String ZIP, int year_of_birth, String TAJ, String email) {
        this.fullName = fullName;
        this.ZIP = ZIP;
        this.year_of_birth = year_of_birth;
        this.TAJ = TAJ;
        this.email = email;
    }

    public Citizen(String fullName, String ZIP, int year_of_birth, String TAJ, String email, int numberOfVaccination, LocalDate lastVaccination) {
        this.fullName = fullName;
        this.ZIP = ZIP;
        this.year_of_birth = year_of_birth;
        this.TAJ = TAJ;
        this.email = email;
        this.numberOfVaccination = numberOfVaccination;
        this.lastVaccination = lastVaccination;
    }

    public String getFullName() {
        return fullName;
    }

    public String getZIP() {
        return ZIP;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public String getTAJ() {
        return TAJ;
    }

    public String getEmail() {
        return email;
    }

    public int getNumberOfVaccination() {
        return numberOfVaccination;
    }

    public LocalDate getLastVaccination() {
        return lastVaccination;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "fullName='" + fullName + '\'' +
                ", ZIP='" + ZIP + '\'' +
                ", year_of_birth=" + year_of_birth +
                ", TAJ='" + TAJ + '\'' +
                ", email='" + email + '\'' +
                ", numberOfVaccination=" + numberOfVaccination +
                ", lastVaccination=" + lastVaccination +
                '}';
    }
}
