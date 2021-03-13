package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();
    public static final int LAT_START_INDEX = 15;
    public static final int LAT_END_INDEX = 25;
    public static final int LON_START_INDEX = 32;
    public static final int LON_END_INDEX = 42;

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

    public void loadFromGpx(InputStream is) {
        List<TrackPoint> tpl = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line;
        Coordinate cord = null;
        try {
            while ((line = br.readLine()) != null) {
                if(line.trim().startsWith("<trkpt")) {
                    cord = parseCoordinate(line);
                }
                if (line.trim().startsWith("<ele>")) {
                    tpl.add(new TrackPoint(cord,parseElevation(line)));
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file",e);
        }
        trackPoints = tpl;
    }

    private double parseElevation(String line) {
        return Double.parseDouble(line.substring(9,14));
    }

    private Coordinate parseCoordinate(String line) {
        double lat= Double.parseDouble(line.substring(LAT_START_INDEX, LAT_END_INDEX));
        double lon= Double.parseDouble(line.substring(LON_START_INDEX, LON_END_INDEX));
        return new Coordinate(lat,lon);
    }
}
