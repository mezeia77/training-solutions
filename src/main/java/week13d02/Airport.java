package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flights> flightsList = new ArrayList<>();

    public void readFile(String filename){
        Path path = Path.of("src\\main\\resources\\week13d02\\" + "cities.txt");
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)){
            String line;
            while ((line= bufferedReader.readLine())!=null){
                String[] parts = line.split(" ");
                flightsList.add(new Flights(parts[0], DestinationType.valueOf(parts[1].toUpperCase()), parts[2], timeSplit(parts)));
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Wrong filename ", e);
        }
    }

    private LocalTime timeSplit(String[] parts){
        int hour = Integer.parseInt(parts[3].split(":")[0]);
        int min = Integer.parseInt(parts[3].split(":")[1]);
        return LocalTime.of(hour, min);
    }

    private DestinationType moreType(){
        int count=0;
        for(Flights flights:flightsList){
            if(flights.destinationType==DestinationType.ARRIVAL){
                count++;
            }
        }
        if (count> flightsList.size()*0.5) {
            return DestinationType.ARRIVAL;
        } else return DestinationType.DEPARTURE;
    }

    private Flights findFlightById(String id){
        for(int i=0; i< flightsList.size(); i++){
            if(flightsList.get(i).id.equals(id)){
                return flightsList.get(i);
            }
        } throw new IllegalArgumentException("No such ID");
    }

    private List<Flights> findByCityAndType(String city, String type){
        List<Flights> result = new ArrayList<>();
        for(int i=0; i< flightsList.size(); i++){
            if(flightsList.get(i).city.equals(city) && flightsList.get(i).destinationType.equals(DestinationType.valueOf(type.toUpperCase()))){
                result.add(flightsList.get(i));
            }
        } return result;
    }

    private Flights earliestFlight(){
        Flights result = flightsList.get(0);
        for(int i=1; i< flightsList.size(); i++){
            if(flightsList.get(i).time.isBefore(flightsList.get(i-1).time)){
                result = flightsList.get(i);
            }
        } return result;
    }


    public static void main(String[] args) {
        Airport airport = new Airport();
        airport.readFile("cities.txt");
        System.out.println(airport.flightsList);
        System.out.println(airport.moreType());
        System.out.println(airport.findFlightById("GW4455"));
        System.out.println(airport.findByCityAndType("Budapest", "arrivaL"));
        System.out.println(airport.earliestFlight());
    }

}
