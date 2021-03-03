package vaccination;

public class City {
    private String ZIP;
    private String city;
    private String city_part;

    public City(String ZIP, String city, String city_part) {
        this.ZIP = ZIP;
        this.city = city;
        this.city_part = city_part;
    }

    public String getZIP() {
        return ZIP;
    }

    public String getCity() {
        return city;
    }

    public String getCity_part() {
        return city_part;
    }

    @Override
    public String toString() {
        return "City{" +
                "ZIP='" + ZIP + '\'' +
                ", city='" + city + '\'' +
                ", city_part='" + city_part + '\'' +
                '}';
    }
}
