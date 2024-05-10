package umbcs680.hw2;
import java.util.ArrayList;
import java.util.List;

public class SingletonPrimeFinder {
    private static SingletonPrimeFinder instance;
    private List<Long> primesList;

    private SingletonPrimeFinder() {
        this.primesList = new ArrayList<>();
    }

    public static synchronized SingletonPrimeFinder getInstance() {
        if (instance == null) {
            instance = new SingletonPrimeFinder();
        }
        return instance;
    }

    public synchronized void findPrimesInRange(long from, long to) {
        if (from > to) {
            return;
        }
        primesList.clear();
        for (long number = Math.max(2, from); number <= to; number++) {
            if (isPrime(number)) {
                primesList.add(number);
            }
        }
    }

    public synchronized List<Long> getPrimesList() {
        return new ArrayList<>(primesList);
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
