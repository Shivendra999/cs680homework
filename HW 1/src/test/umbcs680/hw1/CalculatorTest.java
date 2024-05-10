package umbcs680.hw1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(12.0, calculator.performMultiplication(4, 3), "Expected product to be 12.0");
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(3.0, calculator.performDivision(27, 9), "Expected quotient to be 3.0");
    }

    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.performDivision(8, 0), "Expected ArithmeticException for division by zero");
    }
}
