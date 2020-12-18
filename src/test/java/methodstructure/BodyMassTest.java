package methodstructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BodyMassTest {

    BodyMass bodyMass = new BodyMass(75, 172);

    @Test
    public void isCalculationCorrect(){
        double expectedBmi = (bodyMass.getWeight()*10000)/(bodyMass.getHeight()* bodyMass.getHeight());
        assertEquals(expectedBmi, bodyMass.bodyMassIndex());
    }

   @Test
    public void bmiCategoryTest(){
        assertEquals( bodyMass.body(), BmiCategory.NORMAL);
    }

}
