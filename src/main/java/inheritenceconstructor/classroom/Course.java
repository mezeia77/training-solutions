package inheritenceconstructor.classroom;

public class Course {

    private int participants;
    Facility facilityNeeded;

    public Course(int participants, Facility facilityNeeded) {
        this.participants = participants;
        this.facilityNeeded = facilityNeeded;
    }

    public int getParticipants() {
        return participants;
    }

    public Facility getFacilityNeeded() {
        return facilityNeeded;
    }
}
