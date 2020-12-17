package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		
Scanner keyboard = new Scanner(System.in);

System.out.print("Please enter the length:");
String userLength = keyboard.nextLine();
int parsedUserLength = Integer.parseInt(userLength);

double metricLength = parsedUserLength * 3.2808399;
double englishLength = parsedUserLength * 0.3048;

System.out.print("Is the measurement in (m)eter, or (f)eet?");
String unitMeasurement = keyboard.nextLine();

if(unitMeasurement.equals("m")) {
	System.out.println(userLength + "m is " + englishLength + "f");
}
else if(unitMeasurement.contentEquals("f")) {
	System.out.println(userLength + "f is " + metricLength + "m");
}
else {
	System.out.println("Try again and enter your length in meters(m) or in feet(f)");
}

	}

}
