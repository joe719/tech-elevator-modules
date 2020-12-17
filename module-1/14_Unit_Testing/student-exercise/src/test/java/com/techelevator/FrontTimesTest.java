package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

		@Test
	
		public void boat_4() {
		
		FrontTimes myFrontTimes = new FrontTimes();
		String actual = myFrontTimes.generateString("boat", 4);
		String expected = "boaboaboaboa";
		Assert.assertEquals(expected, actual);
	}
		
		@Test
		
		public void boat_1() {
			
		FrontTimes myFrontTimes = new FrontTimes();
		String actual = myFrontTimes.generateString("boat", 1);
		String expected = "boa";
		Assert.assertEquals(expected, actual);
			
	}
		
		@Test
		
		public void boat_0() {
			
		FrontTimes myFrontTimes = new FrontTimes();
		String actual = myFrontTimes.generateString("boat", 0);
		String expected = "";
		Assert.assertEquals(expected, actual);
			
	}
}
