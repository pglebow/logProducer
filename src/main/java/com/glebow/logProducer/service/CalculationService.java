/**
 * 
 */
package com.glebow.logProducer.service;

import org.springframework.stereotype.Service;

/**
 * Service that does the calculations
 * @author pglebow
 *
 */
@Service
public class CalculationService {

	/**
	 * Default
	 */
	public CalculationService() {		
	}
	
	/**
	 * Nth Fibonacci number (naive)
	 * @param n
	 * @return
	 */
	public int getNthFibonacci(int n) {
		return fib(n);
	}

	/**
	 * Naive way to calculate the nth fibonacci number
	 * @param n
	 * @return nth fibonacci number
	 */
	private static int fib(int n) {
		if ( n<= 1 ) {
			return n;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}

	
}
