package exam04retake01.cleaning;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CleaningService {


    private List<Cleanable> cleanables = new ArrayList<>();

    public CleaningService(List<Cleanable> cleanables) {
        this.cleanables = cleanables;
    }

    public CleaningService() {
    }

    public List<Cleanable> getCleanables() {
        return cleanables;
    }

    public void add(Cleanable cleanable){
        cleanables.add(cleanable);
    }

    public int cleanAll() {
        int result = 0;

        for(Cleanable c: cleanables){
        result+=c.clean();
        }

        cleanables.clear();
        return result;
    }

    public int cleanOnlyOffices() {
        int result = 0;
        List<Cleanable> toRemove = new ArrayList<>();

        for (Cleanable c:cleanables){
            if(Objects.equals(c.getClass().getName(), "exam04retake01.cleaning.Office")){
                result+=c.clean();
                toRemove.add(c);
            }
        }
        cleanables.removeAll(toRemove);
        return result;
    }

    public List<Cleanable> findByAddressPart(String address) {
        List<Cleanable> result = new ArrayList<>();
        for(Cleanable c:cleanables){
            if(c.getAddress().contains(address)){
                result.add(c);
            }
        }
        return result;
    }

    public String getAddresses() {
        StringBuilder result = new StringBuilder();
        for(Cleanable c : cleanables){
            result.append(c.getAddress()).append(", ");
        }
        return result.substring(0, result.length()-2);
    }
}
