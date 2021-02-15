package week16d01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CanoeRentalTest {

    @Test
    void create(){
        CanoeRental canoeRental = new CanoeRental("John", CanoeType.RED, LocalDateTime.of(2021, 02, 03, 12, 30));
        CanoeRental canoeRental2 = new CanoeRental("Bill", CanoeType.BLUE, LocalDateTime.of(2021, 02, 03, 14, 30));
        assertEquals("John", canoeRental.getName());
        assertEquals(CanoeType.BLUE, canoeRental2.getCanoeType());
        assertEquals(LocalDateTime.MIN, canoeRental2.getEndTime());
    }

    @Test
    void CalculateRentalSumTest(){
        CanoeRental canoeRental = new CanoeRental("John", CanoeType.RED, LocalDateTime.of(2021, 02, 03, 12, 30));
        CanoeRental canoeRental2 = new CanoeRental("Bill", CanoeType.BLUE, LocalDateTime.of(2021, 02, 03, 14, 30));
        canoeRental.setEndTime(LocalDateTime.of(2021, 02, 03, 13, 30));
        canoeRental2.setEndTime(LocalDateTime.of(2021, 02, 03, 16, 30));

        assertEquals(5_000, canoeRental.calculateRentalSum());
        assertEquals(15_000, canoeRental2.calculateRentalSum());
    }


}