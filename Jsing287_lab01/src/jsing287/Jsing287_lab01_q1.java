/**
 * This class computes an objects volume from user given parameters.
 * Author: Jasdeep Singh
 * Date: February 5, 2019
 */
package jsing287;

import java.util.Scanner;
import java.lang.Math.*;


public class Jsing287_lab01_q1 {


	// Computes the volume of a cone from entered user values for radius and height.
	public static void main(String[] args)
	{
	
		
		// Required Header.
		System.out.println("*******************************************");
		System.out.println("ES1036B: Lab 01 Q1");
		System.out.println("Date: February 5 2019");
		System.out.println("Name: Jasdeep Singh");
		System.out.println("Student Number: 251009989");
		System.out.println("Program's mission: This program asks the user for the radius and height of a cone and calculates its volume. ");
		System.out.println("*******************************************");
		
		// Creating the radius, cone, and height variables of type double.
		double radius = 0.0, height = 0.0, volume = 0.0;
		
		// Creating a new scanner called input to accept user input from the keyboard.
		Scanner input =  new Scanner(System.in);
		
	
		// Asks the user for the height of the cone and takes in the value.
		System.out.println("Please enter the height of the cone:");
		height = input.nextDouble();
		
		// Asks the user for the radius of the cone and hold the value.
		System.out.println("Please enter the radius of the cone:");
		radius = input.nextDouble();
		
		
		// Computes the volume.
		volume = ((Math.PI*(Math.pow(radius, 2.0))*height))/3;
		
		// Outputs the volume of the cone to the user.
		System.out.println("The volume of the cone with radius " + radius + "cm" + " and height " + height + "cm" +  " is " +  volume + " cubic cm");
		
	}

}
