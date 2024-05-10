package umbcs680.hw2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SingletonPrimeFinderTest {

    @Test
    public void testFindPrimesInRange() {
        SingletonPrimeFinder primeFinder = SingletonPrimeFinder.getInstance();
        primeFinder.findPrimesInRange(2, 11);
        List<Long> actualPrimes = primeFinder.getPrimesList();
        Long[] expectedPrimes = {2L, 3L, 5L, 7L, 11L};
        assertIterableEquals(Arrays.asList(expectedPrimes), actualPrimes);
    }

    @Test
    public void testFindPrimesInRangeNegative() {
        SingletonPrimeFinder primeFinder = SingletonPrimeFinder.getInstance();
        primeFinder.findPrimesInRange(-11, -2);
        List<Long> primes = primeFinder.getPrimesList();
        assertEquals(0, primes.size());
    }

    @Test
    public void testFindPrimesInRangePositive() {
        SingletonPrimeFinder primeFinder = SingletonPrimeFinder.getInstance();
        primeFinder.findPrimesInRange(2, 11);
        List<Long> primes = primeFinder.getPrimesList();
        assertEquals(5, primes.size());
    }
}
