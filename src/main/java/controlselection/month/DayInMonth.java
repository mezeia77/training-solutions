package controlselection.month;

public class DayInMonth {


    public boolean isLeapYear(int year){
        if (year%4==0 && year%100!=0 || year%400==0){
            return true;
        } return false;

    }

    public int numberOfDays(int year, String month){
        int result;
        switch (month.toLowerCase()){
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                result = 31;
                break;
            case "április":
            case "június":
            case "szeptember":
            case "november":
                result = 30;
                break;
            case "február":
                if (isLeapYear(year)){
                    result = 29;
                } else {
                    result = 28;
                }
                break;
            default: throw new IllegalArgumentException("Unknown month");

        } return result;

    }

}

