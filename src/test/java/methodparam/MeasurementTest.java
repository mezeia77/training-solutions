package methodparam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeasurementTest {

    private Measurement measurement;

//    @Before
//    public void setUp() {
//        double[] values = new double[] {10, 4, 3, 8, 12, 5, 7};
//        this.measurement = new Measurement(values);
//    }

//    @After
//    public void tearDown(){
//        this.measurement = null;
//    }

    @Test
    public void findFirstIndexInLimit() {
        double[] values = new double[] {10, 4, 3, 8, 12, 5, 7};
        this.measurement = new Measurement(values);

        assertEquals(this.measurement.findFirstIndexInLimit(4, 8), 5);
        assertEquals(this.measurement.findFirstIndexInLimit(0, 2), -1);
    }

    @Test
    public void minimum() {
        double[] values = new double[] {10, 4, 3, 8, 12, 5, 7};
        this.measurement = new Measurement(values);

        assertEquals(this.measurement.minimum(), 3.0);
    }

    @Test
    public void maximum() {
        double[] values = new double[] {10, 4, 3, 8, 12, 5, 7};
        this.measurement = new Measurement(values);

        assertEquals(this.measurement.maximum(), 12.0);
    }

    @Test
    public void minmax() {
        double[] values = new double[] {10, 4, 3, 8, 12, 5, 7};
        this.measurement = new Measurement(values);

        ExtremValues extremValues = this.measurement.minmax();

        assertEquals(extremValues.getMin(), 3.0);
        assertEquals(extremValues.getMax(), 12.0);
    }
}
