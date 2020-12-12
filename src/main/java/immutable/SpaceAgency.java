package immutable;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<String> tracedSatellites = new ArrayList<>();

    public void registerSatellite(Satellite satellite){
        if (satellite == null){
            throw new IllegalArgumentException("Null parameter!");
        } tracedSatellites.add(toString());
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent){
        for (Satellite s : tracedSatellites){
            if (s.getRegisterIdent().equals(registerIdent)){
                return s;
            }
        } throw new IllegalArgumentException("Registration not found!" + registerIdent);
    }

    public String toString(){
        return tracedSatellites.toString();
    }
}
