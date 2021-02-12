package week15d04;

public class CoronaData implements Comparable<CoronaData>{
    private String yearWeek;
    private int casesWeekly;

    public CoronaData(String yearWeek, int casesWeekly) {
        this.yearWeek = yearWeek;
        this.casesWeekly = casesWeekly;
    }

    public String getYearWeek() {
        return yearWeek;
    }

    public int getCasesWeekly() {
        return casesWeekly;
    }

    @Override
    public String toString() {
        return "CoronaData{" +
                "yearWeek='" + yearWeek + '\'' +
                ", casesWeekly=" + casesWeekly +
                '}';
    }

    @Override
    public int compareTo(CoronaData o) {
        return o.casesWeekly-this.casesWeekly;
    }
}
