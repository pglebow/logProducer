/**
 * 
 */
package com.glebow.logProducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.glebow.logProducer.service.CalculationService;

/**
 * Resource-intensive calculations so that our server shows up in the log analytics portal
 * @author pglebow
 *
 */
@RestController
@RequestMapping("/soak")
public class SoakController {
	
	@Autowired
	private CalculationService calculationService;
	
	@RequestMapping(method=RequestMethod.GET, value="/fibonacci")
	public @ResponseBody Integer fibonacci(@RequestParam(value="n", required=true) Integer nth) {
		return calculationService.getNthFibonacci(nth);
	}
	

}
