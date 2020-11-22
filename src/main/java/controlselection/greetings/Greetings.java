package controlselection.greetings;

public class Greetings {

   public String greet (int hour, int min) {

        int minuteOfTheDay = hour*60+min;

            if (minuteOfTheDay > 5*60 && minuteOfTheDay <= 9*60) {
                return "Jó reggelt!";
            } else if (minuteOfTheDay > 9*60 && minuteOfTheDay <= 18*60+30) {
                return "Jó napot!";
            } else if (minuteOfTheDay > 18*60+30 && minuteOfTheDay <= 20*60) {
                return "Jó estét!";
            } else  {
                return "Jó éjt!";
            }

        }

}
