package com.techelevator;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTest {


	@Test
	public void elephant_herd() {
		
		Map<String, String> animalsTwo = new HashMap<>();
		animalsTwo.put("elephant", "Herd");
		
		AnimalGroupName myAnimalGroupName  = new AnimalGroupName();
		String actual = myAnimalGroupName.getHerd("elephant");
		String expected = "Herd";
		
		Assert.assertEquals(expected, actual); 
	}
	
	@Test
	public void all_capitalized_elephant_herd() {
		
		Map<String, String> animalsTwo = new HashMap<>();
		animalsTwo.put("elephant", "Herd");
		
		AnimalGroupName myAnimalGroupName  = new AnimalGroupName();
		String actual = myAnimalGroupName.getHerd("ELEPHANT");
		String expected = "Herd";
		
		Assert.assertEquals(expected, actual); 
	}
	
	@Test
	public void capitalized_pigeon_kit() {
		
		Map<String, String> animalsTwo = new HashMap<>();
		animalsTwo.put("Pigeon", "Kit");
		
		AnimalGroupName myAnimalGroupName  = new AnimalGroupName();
		String actual = myAnimalGroupName.getHerd("Pigeon");
		String expected = "Kit";
		
		Assert.assertEquals(expected, actual); 
	}
	
	@Test
	public void empty_string_unknown() {
		
		Map<String, String> animalsTwo = new HashMap<>();
		animalsTwo.put("dog", "Pack");
		
		AnimalGroupName myAnimalGroupName  = new AnimalGroupName();
		String actual = myAnimalGroupName.getHerd("");
		String expected = "unknown";
		
		Assert.assertEquals(expected, actual); 
	}
	
	@Test
	public void kangaroo_unknown() {
		
		Map<String, String> animalsTwo = new HashMap<>();
		animalsTwo.put("elephant", "herd");
		
		AnimalGroupName myAnimalGroupName  = new AnimalGroupName();
		String actual = myAnimalGroupName.getHerd("kangaroo");
		String expected = "unknown";
		
		Assert.assertEquals(expected, actual); 
	}
}
