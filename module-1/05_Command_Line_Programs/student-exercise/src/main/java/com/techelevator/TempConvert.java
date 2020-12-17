package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the temperature:");
		String userTemp = keyboard.nextLine();
		int parsedUserTemp = Integer.parseInt(userTemp);

		double tempC = (parsedUserTemp - 32) / 1.8;
		double tempF = (parsedUserTemp * 1.8) + 32;

		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit?");
		String unitTemp = keyboard.nextLine();

		if(unitTemp.equals("C")) {
			System.out.println(userTemp + "C is " + tempF + "F");
		}
		else if(unitTemp.equals("F")) {
			System.out.println(userTemp + "F is " + tempC + "C");
		}
		else {
			System.out.println("Try again and enter your temperature in Celcius(C) or in Fahrenheit(F)");
		}

			}

		
		
	}


