package ioreaderclasspath.countries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountryManagerTest {

    CountryManager countryManager = new CountryManager();

    @Test
    void readCountriesToList() {
        assertEquals(0, countryManager.numberOfCountries());
        countryManager.readCountriesToList("country.txt");
        assertEquals(8, countryManager.numberOfCountries());
    }

    @Test
    void countryWithMaxNeighbours() {
        countryManager.readCountriesToList("country.txt");
        Country maxNeighboursCountry = new Country("Germany", 8);
        assertEquals("Germany", countryManager.countryWithMaxNeighbours().getName());
        assertEquals(8, countryManager.countryWithMaxNeighbours().getNeighbours());
//        assertSame(maxNeighboursCountry, countryManager.countryWithMaxNeighbours());
    }
}