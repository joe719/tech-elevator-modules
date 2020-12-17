package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the value that should be tested");
		String userInput = input.nextLine();
		int fBNumber = Integer.parseInt(userInput);
		
		//create file object
		
		
		File newFile = new File("FizzBuzz.txt");
		try {
			newFile.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("absolutePath: " + newFile.getAbsolutePath());
		
		boolean fBThree = fBNumber % 3 == 0;
		boolean fBFive = fBNumber % 5 == 0;
		
		//write to file object
		try (PrintWriter dataOutput = new PrintWriter(newFile)) {
		
			if(fBThree && !fBFive || userInput.contains("3")) {
				dataOutput.println("Fizz");
			}
			else if(!fBThree && fBFive || userInput.contains("5")) {
				dataOutput.println("Buzz");
			}
			else if(fBNumber % 3 == 0 && fBNumber % 5 == 0) {
				dataOutput.println("FizzBuzz");
			}
			else {
				dataOutput.println("Try Again"); 
			}
			
		}
			//fizzbuzz method
			
			catch (FileNotFoundException ex) {
				System.err.println("Can not open file for writing");
			}
		

	}
	}