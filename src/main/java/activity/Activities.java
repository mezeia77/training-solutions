package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {
    private List<Activity> activities ;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public int numberOfTrackActivities() {
        int result = 0;
        for (Activity activity:activities){
            if (activity instanceof ActivityWithTrack){
                result++;
            }
        }
        return result;
    }

    public int numberOfWithoutTrackActivities() {
        int result = 0;
        for (Activity activity:activities){
            if (activity instanceof ActivityWithoutTrack){
                result++;
            }
        }
        return result;
    }

    public List<Report> distancesByTypes() {
        double[] distArray = buildDistanceArray();
        return buildResultList(distArray);
    }

    private List<Report> buildResultList(double[] distArray) {
        List<Report> reports= new ArrayList<>();
        for (int i = 0; i < distArray.length; i++) {
            reports.add(new Report(ActivityType.values()[i], distArray[i]));
        }
        return reports;
    }

    private double[] buildDistanceArray() {
        double[] distArray = new double[ActivityType.values().length];
        for (Activity activity : activities) {
            distArray[activity.getType().ordinal()] += activity.getDistance();
        }
        return distArray;
    }
}
