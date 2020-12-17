package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner word = new Scanner(System.in);
		
		
		System.out.println("What is the file that should be searched?");
		String userinput = input.nextLine();
		System.out.println("What is the search word you are looking for?");
		String searchedWord = word.nextLine();
		System.out.println("Should the search be case sensitive? (Y\\N)");
		String caseChoice = word.nextLine();
		
		File filler = new File(userinput);
		try {
			
			Scanner book = new Scanner(filler);
			int lineNumber = 1;
			while(book.hasNext()) {
				String lineOfInput = book.nextLine();
				//System.out.println(lineOfInput);
				if(caseChoice == "Y") {
					if(lineOfInput.equalsIgnoreCase(searchedWord)) {
						System.out.println(lineNumber + ") " +lineOfInput);
					}
				} else {
					if(lineOfInput.contains(searchedWord)) {
						System.out.println(lineNumber + ") " +lineOfInput);
				}
				}
			
			lineNumber++;
			}
				
				
				
				
		
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
	
		
		
	}
		
}
		
		
		
		
		
		
		
		

