package week16d01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CanoeOfficeTest {

    CanoeOffice office = new CanoeOffice();

    @BeforeEach
    void setUp(){
        office.createRental(new CanoeRental("John", CanoeType.RED,  LocalDateTime.of(2021, 02, 03, 12, 30)));
        office.createRental(new CanoeRental("Jack", CanoeType.BLUE,  LocalDateTime.of(2021, 02, 03, 14, 30)));
        office.createRental(new CanoeRental("Jane", CanoeType.BLUE,  LocalDateTime.of(2021, 02, 03, 14, 30)));
    }

    @Test
    void findRentalByNameTest(){
        System.out.println(office.findRentalByName("John"));
        System.out.println(office.findRentalByName("Jack"));
    }

    @Test
    void closeRentalByNameTest(){
        office.closeRentalByName("John", LocalDateTime.of(2021, 02, 03, 14, 30));
        assertThrows(IllegalArgumentException.class, ()->office.findRentalByName("John"));
        assertDoesNotThrow(()->office.findRentalByName("Jack"));
    }

    @Test
    void getRentalPriceByName(){
        assertThrows(IllegalArgumentException.class, ()-> office.getRentalPriceByName("Juliet",LocalDateTime.of(2021, 02, 03, 14, 30) ));
        assertEquals(10_000, office.getRentalPriceByName("John",LocalDateTime.of(2021, 02, 03, 14, 30) ));
    }

    @Test
    void listClosedRentalsTest(){
        assertEquals(0, office.listClosedRentals().size());
        office.closeRentalByName("John", LocalDateTime.of(2021, 02, 03, 14, 30));
        assertEquals(1, office.listClosedRentals().size());
    }

    @Test
    void countRentalsTest(){
        System.out.println(office.countRentals());
    }

}