package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive best(List<Pendrive> pendrives){
        Pendrive temp = pendrives.get(0);
        for (int i = 1; i< pendrives.size(); i++){
            if (temp.comparePricePerCapacity(pendrives.get(i)) == 1){
                temp = pendrives.get(i);
            }
        } return temp;
    }

    public Pendrive cheapest(List<Pendrive> pendrives){
        Pendrive temp = pendrives.get(0);
        for (int i = 0; i< pendrives.size(); i++){
            if (pendrives.get(i).cheaperThan(temp)){
                temp = pendrives.get(i);
            }
        } return temp;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity){
        for (Pendrive temp : pendrives){
            if (capacity == temp.getCapacity()){
                temp.risePrice(percent);
            }
        }
    }
}
