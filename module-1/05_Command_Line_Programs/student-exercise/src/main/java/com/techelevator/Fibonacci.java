package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int fibNumber = 0;
		int num1 = 0;
		int num2 = 1;
		
		System.out.println("Please enter the Fibonacci number:");
		fibNumber = keyboard.nextInt();	
		
		int i = 1;
		while(num1 <= fibNumber) {
			System.out.print(num1 + ", ");
			int sumOfTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfTwo;
			i++;
		}
		
	}

}
