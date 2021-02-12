package week15d05;

public class CovidData {

    private String country;
    private double casesPerWeekPerPopulation;

    public CovidData(String country, double casesPerWeekPerPopulation) {
        this.country = country;
        this.casesPerWeekPerPopulation = casesPerWeekPerPopulation;
    }

    public String getCountry() {
        return country;
    }

    public double getCasesPerWeekPerPopulation() {
        return casesPerWeekPerPopulation;
    }
}
