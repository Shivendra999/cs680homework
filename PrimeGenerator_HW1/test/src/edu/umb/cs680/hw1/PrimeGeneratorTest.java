package edu.umb.cs680.hw1;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw1.PrimeGenerator;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.LinkedList;

public class PrimeGeneratorTest {

    @Test
    public void testGeneratePrimesInRange() {
        PrimeGenerator gen = new PrimeGenerator(1, 10);
        gen.generatePrimes();
        LinkedList<Long> primes = gen.getPrimes();
        assertEquals(Arrays.asList(2L, 3L, 5L, 7L), primes);
    }

    @Test
    public void testGeneratePrimesWithNoPrimes() {
        PrimeGenerator gen = new PrimeGenerator(1, 1);
        gen.generatePrimes();
        LinkedList<Long> primes = gen.getPrimes();
        assertEquals(0, primes.size());
    }

    @Test
    public void testGeneratePrimesWithSinglePrime() {
        PrimeGenerator gen = new PrimeGenerator(23, 23);
        gen.generatePrimes();
        LinkedList<Long> primes = gen.getPrimes();
        assertEquals(Arrays.asList(23L), primes);
    }

    @Test
    public void testGeneratePrimesWithInvalidRange() {
        assertThrows(IllegalArgumentException.class, () -> {
            PrimeGenerator gen = new PrimeGenerator(10, 5);
            gen.generatePrimes();
        });
    }

    @Test
    public void testGeneratePrimesWithNegativeFromAndTo() {
        assertThrows(IllegalArgumentException.class, () -> {
            PrimeGenerator gen = new PrimeGenerator(-10, -1);
            gen.generatePrimes();
        });
    }

    @Test
    public void testGeneratePrimesWithZeroRange() {
        PrimeGenerator gen = new PrimeGenerator(30, 30);
        gen.generatePrimes();
        LinkedList<Long> primes = gen.getPrimes();
        assertTrue(primes.isEmpty());
    }
    
    @Test
    public void testGeneratePrimesWithValidRange_ArrayEquals() {
        PrimeGenerator gen = new PrimeGenerator(10, 20);
        gen.generatePrimes();
        Long[] expected = { 11L, 13L, 17L, 19L };
        assertArrayEquals(expected, gen.getPrimes().toArray());
    }

    @Test
    public void testGeneratePrimesWithValidRange_IterableEquals() {
        PrimeGenerator gen = new PrimeGenerator(30, 40);
        gen.generatePrimes();
        Iterable<Long> expected = Arrays.asList(31L, 37L);
        assertIterableEquals(expected, gen.getPrimes());
    }
}
