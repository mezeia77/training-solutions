package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public Track(List<TrackPoint> trackPoints) {
        this.trackPoints = trackPoints;
    }

    public Track() {

    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public void addTrackPoint(TrackPoint trackPoint){
        trackPoints.add(trackPoint);
    }

    public double getDistance(){
        double result = 0;
        for (int i = 1; i< trackPoints.size(); i++){
            result += trackPoints.get(i-1).getDistanceFrom(trackPoints.get(i));
        }
        return result;
    }

    public double getFullElevation() {
        double result = 0;
        double elevation = 0;
        for(int i = 1; i< trackPoints.size(); i++){
            elevation=trackPoints.get(i).getElevation()-trackPoints.get(i-1).getElevation();
            if(elevation>0){
                result+=elevation;
            }
        }
        return result;
    }

    public double getFullDecrease() {
        double result = 0;
        double elevation = 0;
        for(int i = 1; i< trackPoints.size(); i++){
            elevation=trackPoints.get(i).getElevation()-trackPoints.get(i-1).getElevation();
            if(elevation<0){
                result+=elevation;
            }
        }
        return Math.abs(result);
    }

    public Coordinate findMinimumCoordinate() {
        double minLat = Double.MAX_VALUE;
        double minLong = Double.MAX_VALUE;
        for (TrackPoint tp:trackPoints){
            if(minLat>tp.getCoordinate().getLatitude()){
                minLat = tp.getCoordinate().getLatitude();
            }
            if(minLong>tp.getCoordinate().getLongitude()){
                minLong = tp.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(minLat, minLong);
    }

    public Coordinate findMaximumCoordinate() {
        double maxLat = Double.MIN_VALUE;
        double maxLong = Double.MIN_VALUE;
        for (TrackPoint tp : trackPoints){
            if (maxLat<tp.getCoordinate().getLatitude()){
                maxLat= tp.getCoordinate().getLatitude();
            }
            if(maxLong<tp.getCoordinate().getLongitude()){
                maxLong=tp.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(maxLat, maxLong);
    }

    public double getRectangleArea() {
        return (findMaximumCoordinate().getLatitude()-findMinimumCoordinate().getLatitude()) *
                (findMaximumCoordinate().getLongitude()- findMinimumCoordinate().getLongitude());
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackPoints=" + trackPoints +
                '}';
    }
}
