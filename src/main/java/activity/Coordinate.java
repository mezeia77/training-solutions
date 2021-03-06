package activity;

public class Coordinate {

    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        if(latitude<-90 || latitude > 90){
            throw new IllegalArgumentException("Invalid data, must be between -90...90");
        }

        if(longitude<-180 || longitude > 180){
            throw new IllegalArgumentException("Invalid data, must be between -180...180");
        }

        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
