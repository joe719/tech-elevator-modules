package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {
	
	@Test
	public void one_less_multiple_of_20() {
		
		Less20 myLess20 = new Less20();
		boolean actual = myLess20.isLessThanMultipleOf20(59);
		boolean expected = true;
		
		Assert.assertEquals(expected, actual); 

	}

	@Test
	public void two_less_multiple_of_20() {
		
		Less20 myLess20 = new Less20();
		boolean actual = myLess20.isLessThanMultipleOf20(38);
		boolean expected = true;
		
		Assert.assertEquals(expected, actual); 
	}

	@Test
	public void exact_multiple_of_20() {
			
		Less20 myLess20 = new Less20();
		boolean actual = myLess20.isLessThanMultipleOf20(40);
		boolean expected = false;
			
		Assert.assertEquals(expected, actual); 

		}
	
	@Test
	public void four_away_from_multiple_of_20() {
		
		Less20 myLess20 = new Less20();
		boolean actual = myLess20.isLessThanMultipleOf20(36);
		boolean expected = false;
			
		Assert.assertEquals(expected, actual); 

		}

	}


