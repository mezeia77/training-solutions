package clone.timesheet;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeSheetItem {

    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem item) {
        this.employee = item.employee;
        this.project = item.project;
        this.from = item.from;
        this.to = item.to;

    }

    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public static TimeSheetItem withDifferentDay(TimeSheetItem item, LocalDate localDate){
        TimeSheetItem newTimeSheetItem = new TimeSheetItem(item);
        newTimeSheetItem.from = LocalDateTime.of(localDate, newTimeSheetItem.from.toLocalTime());
        newTimeSheetItem.to = LocalDateTime.of(localDate, newTimeSheetItem.to.toLocalTime());
        return newTimeSheetItem;
    }
}