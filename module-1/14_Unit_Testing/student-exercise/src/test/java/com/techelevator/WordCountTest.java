package com.techelevator;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {
	
	
	@Test
	public void string_appears_twice() {
	
	
	String[] words = new String[] {"ha", "hip", "ha", "she"};
	Map<String, Integer> expected = new HashMap<>();
	
		expected.put("ha", 2);
		expected.put("hip", 1);
		expected.put("she", 1);
	
	WordCount dino = new WordCount();
	Map<String, Integer> actual = dino.getCount(words);
	 
	Assert.assertEquals(expected, actual); 
	}

	
	@Test
	public void string_appears_once() {
	
	
	String[] words = new String[] {"ba", "bip", "bee"};
	Map<String, Integer> expected = new HashMap<>();
	
		expected.put("ba", 1);
		expected.put("bip", 1);
		expected.put("bee", 1);
	
	WordCount dino = new WordCount();
	Map<String, Integer> actual = dino.getCount(words);
	 
	Assert.assertEquals(expected, actual); 
	}

	@Test
	public void string_appears_thrice() {
	
	
	String[] words = new String[] {"sa", "sip", "sa", "she", "sa"};
	Map<String, Integer> expected = new HashMap<>();
	
		expected.put("sa", 3);
		expected.put("sip", 1);
		expected.put("she", 1);
	
	WordCount dino = new WordCount();
	Map<String, Integer> actual = dino.getCount(words);
	 
	Assert.assertEquals(expected, actual); 
	}

	@Test
	public void string_appears_none() {
	
	
	String[] words = new String[] {};
	Map<String, Integer> expected = new HashMap<>();
	
	
	WordCount dino = new WordCount();
	Map<String, Integer> actual = dino.getCount(words);
	 
	Assert.assertEquals(expected, actual); 
	}

	
}
