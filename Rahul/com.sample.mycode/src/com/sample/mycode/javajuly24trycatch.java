package com.sample.mycode;
import java.util.Scanner;
public class javajuly24trycatch {

	public static void main(String[] args) {
		 final Scanner scanner = new Scanner(System.in);


		 

		    System.out.println("Please enter a number: ");

		    try {

		      final int number = scanner.nextInt();

		      System.out.println("Entered number is: " + number);

		    } catch (final Exception e) {

		      System.out.println("Sorry, you entered something that's not an integer!");

		      System.out.println("Please run the program again, and enter an integer");

		    }

	}

}
