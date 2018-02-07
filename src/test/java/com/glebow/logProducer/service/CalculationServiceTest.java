/**
 * 
 */
package com.glebow.logProducer.service;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author pglebow
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest	
public class CalculationServiceTest {
	
	@Autowired
	private CalculationService calculationService;
	
	/**
	 * Test method for {@link com.glebow.logProducer.service.CalculationService#getNthFibonacci(int)}.
	 */
	@Test
	public void testGetNthFibonacci() {
		Assert.assertEquals(55, calculationService.getNthFibonacci(10));
		Assert.assertEquals(5, calculationService.getNthFibonacci(5));
		Assert.assertEquals(0, calculationService.getNthFibonacci(0));
		Assert.assertEquals(-2, calculationService.getNthFibonacci(-2));
	}

}
