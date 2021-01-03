package statemachine;

public enum TrafficLights {

    RED{
        TrafficLights next(){
            return TrafficLights.RED_YELLOW;
        }
    },
    RED_YELLOW{
        TrafficLights next(){
            return TrafficLights.GREEN;
        }
    },
    GREEN{
        TrafficLights next(){
            return TrafficLights.YELLOW;
        }
    },
    YELLOW{
        TrafficLights next(){
            return TrafficLights.RED;
        }
    };

    abstract TrafficLights next();
}
