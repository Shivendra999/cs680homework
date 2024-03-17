package edu.umb.cs680.hw2;

import java.util.LinkedList;

public class SingletonPrimeGenerator {

    private static SingletonPrimeGenerator instance = null;
    private long from, to;
    private LinkedList<Long> primes;

    private SingletonPrimeGenerator() {
        this.from = 0;
        this.to = 0;
        this.primes = new LinkedList<>();
    }

    public static SingletonPrimeGenerator getInstance(long from, long to) {
        if (instance == null) {
            instance = new SingletonPrimeGenerator();
        }

        instance.from = from;
        instance.to = to;
        instance.primes.clear();
        return instance;
    }

    public void generatePrimes() throws IllegalArgumentException {
        if (from < 0 || to < 2 || from > to) {
            throw new IllegalArgumentException("Invalid input range: from=" + from + ", to=" + to);
        }

        for (long num = from; num <= to; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
    }

    public LinkedList<Long> getPrimes() {
        return primes;
    }

    private boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SingletonPrimeGenerator gen = SingletonPrimeGenerator.getInstance(1, 15);
        try {
            gen.generatePrimes();
            LinkedList<Long> primes = gen.getPrimes();
            System.out.println("Prime number(s) between " + gen.from + " and " + gen.to + " are:");
            System.out.println(primes);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
