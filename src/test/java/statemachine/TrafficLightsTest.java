package statemachine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficLightsTest {

    @Test
    void trafficLightsTest(){
    assertEquals(TrafficLights.RED_YELLOW, TrafficLights.RED.next());
    assertEquals(TrafficLights.GREEN, TrafficLights.RED_YELLOW.next());
    assertEquals(TrafficLights.YELLOW, TrafficLights.GREEN.next());
    assertEquals(TrafficLights.RED, TrafficLights.YELLOW.next());
    }
}
