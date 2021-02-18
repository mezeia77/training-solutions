package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void bookPassenger(Passenger passenger){
        if(passengers.size()<boat.getMaxPassengers()){
            passengers.add(passenger);
        } else throw new IllegalArgumentException("Overbooking not allowed, max number of passengers: " + boat.getMaxPassengers());
    }

    public double getPriceForPassenger(Passenger passenger){
        return getBasicPrice()*passenger.getCruiseClass().getMultiplicator();
    }

    public Passenger findPassengerByName(String name){
        for (Passenger passenger : passengers){
            if(passenger.getName().equals(name)){
                return passenger;
            }
        } throw new IllegalArgumentException("Name not found");
    }

    public List<String> getPassengerNamesOrdered(){
        List<String> result = new ArrayList<>();
        for(Passenger passenger:passengers){
            result.add(passenger.getName());
        }
        Collections.sort(result);
        return result;
    }

    public double sumAllBookingsCharged(){
        double result = 0.0;
        for (Passenger passenger:passengers){
            result+= getBasicPrice()*passenger.getCruiseClass().getMultiplicator();
        }
        return result;
    }

    public Map<CruiseClass, Integer> countPassengerByClass(){
        Map<CruiseClass, Integer> result = new HashMap<>();
        for(Passenger passenger:passengers){
            if(result.containsKey(passenger.getCruiseClass())){
                result.put(passenger.getCruiseClass(), result.get(passenger.getCruiseClass())+1);
            } else {
                result.put(passenger.getCruiseClass(), 1);
            }
        }
        return result;
    }

}
