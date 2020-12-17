package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {

@Test
public void having_2_and_over_8_means_no_table() {
	
	DateFashion myDateFashion = new DateFashion();
	int actual = myDateFashion.getATable(2, 8);
	int expected = 0;
	
	Assert.assertEquals(expected, actual); 
}

@Test
public void having_8_for_both_means_table() {
	
	DateFashion myDateFashion = new DateFashion();
	int actual = myDateFashion.getATable(8, 8);
	int expected = 2;
	
	Assert.assertEquals(expected, actual); 
}

@Test
public void having_8_and_over_2_under_8_means_table() {
	
	DateFashion myDateFashion = new DateFashion();
	int actual = myDateFashion.getATable(8, 5);
	int expected = 2;
	
	Assert.assertEquals(expected, actual); 
}

@Test
public void having_under_8_and_over_2_for_both_means_maybe_table() {
		
		DateFashion myDateFashion = new DateFashion();
		int actual = myDateFashion.getATable(4, 6);
		int expected = 1;
		
		Assert.assertEquals(expected, actual); 
	
}

@Test
public void having_under_8_over_2_and_under_2_means_no_table() {
	
	DateFashion myDateFashion = new DateFashion();
	int actual = myDateFashion.getATable(1, 5);
	int expected = 0;
	
	Assert.assertEquals(expected, actual); 

}

@Test
public void having_under_2_for_both_means_no_table() {
	
	DateFashion myDateFashion = new DateFashion();
	int actual = myDateFashion.getATable(1, 1);
	int expected = 0;
	
	Assert.assertEquals(expected, actual); 

}	
}
	

