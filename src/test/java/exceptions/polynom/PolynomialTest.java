package exceptions.polynom;

import exceptions.polinom.Polynomial;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolynomialTest {

//    @BeforeAll
//    void setup() {
//        final ExpectedException exception = ExpectedException.none();
//    }
//
//    @Test
//    public void constructorDoubleNullParameterShouldThrowException() throws Exception {
//        double[] coefficients = null;
//        exception.expect(NullPointerException.class);
//        exception.expectMessage("coefficients is null");
//        new Polynomial(coefficients);
//    }
//
//    @Test
//    public void constructorStringNullParameterShouldThrowException() throws Exception {
//        String[] coefficients = null;
//        exception.expect(NullPointerException.class);
//        exception.expectMessage("coefficientStrs is null");
//        new Polynomial(coefficients);
//    }
//
//    @Test
//    public void constructorStringInvalidCoefficientShouldThrowException() throws Exception {
//        String[] coefficientStrs = new String[]{"a", "1", "2"};
//        exception.expect(IllegalArgumentException.class);
//        exception.expectMessage("Illegal coefficients, not a number");
//        exception.expectCause(instanceOf(NumberFormatException.class));
//        new Polynomial(coefficientStrs);
//    }
//
//    @Test
//    public void constructorStringShouldConvert() throws Exception {
//        String[] coefficientStrs = new String[]{"1", "2", "2"};
//
//        Polynomial polynomial = new Polynomial(coefficientStrs);
//
//        double[] expected = new double[] {1,2,2};
//        assertEquals(polynomial.getCoefficients(), expected);
//    }

    @Test
    public void evaluate() throws Exception {
        Polynomial p = new Polynomial(new double[] {1, 2, 3});
        double x = 1;
        assertEquals(p.evaluate(x), x*x+2*x+3);

        x = 2;
        assertEquals(p.evaluate(x), x*x+2*x+3);

        x = -2;
        assertEquals(p.evaluate(x), x*x+2*x+3);

        Polynomial p2 = new Polynomial(new double[] {1, 1, 0, 1});
        x = 3;
        assertEquals(p2.evaluate(x),x*x*x + x*x + 1);
    }
}
