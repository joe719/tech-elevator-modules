package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

	@Test
	public void successful_weekday_party() {
		
		CigarParty myCigarParty  = new CigarParty();
		boolean actual = myCigarParty.haveParty(45, false);
		boolean expected = true;
		
		Assert.assertEquals(expected, actual); 
	
	}
	
	@Test
	public void over_the_max_weekday_party() {
		
		CigarParty myCigarParty  = new CigarParty();
		boolean actual = myCigarParty.haveParty(90, false);
		boolean expected = false;
		
		Assert.assertEquals(expected, actual); 
	
	}
	
	@Test
	public void unsuccessful_weekday_party() {
		
		CigarParty myCigarParty  = new CigarParty();
		boolean actual = myCigarParty.haveParty(30, false);
		boolean expected = false;
		
		Assert.assertEquals(expected, actual); 
	
	}
	
	@Test
	public void successful_weekend_party() {
		
		CigarParty myCigarParty  = new CigarParty();
		boolean actual = myCigarParty.haveParty(96, true);
		boolean expected = true;
		
		Assert.assertEquals(expected, actual); 
	
	}
	
	@Test
	public void unsuccessful_weekend_party() {
		
		CigarParty myCigarParty  = new CigarParty();
		boolean actual = myCigarParty.haveParty(5, true);
		boolean expected = false;
		
		Assert.assertEquals(expected, actual); 
	
	}
	
}
