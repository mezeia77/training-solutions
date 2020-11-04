package localvariables;

public class Distance {

    Double distanceInKm;
    Boolean exact;

    public Distance(double distanceInKm, boolean exact) {
        this.distanceInKm = distanceInKm;
        this.exact = exact;
    }
    public Double getDistanceInKm() {
        return distanceInKm;
    }

    public Boolean isExact() {
        return exact;

    }
}
