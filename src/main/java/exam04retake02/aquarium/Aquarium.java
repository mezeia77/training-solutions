package exam04retake02.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Fish> fish = new ArrayList<>();

    public Aquarium() {
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Fish f:fish){
            result.add(f.status());
        }
        return result;
    }

    public void addFish(Fish newFish) {
        fish.add(newFish);
    }

    public void removeFish() {
        List<Fish> fishToRemove = new ArrayList<>();
        for (Fish f : fish){
            if(f.getWeight()>10){
                fishToRemove.add(f);
            }
        }
        fish.removeAll(fishToRemove);
    }

    public void feed() {
        for(Fish f:fish){
            f.feed();
        }
    }
}
