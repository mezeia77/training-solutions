package timesheet;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeSheetItem {
    private Employee employee;
    private Project project;
    private LocalDateTime beginDate;
    private LocalDateTime endDate;

    public TimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {
        this.employee = employee;
        this.project = project;
        if(!beginDate.toLocalDate().equals(endDate.toLocalDate())){
            throw new IllegalArgumentException("Begin & end must be at the same day");
        }
        if(beginDate.isAfter(endDate)){
            throw new IllegalArgumentException("Begind date must be earlier than end date");
        }
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Project getProject() {
        return project;
    }

    public LocalDateTime getBeginDate() {
        return beginDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public long hoursBetweenDates(){
        return Duration.between(getBeginDate(), getEndDate()).toHours();
    }

    @Override
    public String toString() {
        return "TimeSheetItem{" +
                "employee=" + employee +
                ", project=" + project +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                '}';
    }
}
