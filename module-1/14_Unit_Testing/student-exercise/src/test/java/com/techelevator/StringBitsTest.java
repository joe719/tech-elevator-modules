package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {

	
	@Test
	
	public void every_other_for_beast() {
	
	StringBits myStringBits = new StringBits();
	String actual = myStringBits.getBits("beast");
	String expected = "bat";
	Assert.assertEquals(actual, expected);
	}
	
	@Test
	
	public void every_other_for_the() {
	
	StringBits myStringBits = new StringBits();
	String actual = myStringBits.getBits("the");
	String expected = "te";
	Assert.assertEquals(actual, expected);
	}

	@Test
	
	public void every_other_for_an() {
	
	StringBits myStringBits = new StringBits();
	String actual = myStringBits.getBits("an");
	String expected = "a";
	Assert.assertEquals(actual, expected);
	}
	
}
