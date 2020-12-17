package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

	
	@Test
	
	public void last_does_not_equal_first() {
		
	int[] nums2 = new int[] {3, 9, 4, 6, 9, 1};
	
	SameFirstLast myArray = new SameFirstLast();
	boolean actual = myArray.isItTheSame(nums2);
	boolean expected = false;
	
	Assert.assertEquals(expected, actual); 
	}
	
	@Test
	
	public void equal_first_and_last() {
		
	int[] nums2 = new int[] {2, 6, 9, 1, 2};
	
	SameFirstLast myArray = new SameFirstLast();
	boolean actual = myArray.isItTheSame(nums2);
	boolean expected = true;
	
	Assert.assertEquals(expected, actual); 
	}
	
	@Test
	
	public void length_of_2_last_equals_first() {
		
	int[] nums2 = new int[] {7, 7};
	
	SameFirstLast myArray = new SameFirstLast();
	boolean actual = myArray.isItTheSame(nums2);
	boolean expected = true;
	
	Assert.assertEquals(expected, actual); 
	}
	
	@Test
	
	public void null_test() {
		
	int[] nums2 = new int[] {};
	
	SameFirstLast myArray = new SameFirstLast();
	boolean actual = myArray.isItTheSame(nums2);
	boolean expected = false;
	
	Assert.assertEquals(expected, actual); 
	}
}
