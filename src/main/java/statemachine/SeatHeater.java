package statemachine;

public enum SeatHeater {

    MAXIMUM{
        SeatHeater next(){
            return SeatHeater.MEDIUM;
        }
    },
    MEDIUM{
        SeatHeater next(){
            return SeatHeater.MINIMUM;
        }
    },
    MINIMUM{
        SeatHeater next(){
            return SeatHeater.OFF;
        }
    },
    OFF{
        SeatHeater next(){
            return SeatHeater.MAXIMUM;
        }
    };

    abstract SeatHeater next();

}
