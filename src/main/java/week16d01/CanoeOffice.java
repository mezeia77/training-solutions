package week16d01;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class CanoeOffice{

    List<CanoeRental> canoeRentals = new ArrayList<>();

    public void createRental(CanoeRental canoeRental){
        canoeRentals.add(canoeRental);
    }

    public CanoeRental findRentalByName(String name){
        for (CanoeRental cr : canoeRentals){
            if(cr.getName().equals(name) && cr.getEndTime().equals(LocalDateTime.MIN)){
                return cr;
            }
        }
        throw new IllegalArgumentException("No such active rental");
    }

    public void closeRentalByName(String name, LocalDateTime endTime){
        for(CanoeRental cr : canoeRentals){
            if(cr.getName().equals(name)){
                cr.setEndTime(endTime);
            }
        }
    }

    public double getRentalPriceByName(String name, LocalDateTime endTime){
        double price;
        for(CanoeRental cr : canoeRentals){
            if(cr.getName().equals(name)){
                cr.setEndTime(endTime);
                price =  cr.calculateRentalSum();
                cr.setEndTime(LocalDateTime.MIN);
                return price;
            }
        }
        throw new IllegalArgumentException("No such active rental");
    }

    public List<CanoeRental> listClosedRentals(){
        List<CanoeRental> canoeRentalList = new ArrayList<>();
        for(CanoeRental cr : canoeRentals){
            if(!cr.getEndTime().equals(LocalDateTime.MIN)){
                canoeRentalList.add(cr);
            }
        }
        return canoeRentalList;
    }

    public Map<CanoeType, Integer> countRentals(){
        Map<CanoeType, Integer> countOfTypes = new HashMap<>();
        for (CanoeRental cr:canoeRentals) {
            if (countOfTypes.containsKey(cr.getCanoeType())) {
                countOfTypes.put(cr.getCanoeType(), countOfTypes.get(cr.getCanoeType()) + 1);
            }
            else {
                countOfTypes.put(cr.getCanoeType(), 1);
            }
        }
        return countOfTypes;
    }

}
