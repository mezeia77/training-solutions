package methodparam;

public class Measurement {

    private double[] values;

    public Measurement(double[] values) {
        this.values = values;
    }

    public int findFirstIndexInLimit(int lower, int upper){
        for(int i = 0; i< values.length; i++){
            if(values[i]<upper && values[i]>lower){
                return i;
            }
        }
        return -1;
    }

    public double minimum(){
        double min=values[0];
        for(double temp:values){
            if (temp<min){
                min=temp;
            }
        }
        return min;
    }

    public double maximum(){
        double max = values[0];
        for(int i=1; i< values.length; i++){
            if (values[i] > max){
                max = values[i];
            }
        }
        return max;
    }

    public ExtremValues minmax(){
        return new ExtremValues(minimum(), maximum());
    }
}
