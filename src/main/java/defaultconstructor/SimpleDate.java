package defaultconstructor;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day){
        if (!isCorrect(year, month, day)){
            throw new IllegalArgumentException("Invalid date: " + year + month + day);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private boolean isCorrect(int year, int month, int day){
        if (year<1900 || year > 2021 || day<1 || day>31){
            return false;
        }
        int monthLenght = calculateMonthLength(year, month);
        if ( month < 1 || month > monthLenght){
            return false;
        }
        return true;
    }

    private boolean isLeapYear(int year){
        if (year%400==0 || (year%4==0 && year%100!=0)){
            return true;
        }
         return false;
    }

    private int calculateMonthLength(int year, int month){
        if (month==4 || month==6 || month==9 || month==11){
            return 30;
        }
        if (month==2 && isLeapYear(year)){
            return 29;
        }
        if (month==2 && !isLeapYear(year)){
            return 28;
        }
        return 31;
    }
}
