package lambdaintro;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.List;


public class FamilyBirthdays {

    private List<LocalDate> birthdays;

    public FamilyBirthdays(LocalDate... birthdays) {
        this.birthdays = List.of(birthdays);
    }


    public boolean isFamilyBirthday(TemporalAccessor date){
        int month = date.get(ChronoField.MONTH_OF_YEAR);
        int day = date.get(ChronoField.DAY_OF_MONTH);

        for(LocalDate birthday : birthdays){
            if((birthday.getDayOfMonth() == day) && (birthday.getMonthValue() == month)){
                return true;
            }
        }
        return false;
    }

    public int nextFamilyBirthday (TemporalAccessor date){
        int year = date.get(ChronoField.YEAR);
        LocalDate base = LocalDate.of(year, date.get(ChronoField.MONTH_OF_YEAR), date.get(ChronoField.DAY_OF_MONTH));

        int min = Integer.MAX_VALUE;

        for(LocalDate birthday: birthdays){
            LocalDate nextBirthday = birthday.withYear(year);
            if(nextBirthday.isBefore(base)){
                nextBirthday = birthday.withYear(year+1);
            }
            int diff = (int) ChronoUnit.DAYS.between(base, nextBirthday);
            if(min > diff){
                min = diff;
            }
        }
        return min;
    }

}
