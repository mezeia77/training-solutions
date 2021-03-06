package activity;

public class TrackPoint {

    private Coordinate coordinate;
    private double elevation;
    private final int KILO = 1000;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }

    public double getDistanceFrom(TrackPoint trackPoint){
        double lon1 = trackPoint.getCoordinate().getLongitude();
        double lon2 = getCoordinate().getLongitude();
        double lat1 = trackPoint.getCoordinate().getLatitude();
        double lat2 = getCoordinate().getLatitude();
        double distVertical = getElevation()-trackPoint.getElevation();
        double theta = lon1 - lon2;
        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * KILO; // convert to meters

        distance = Math.pow(distance, 2) + Math.pow(distVertical, 2);
        return Math.sqrt(distance);
    }

    @Override
    public String toString() {
        return "TrackPoint{" +
                "coordinate=" + coordinate +
                ", elevation=" + elevation +
                '}';
    }
}
