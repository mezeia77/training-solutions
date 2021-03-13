package activity;

import vaccination.Riport;

import java.util.ArrayList;
import java.util.List;

public class Activities {
    private List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public List<Riport> distancesByTypes(){
        List<Riport> result = new ArrayList<>();

        return result;
    }
}
