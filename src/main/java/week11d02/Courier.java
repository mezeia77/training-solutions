package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    List<Ride> rides = new ArrayList<>();

    public List<Ride> getRides() {
        return rides;
    }

    public void addRide(Ride ride){
        if(ride.getDay()<1 || ride.getDay()>7){
            throw new IllegalArgumentException("Invalid day (out of 1-7)");
        }

        if(ride.getNumber()<1 || ride.getDistance()<1){
            throw new IllegalArgumentException("Invalid number or distance (<1)");
        }

        if(!rides.isEmpty()){
            Ride lastRide = rides.get(rides.size()-1);

            if(ride.getDay()< lastRide.getDay()){
                throw new IllegalArgumentException("Invalid day (earlier than last one)");
            }

            if(ride.getDay() == lastRide.getDay() && ride.getNumber()<= lastRide.getNumber()){
                throw new IllegalArgumentException("Invalid number (earlier or same as last one");
            }

            if(ride.getDay() == lastRide.getDay() && ride.getNumber()-lastRide.getNumber() !=1 ){
                throw new IllegalArgumentException("Invalid number (not following the last one)");
            }
        }

        rides.add(ride);
    }

    public int firstFreeDay(List<Ride> rides){

        if(!rides.isEmpty()){

            for(int i = 1; i< rides.size();i++){
                if((rides.get(i).getDay()-rides.get(i-1).getDay())>1){
                    return rides.get(i).getDay()-1;
                }
            }
        }
        return -1;
    }


}
