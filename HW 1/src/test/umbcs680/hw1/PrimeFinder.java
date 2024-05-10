package umbcs680.hw1;
import java.util.List;
import java.util.ArrayList;

public class PrimeFinder {

    private long startRange, endRange;
    private List<Long> primesList;

    public PrimeFinder(long startRange, long endRange) {
        if (startRange > endRange) {
            throw new IllegalArgumentException("Invalid range: startRange > endRange");
        }
        this.startRange = startRange;
        this.endRange = endRange;
        this.primesList = new ArrayList<>();
    }

    public void findPrimesInRange() {
        if (startRange > endRange) {
            return;
        }
        for (long number = Math.max(2, startRange); number <= endRange; number++) {
            if (isPrime(number)) {
                primesList.add(number);
            }
        }
    }

    public List<Long> getPrimesList() {
        if (startRange > endRange) {
            return new ArrayList<>();
        }
        return primesList;
    }

    private boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
