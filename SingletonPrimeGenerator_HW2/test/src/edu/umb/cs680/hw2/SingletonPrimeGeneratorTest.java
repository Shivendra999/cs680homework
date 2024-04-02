package edu.umb.cs680.hw2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.LinkedList;

public class SingletonPrimeGeneratorTest {

    @Test
    public void testGeneratePrimesInRange() {
    	SingletonPrimeGenerator gen = SingletonPrimeGenerator.getInstance(1, 10);
        gen.generatePrimes();
        LinkedList<Long> primes = gen.getPrimes();
        assertEquals(Arrays.asList(2L, 3L, 5L, 7L), primes);
    }


    @Test
    public void testGeneratePrimesWithSinglePrime() {
    	SingletonPrimeGenerator gen = SingletonPrimeGenerator.getInstance(23, 23);
        gen.generatePrimes();
        LinkedList<Long> primes = gen.getPrimes();
        assertEquals(Arrays.asList(23L), primes);
    }

    @Test
    public void testGeneratePrimesWithInvalidRange() {
        assertThrows(IllegalArgumentException.class, () -> {
        	SingletonPrimeGenerator gen = SingletonPrimeGenerator.getInstance(10, 5);
            gen.generatePrimes();
        });
    }

    @Test
    public void testGeneratePrimesWithNegativeFromAndTo() {
        assertThrows(IllegalArgumentException.class, () -> {
        	SingletonPrimeGenerator gen = SingletonPrimeGenerator.getInstance(-10, -1);
            gen.generatePrimes();
        });
    }

    @Test
    public void testGeneratePrimesWithZeroRange() {
    	SingletonPrimeGenerator gen = SingletonPrimeGenerator.getInstance(30, 30);
        gen.generatePrimes();
        LinkedList<Long> primes = gen.getPrimes();
        assertTrue(primes.isEmpty());
    }

    @Test
    public void testGeneratePrimesWithValidRange_ArrayEquals() {
    	SingletonPrimeGenerator gen = SingletonPrimeGenerator.getInstance(10, 20);
        gen.generatePrimes();
        Long[] expected = { 11L, 13L, 17L, 19L };
        assertArrayEquals(expected, gen.getPrimes().toArray());
    }

    @Test
    public void testGeneratePrimesWithValidRange_IterableEquals() {
    	SingletonPrimeGenerator gen = SingletonPrimeGenerator.getInstance(30, 40);
        gen.generatePrimes();
        Iterable<Long> expected = Arrays.asList(31L, 37L);
        assertIterableEquals(expected, gen.getPrimes());
    }
    
    @Test
    public void testGeneratePrimesWithValidRange_NotNull() {
        SingletonPrimeGenerator gen = SingletonPrimeGenerator.getInstance(1, 10);
        gen.generatePrimes();
        LinkedList<Long> primes = gen.getPrimes();
        assertNotNull(primes);
    }

    @Test
    public void testGeneratePrimesWithValidRange_SameInstance() {
        SingletonPrimeGenerator gen1 = SingletonPrimeGenerator.getInstance(1, 10);
        SingletonPrimeGenerator gen2 = SingletonPrimeGenerator.getInstance(10, 20);
        assertSame(gen1, gen2);
    }
}

