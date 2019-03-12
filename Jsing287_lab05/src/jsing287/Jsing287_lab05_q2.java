/**
 * This class calculates the result of a base value being multiplied by an exponent 
 * for both positive and negative exponents.
 * Author: Jasdeep Singh
 * Date: March 12, 2019
 * 
 */
package jsing287;

import java.util.Scanner;


public class Jsing287_lab05_q2 {

	// The main method prompts the user for values and then passes these values as arguments to the computePower method.
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		// Local variables for the Scanner object and the integers base, and power.
		Scanner input = new Scanner(System.in);
		double base = 0;
		int power = 0;
		
		// Prompting the user for the base value
		System.out.println("Please enter a real number base: ");
		base = input.nextDouble();
		
		// Prompting the user for the power value.
		System.out.println("Please enter a Integer exponent: ");
		power = input.nextInt();
		
		// Retrieving the finalAnswer.
		double finalAnswer = computePower(base, power);
		
		// Outputting the finalAnswer.
		System.out.println("The result is: " + finalAnswer);
		
	}
	
	// This method calculates the result of the base being mutiplied power amount of times.
	public static double computePower(double base, int power)
	{
		double answer = 1;
		
		// A series of if else statements to evaluate if the power given is +, -, or zero.
		if(power==0)
		{
			return 1.0;
		}
		else if(power > 0)
		{
			// Multiplying the base by itself a power amount of times.
			for(int i = 1; i <=power;i++)
			{
			   answer*=base;
			}
			
			return answer;
		}
		else if(power<0) 
		{
			for(int i = power; i <0;i++)
			{
			   answer*=base;
			}
			// Since the power is negative the final answer is one divided by the result above and then returned.
			answer = 1/answer;
			return answer;
						
		}
		return 0;
			
	}

}
