package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderStateTest {

    @Test
    void TestCanDeleteOnNew(){
        OrderState orderState = OrderState.NEW;
        assertTrue(orderState.canDelete());
    }

    @Test
    void TestCanDeleteOnConfirmed(){
        OrderState orderState = OrderState.CONFIRMED;
        assertTrue(orderState.canDelete());
    }

    @Test
    void TestCanDeleteOnPrepared(){
        OrderState orderState = OrderState.PREPARED;
        assertTrue(orderState.canDelete());
    }

    @Test
    public void testCanDeleteOnOnboard() {
        OrderState state = OrderState.ONBOARD;
        assertFalse(state.canDelete());
    }

    @Test
    public void testCanDeleteOnDelivered() {
        OrderState state = OrderState.DELIVERED;
        assertFalse(state.canDelete());
    }

    @Test
    public void testCanDeleteOnReturned() {
        OrderState state = OrderState.RETURNED;
        assertFalse(state.canDelete());
    }

    @Test
    public void testCanDeleteOnDeleted() {
        OrderState state = OrderState.DELETED;
        assertFalse(state.canDelete());
    }

}
