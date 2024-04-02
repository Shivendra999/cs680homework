package edu.umb.cs680.hw1;

import java.util.LinkedList;

public class PrimeGenerator {

	  protected long from, to;
	  protected LinkedList<Long> primes;

	  public PrimeGenerator(long from, long to) {
	    this.from = from;
	    this.to = to;
	    this.primes = new LinkedList<Long>();
	  }

	  public void generatePrimes() throws IllegalArgumentException {
	    if (from < 0 || to < 0 || from > to) {
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
	    long from = 1;
	    long to = 10;
	    PrimeGenerator pg = new PrimeGenerator(from, to);
	    try {
	      pg.generatePrimes();
	      LinkedList<Long> primes = pg.getPrimes();
	      System.out.println("Prime number(s) between " + from + " and " + to + " are:");
	      System.out.println(primes);
	    } catch (IllegalArgumentException e) {
	      System.out.println("Error: " + e.getMessage());
	    }
	  }
	}

