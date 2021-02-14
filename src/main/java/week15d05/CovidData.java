package week15d05;

public class CovidData {

    private String country;
    private double casesPerWeek;

    public CovidData(String country, double casesPerWeek) {
        this.country = country;
        this.casesPerWeek = casesPerWeek;
    }

    public String getCountry() {
        return country;
    }

    public double getCasesPerWeek() {
        return casesPerWeek;
    }

    @Override
    public String toString() {
        return "CovidData{" +
                "country='" + country + '\'' +
                ", casesPerWeek=" + casesPerWeek +
                '}';
    }
}
