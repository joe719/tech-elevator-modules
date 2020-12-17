package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {

		
		@Test
		
		public void three_12s() {
			
		int[] nums2 = new int[] {12, 5, 4};
		
		MaxEnd3 a = new MaxEnd3();
		int[] actual = a.makeArray(nums2);
		int[] expected = {12, 12, 12};
		
		Assert.assertArrayEquals(expected, actual); 
		}
		
		@Test
		
		public void all_12s() {
			
		int[] nums2 = new int[] {12, 12, 12};
		
		MaxEnd3 a = new MaxEnd3();
		int[] actual = a.makeArray(nums2);
		int[] expected = {12, 12, 12};
		
		Assert.assertArrayEquals(expected, actual); 
		}
		
		}
	
	

