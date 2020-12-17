package com.techelevator;

import org.junit.Assert;
import org.junit.Test;



public class Lucky13Test {
	
	@Test
	
	public void no_ones_no_threes() {
		
	int[] nums2 = new int[] {12, 5, 4};
	
	Lucky13 noLuck = new Lucky13();
	boolean actual = noLuck.getLucky(nums2);
	boolean expected = true;
	
	Assert.assertEquals(expected, actual); 
	}

	@Test
	
	public void one_one_no_threes() {
		
	int[] nums2 = new int[] {1, 23, 9};
	
	Lucky13 noLuck = new Lucky13();
	boolean actual = noLuck.getLucky(nums2);
	boolean expected = false;
	
	Assert.assertEquals(expected, actual); 
	}

	@Test
	
	public void no_one_one_three() {
		
	int[] nums2 = new int[] {10, 3, 34};
	
	Lucky13 noLuck = new Lucky13();
	boolean actual = noLuck.getLucky(nums2);
	boolean expected = false;
	
	Assert.assertEquals(expected, actual); 
	}

	@Test
	
	public void one_one_one_threes() {
		
	int[] nums2 = new int[] {1, 4, 3};
	
	Lucky13 noLuck = new Lucky13();
	boolean actual = noLuck.getLucky(nums2);
	boolean expected = false;
	
	Assert.assertEquals(expected, actual); 
	}

	@Test
	
	public void null_test() {
		
	int[] nums2 = new int[] {};
	
	Lucky13 noLuck = new Lucky13();
	boolean actual = noLuck.getLucky(nums2);
	boolean expected = true;
	
	Assert.assertEquals(expected, actual); 
	}

}
	


	

