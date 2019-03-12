/**
 * This class finds the palindromes under specific criteria from  
 * a user entered range.
 * Auhtor: Jasdeep Singh
 * Date: February 26, 2019
 */
package jsing287;

import java.util.Scanner;


public class Jsing287_lab03_q2 {

	// This method acts as a palindrome calculator and finds the number of palindromes that are divisible by a user entered value and within a user entered range.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    // Declaring local variables firstNum, count, and correct
	int firstNum = 0;
	int count = 1;
	boolean correct = true;

	// Initializing the String variable holder for conversion of firstNum.
	String holder;
	
	
	// Initializing a scanner called in.
	Scanner in = new Scanner(System.in);

	// Asking the user for an integer within the range of 1 to 999 inclusive.
	System.out.println("Please enter an integer between 1 to 9999 inclusive");
	firstNum = in.nextInt();
	
	// This loop checks that the entered integer is within range.
	while(!(firstNum <=9999 && firstNum >=1))
	{
	 System.out.println("Invalid input, please enter a number between 1 and 9999 inclusive: ");
	 firstNum = in.nextInt();
	}
	
	// Asking the user for a divisor within the range of 1 to 150 inclusive.
	System.out.println("Please enter a divisor from 1 to 150 inclusive: ");
	int divisor = in.nextInt();
	
	// This loop checks that divisor is within range.
	while(!(divisor >= 1 && divisor <= 150))
	{          
		System.out.println("Invalid input, please enter a number between 1 and 150 inclusive: ");
		
		divisor = in.nextInt(); 
		
	}
	
	
	System.out.println("The palindromes are: ");
	
	// This for loop checks all numbers between 1 and firstNum that are palindromes
	for(int i = 1; i <= firstNum; i++)
	{
		
    // Converting i to a string and initializing low equal to 0.
	holder = Integer.toString(i);
	int low = 0;
	
	// Setting high equal to the last character in the string
	int high = holder.length() - 1;
	
	// boolean variable set to true.
	boolean check = true;
	
	// A loop that checks if each character in the string is equal to each other and if not sets check equal to false.
	while (low < high) {
		
	// Comparing the character at low and high
	if (holder.charAt(low) != holder.charAt(high)) 
	{
	check = false;
	
	}
	low++;
	high--;
	}
	
	// Outputting the palindrome if it is divisible by the user entered divisor.
	if (check== true && Integer.parseInt(holder)%divisor==0 )
		System.out.print(holder + " ");
		
		
	
	}
	
		
	}
	}

	
	
	


