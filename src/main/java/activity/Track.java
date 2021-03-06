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

//    public Coordinate findMaximumCoordinate(){
//        Coordinate result = null;
//
//        for (TrackPoint trackPoint: trackPoints){
//
//        }
//    }

    @Override
    public String toString() {
        return "Track{" +
                "trackPoints=" + trackPoints +
                '}';
    }
}
