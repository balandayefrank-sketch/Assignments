import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class AverageCalculatorTest {

    @Test
    public void testAverage() {
        double[] numbers = {10, 20, 30};

    
        assertEquals(20.0,
                AverageCalculator.calculateAverage(numbers));
    }

    @Test
    public void testDecimal() {
        double[] numbers = {5, 10, 15, 20};

        assertEquals(12.5,
                AverageCalculator.calculateAverage(numbers));
        
    }
}
