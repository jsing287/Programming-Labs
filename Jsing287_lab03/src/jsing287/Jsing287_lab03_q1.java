/**
 * This class finds the largest integer out of a 
 * set of user entered values.
 * Author: Jasdeep Singh
 * Date: February 26, 2019
 */
package jsing287;

import java.util.Scanner;


public class Jsing287_lab03_q1 {

	
	
	// This method asks a user for four integers and finds the largest number out of the four.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initializing the four numbers, two holder variables, and the Scanner object for the program.
		int num1, num2, num3, num4;
		int max = 0;
		int winner = 0;
		Scanner in = new Scanner(System.in);
		
		// Boolean variable for the while loops.
		boolean range = true;
		
		// Prompting the user for the first number.
		System.out.println("Please enter the first integer:");
		num1 = in.nextInt();
		
	   // A while loop that insures that the entered number is within the range of -1000 to 1000 and not divisible by 17 and 23.
		while(!(num1<= 1000 && num1>=-1000 && num1%17 != 0 && num1%23 != 0))
		{
			System.out.println("Incorrect input, please enter a value in the range of -1000 and 1000 inclusive."
					+ "\nPlease also ensure that the entered integer is not divisble by 17 or 23  ");
			
			num1 = in.nextInt();
		}
		
		// Prompting the user for the second number
		System.out.println("Please enter the second integer:");
		num2 = in.nextInt();
		
		// A while loop that insures that the entered number is within the range of -1000 to 1000 and not divisible by 17 and 23.
		while(!(num2<= 1000 && num2>=-1000 && num2%17 != 0 && num2%23 != 0))
		{
			System.out.println("Incorrect input, please enter a value in the range of -1000 and 1000 inclusive."
					+ "\nPlease also ensure that the entered integer is not divisble by 17 or 23  ");
		
			num2 = in.nextInt();
		}
		
		// Prompting the user for the third number.
		System.out.println("Please enter the third integer: ");
		num3 = in.nextInt();
		
		// A while loop that insures that the entered number is within the range of -1000 to 1000 and not divisible by 17 and 23.
		while(!(num3<= 1000 && num3>=-1000 && num3%17 != 0 && num3%23 != 0))
		{
			System.out.println("Incorrect input, please enter a value in the range of -1000 and 1000 inclusive."
					+ "\nPlease also ensure that the entered integer is not divisble by 17 or 23  ");
		
			num3 = in.nextInt();
		}
		
		
		// Prompting the user for the fourth number
		System.out.println("Please enter the fourth integer: ");
		num4 = in.nextInt();
		
		// A while loop that insures that the entered number is within the range of -1000 to 1000 and not divisible by 17 and 23.
		while(!(num4<= 1000 && num4>=-1000 && num4%17 != 0 && num4%23 != 0))
		{
			System.out.println("Incorrect input, please enter a value in the range of -1000 and 1000 inclusive."
					+ "\nPlease also ensure that the entered integer is not divisble by 17 or 23  ");
	
			num4 = in.nextInt();
		}
		
	    for(int i = 0; i < 4; i++)
	    {
	    	
	    }
	    
	    // if-else-if statements that find the largest number out of the four integers and sets winner equal to a range between 1-4 accordingly.
        if(num1 >= num2 && num1 >= num3 && num1 >= num4)
        {
        	   max = num1;
        	   winner = 1;
        }
        else if(num2 >=num1 && num2 >=num3 && num2 >= num4)
        {
        	max = num2;
        	winner = 2;
        }
        else if(num3 >= num1 && num3 >= num2 && num3 >= num4)
        {
        	max = num3;
        	winner = 3;
        }
        else if(num1 == num2 && num2 == num3 && num3 == num4)
        {
        	System.out.println("All four numbers are the same value.");
        	System.out.println("the largest number is " + num1);
        }
        else 
        {
        	max = num4;
        	winner = 4;
        }
        
        // This switch statement outputs the largest number out of the four numbers that are entered.
        switch(winner)
        {
        case 1: 
        	      System.out.println("The largest number is " +  num1);
        	      break;
        case 2:
        	      System.out.println("The largest number is "+ num2);
        	      break;
        case 3:
        	     System.out.println("the largest number is "+ num3) ;
        	     break;
        case 4:
        	      System.out.println("The largest number is "+ num4);
        	      break;
        	
        }
        	
        
	
	}

}
