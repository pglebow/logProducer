/**
 * 
 */
package com.glebow.logProducer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Service that does the calculations
 * @author pglebow
 *
 */
@Service
public class CalculationService {

	private static final Logger logger = LoggerFactory.getLogger(CalculationService.class);
	
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
		int retVal= n;
		logger.info("Requesting the " + n + "th Fibonacci number...");
		retVal = fib(n);
		logger.info("The " + n + "th Fibonacci number is " + retVal);
		return retVal;
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
