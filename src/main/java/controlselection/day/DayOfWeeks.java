package controlselection.day;

public class DayOfWeeks {

    public String dayOfWeek(String day) {
        String result;

        switch (day.toLowerCase()) {
            case "hétfő":
                result = "hét eleje";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                result = "hét közepe";
                break;
            case "péntek":
                result = "majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                result = "hétvége";
                break;
            default:
                throw new IllegalArgumentException("no such day");

        }
        return result;

    }

}
