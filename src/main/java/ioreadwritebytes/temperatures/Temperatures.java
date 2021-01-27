package ioreadwritebytes.temperatures;

public class Temperatures {

    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage(){
        double sum = 0;
        for(double n:data){
            sum += n;
        }
        return sum / data.length;
    }

    public double getMonthAverage(){
        double sum = 0;
        int lastRecord = data.length-1;
        for(int i = lastRecord; i>lastRecord-30; i--){
            sum += data[i];
        }
        return sum/30;
    }
}
