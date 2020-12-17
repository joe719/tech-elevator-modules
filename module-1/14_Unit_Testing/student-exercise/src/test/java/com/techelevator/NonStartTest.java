package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {

	@Test
	
	public void bob_saget(){
	
	NonStart startNot = new NonStart();
	String actual = startNot.getPartialString("bob", "saget");
	String expected = "obaget";
	Assert.assertEquals(expected, actual);
	}
	
	@Test
	
	public void fred_durst(){
	
	NonStart startNot = new NonStart();
	String actual = startNot.getPartialString("fred", "durst");
	String expected = "redurst";
	Assert.assertEquals(expected, actual);
	}
	
	
}
