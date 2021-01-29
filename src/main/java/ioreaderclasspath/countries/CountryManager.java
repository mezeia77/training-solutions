package ioreaderclasspath.countries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CountryManager {

    private List<Country> countries = new ArrayList<>();

    public List<Country> getCountries() {
        return countries;
    }

    public void readCountriesToList(String filename){
        Path path = Path.of(filename);
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
                (CountryManager.class.getResourceAsStream("\\" + filename)))) {
            String line;
            while ((line= bufferedReader.readLine())!=null){
                String[] temp = line.split(" ");
                countries.add(new Country(temp[0], Integer.parseInt(temp[1])));
            }
        } catch (IOException ioe){
            throw new IllegalStateException("No file found", ioe);
        }
    }

    public int numberOfCountries(){
        return countries.size();
    }

    public Country countryWithMaxNeighbours(){
        Country max = countries.get(0);
        for(Country country : countries){
            if(country.getNeighbours()>max.getNeighbours()){
                max = country;
            }
        }
        return max;
    }

}
