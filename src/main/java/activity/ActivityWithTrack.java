package activity;

public class ActivityWithTrack {

    private ActivityType activityType;
    private Track track;

    public ActivityWithTrack(Track track, ActivityType activityType) {
        this.activityType = activityType;
        this.track = track;
    }

    public double getDistance(){
        return track.getDistance();
    }

    public ActivityType getType(){
        return activityType;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public Track getTrack() {
        return track;
    }
}
