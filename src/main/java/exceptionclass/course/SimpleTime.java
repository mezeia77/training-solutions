package exceptionclass.course;

public class SimpleTime {
    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        setTime(hour, minute);
    }

    public SimpleTime(String time){
        if(time.isEmpty() || time==null){
            throw new InvalidTimeException("No time");
        }
        if(time.length()!="hh:mm".length() || time.charAt(2)!=':'){
            throw new InvalidTimeException("Invalid time format");
        }

        String[] timePart =time.split(":");
        int hour;
        int minute;

        try {
            hour = Integer.parseInt(timePart[0]);
            minute = Integer.parseInt(timePart[1]);
        } catch (NumberFormatException nfe){
            throw new InvalidTimeException("Hour and minute must be numbers");
        }
        setTime(hour, minute);
    }

    private void setTime(int hour, int minute){
        if(hour<0 || hour>23){
            throw new IllegalStateException("Hour must be 0-23");
        }
        if(minute<0 || minute>59){
            throw new IllegalStateException("Minute must be 0-59");
        }
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
