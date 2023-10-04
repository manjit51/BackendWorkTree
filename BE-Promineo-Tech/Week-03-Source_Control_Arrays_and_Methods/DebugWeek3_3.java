package com.promineotech;

import java.util.Scanner;

public class DebugWeek3_3 {

	public static void main(String args[]) {
      // initialize int "item"
		int item;
      // intialize String "output"
		String output;
      // initialize and set an immutable int "LOW" to 111
		final int LOW = 111;
      // initialize and set an immutable int "HIGH" to 999
		final int HIGH = 999;
      // initialize and set an immutable int "CUTOFF" to 500
		final int CUTOFF = 500;
      // intialize and set a String to be the output of the scanners input.
		Scanner input = new Scanner(System.in);
      
		System.out.println("Please enter item number");
      // the item integer is now what the user typed
		item = input.nextInt();
      // if the number is too low
		if (item < LOW) {
         // say its too low
			output = "Item number too low";
      // if the number is too high
		} else if (item > HIGH) {
			// say its to high
			output = "Item number too high";
      // if the number is lower than the cutoff value
		} if (item < CUTOFF) {
         // it is valid so it exists in the department
			output = "Valid - in Automotive Department";
      // if nothing got triggered
		} else {
         // say it was a valid number
			output = "Valid - Item in Housewares Department";
		}
		{
         // print out the output of the if/else statement chain
			System.out.println(output);

		}

	}
}
