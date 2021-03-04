package vaccination;

import java.time.LocalDate;

public class Vaccine {

    private int vaccination_id;
    private int citizen_id;
    private LocalDate vaccination_date;
    private String status;
    private String note;
    private String vaccination_type;

    public Vaccine(int vaccination_id, int citizen_id, LocalDate vaccination_date, String status, String note, String vaccination_type) {
        this.vaccination_id = vaccination_id;
        this.citizen_id = citizen_id;
        this.vaccination_date = vaccination_date;
        this.status = status;
        this.note = note;
        this.vaccination_type = vaccination_type;
    }

    public int getVaccination_id() {
        return vaccination_id;
    }

    public int getCitizen_id() {
        return citizen_id;
    }

    public LocalDate getVaccination_date() {
        return vaccination_date;
    }

    public String getStatus() {
        return status;
    }

    public String getNote() {
        return note;
    }

    public String getVaccination_type() {
        return vaccination_type;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "vaccination_id=" + vaccination_id +
                ", citizen_id=" + citizen_id +
                ", vaccination_date=" + vaccination_date +
                ", status=" + status +
                ", note='" + note + '\'' +
                ", vaccination_type='" + vaccination_type + '\'' +
                '}';
    }
}
