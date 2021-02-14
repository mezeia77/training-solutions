package clone.trainer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AuctionTest {

    @Test
    void testClone(){
        Auction auction = new Auction(5, LocalDateTime.of(2018, 01, 01, 12, 00), new User("Joe"), new Product("computer"));
        Auction another = new Auction(auction);
        assertEquals(5, another.getPrice());
        assertEquals(LocalDateTime.of(2018, 01, 01, 12, 00), another.getStart());
        assertEquals("Joe", another.getUser().getName());
        assertEquals("computer", another.getProduct().getName());
        auction.setPrice(10);
        auction.setStart(LocalDateTime.of(2018, 01, 01, 15, 00));
        auction.getUser().setName("Jack");
        auction.getProduct().setName("computer 2");
        assertEquals("computer 2", auction.getProduct().getName());
        assertEquals("computer", another.getProduct().getName());
        assertEquals(10, auction.getPrice());
        assertEquals(5, another.getPrice());
        assertEquals(LocalDateTime.of(2018, 01, 01, 15, 00), auction.getStart());
        assertEquals(LocalDateTime.of(2018, 01, 01, 12, 00), another.getStart());
        assertEquals("Jack", auction.getUser().getName());
        assertEquals("Jack", another.getUser().getName());
    }
}