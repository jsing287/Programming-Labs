/**
 * This class helps the user practice simple math problems in various ways. 
 * Author: Jasdeep Singh
 * Date: March 12, 2018
 */
package jsing287;

import java.util.Scanner;


public class Jsing287_lab05_q3 {

	// Any method can access this Scanner for use.
	public static Scanner input = new Scanner(System.in);
	
	// Declaring an object of this class named methods.
	static Jsing287_lab05_q3 methods = new Jsing287_lab05_q3();
	
	
	// The main method acts as the control panel of the program as it sends and receives information from methods.
	public static void main(String[] args) 
	{
		// Declaring local variables.
		int question = 1;
		int labNum = 5;
		int right = 0;
		int first= 0;
		int second = 0;
		boolean correct = true;
		boolean loop =true;
		String firstName = "Jasdeep";
		String lastName = "Singh";
		String missionStatement = " This program allows a user to practise addition subtraction and multplication problems at varies difficulties.";
		
		// Passing header arguments to the header method and calling it.
		printHeader(labNum, question, firstName, lastName, missionStatement);
		
		// Retrieving the users difficulty choice.
		int choice = fetchDifficulty();
	    
	   // This while loop will go on forever unless the user inputs a 6 terminating the whole problem.
	   while(loop == true)
	   {
		   // Retrieving the problem type.
		   int operation = fetchProblemType();
	   
		// Resetting the difficulty and problem type of the program if the users decides to.
		if(operation == 5)
		{
		   choice = fetchDifficulty();
		   operation = fetchProblemType();
		}
		// This statement will terminate the program.
		else if(operation == 6)
		{
			System.exit(0);
		}
		// This for-loop will iterate 10 times outputting 10 questions based on the users criteria.
		for(int i = 1; i <= 10; i++)
		{
			// This statement will run if the user selects Addition on the Easy mode.
			if(operation == 1 && choice == 1)
			{
				// Retrieves the first and second integers and then runs the presentQuestion method to see if the user got the answer right.
				 first = randomInt(0,10);
				 second = randomInt(0,10);
				 correct = presentQuestion('+', i, first, second);	
				
			}
			// This statement will run if the user selects Addition on the Medium Mode.
			else if(operation == 1 && choice == 2)
			{
				// Retrieves the first and second integers and then runs the presentQuestion method to see if the user got the answer right.
				first = randomInt(0,100);
				second = randomInt(0,100);
				correct = presentQuestion('+', i, first, second);
				
			}
			// This statement will run if the user selects Addition on the Hard mode.
			else if(operation == 1 && choice == 3)
			{
				// Retrieves the first and second integers and then runs the presentQuestion method to see if the user got the answer right.
				first = randomInt(-100,100);
				second = randomInt(-100,100);
				correct = presentQuestion('+', i, first, second);
			}
			// This statement will run if the user selects Subtraction on the Easy mode.
			else if(operation == 2 && choice == 1)
			{
				// Retrieves the first and second integers and then runs the presentQuestion method to see if the user got the answer right.
				first = randomInt(0,10);
				second = randomInt(0,10);
				correct = presentQuestion('-', i, first, second);
				
			}
			// This statement will run if the user selects Subtraction on the Medium mode.
			else if(operation == 2 && choice == 2)
			{
				// Retrieves the first and second integers and then runs the presentQuestion method to see if the user got the answer right.
				first = randomInt(0,100);
				second = randomInt(0,100);
				correct = presentQuestion('-', i, first, second);
			}
			// This statement will run if the user selects Subtraction on the Hard mode.
			else if(operation == 2 && choice == 3)
			{
				// Retrieves the first and second integers and then runs the presentQuestion method to see if the user got the answer right.
				first = randomInt(-100,100);
				second = randomInt(-100,100);
				correct = presentQuestion('-', i, first, second);
				
			}
			// This statement will run if the user selects multiplication on the Easy mode.
			else if(operation == 3 && choice == 1)
			{
				// Retrieves the first and second integers and then runs the presentQuestion method to see if the user got the answer right.
				first = randomInt(0,10);
				second = randomInt(0,10);
				correct = presentQuestion('*', i, first, second);
			}
			// This statement will run if the user selects multiplication on the Medium mode.
			else if(operation == 3 && choice == 2)
			{
				// Retrieves the first and second integers and then runs the presentQuestion method to see if the user got the answer right.
				first = randomInt(0,100);
				second = randomInt(0,100);
				correct = presentQuestion('*', i, first, second);
				
			}
			// This statement will run if the user selects multiplication on the Hard mode.
			else if(operation == 3 && choice == 3)
			{
				// Retrieves the first and second integers and then runs the presentQuestion method to see if the user got the answer right.
				first = randomInt(-100,100);
				second = randomInt(-100,100);
				correct = presentQuestion('*', i, first, second);
			}

			// This statement will run if the user selects random on the Easy mode.
			else if(operation == 4 && choice == 1)
			{

				// Retrieves the first and second integers and then runs the presentQuestion method to see if the user got the answer right.
				first = randomInt(0,10);
				second = randomInt(0,10);
				correct = presentQuestion( i, first, second);
				
			}

			// This statement will run if the user selects random on the Medium mode.
			else if(operation == 4 && choice == 2)
			{

				// Retrieves the first and second integers and then runs the presentQuestion method to see if the user got the answer right.
				first = randomInt(0,100);
				second = randomInt(0,100);
				correct = presentQuestion(i, first, second);
			}

			// This statement will run if the user selects random on the Hard mode.
			else if(operation == 4 && choice == 3)
			{

				// Retrieves the first and second integers and then runs the presentQuestion method to see if the user got the answer right.
				first = randomInt(-100,100);
				second = randomInt(-100,100);
				correct = presentQuestion(i, first, second);
				
			}
			
			// This statement will increment the right variable depending on if the user got the answer right or not.
			if(correct == true)
			{
				right++;
			}
			
		
			
		  }
		// Outputting the users results and resetting right to zero.
		System.out.println("You answered " + right + "/10" + " correctly. ");
		right = 0;
		
	   }
		
		

	}
	
	
	   // This method uses specific arguments given from the main method and prints it out to the console.
		public static void printHeader(int labNum, int questionNum, String fName, String lName, String mission)
		{
			   
			   
				// Printing out the top *
				for(int i = 0; i < mission.length(); i++)
				{
					System.out.print("*");
				}
				System.out.println();
				System.out.println(mission);
				for(int i = 0; i < mission.length(); i++)
				{
					System.out.print("*");
				}
				// Printing out the lab, question, and name variables.
				System.out.println();
				System.out.println("Lab " + labNum);
				System.out.println("Question " + questionNum);
				System.out.println("Name: " + fName + " " + lName);
				// Printing out the bottom *
				for(int i = 0; i < mission.length(); i++)
				{
					System.out.print("*");
				}
			    System.out.println();
		}
		
    // This method asks the user to select a difficulty option within the program.
	public static int fetchDifficulty()
	{
		
		
		  // Prompting the user will options.
		  System.out.println("Welcome to the math practise program!");
		  System.out.println("Please choose a difficulty level: ");
		  System.out.println("1. Easy: Integers ranging between 0 and 10");
		  System.out.println("2. Medium: Integers ranging between 0 and 100");
		  System.out.println("3. Difficult: Integers ranging between -100 and 100");
		
		int choice = input.nextInt();
				
		// A while loop that checks if the entered integer is valid.
		while(!(choice >0 && choice <4))
		{
			System.out.println("Invalid Difficulty choice. Please enter an integer (1-3)");
			choice = input.nextInt();
		}
		
		return choice;
			
	}
	
	// This method asks the user to enter a problem type.
	public static int fetchProblemType ()
	{
		// Prompting the user with options.
		System.out.println("Please select the types of problems: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Random");
		System.out.println("5. Change difficulty");
		System.out.println("6. Exit");
		
		int decision = input.nextInt();
		
		// Validating the entered number.
		while(!(decision>0 && decision <7))
		{
			System.out.println("Invalid problem choice, Please enter a integer (1-6)");
			decision = input.nextInt();
		}
		
		return decision;
	}
	
	// This method outputs the questions for the random option within the program.
	public static boolean presentQuestion( int question, int numOne, int numTwo)
	{
		// Declaring local variables.
		int correct;
		int answer;
		char operationSymbol = ' '; 
		int typeOp = (int)(Math.random()*3+1);
		
		// This series of if-else statement sets the type of question to be given to the user based on a random integer.
		if(typeOp == 1)
		{
			operationSymbol = '+';
		}
		else if(typeOp == 2)
		{
			operationSymbol = '-';
		}
		else if(typeOp == 3)
		{
			operationSymbol = '*';
		}
		
		// This switch statement has an addition, subtraction, and multiplication option.
		switch(operationSymbol)
		{
		     // This is the addition case which outputs a question and returns true or false based on the answer.
		      case'+':
		    	     // Prompting the user with the addition question.
		          System.out.println("Question " + question);
		          System.out.println("What is the result of: " + numOne + " + "  + numTwo);
		          correct = numOne + numTwo;
		          answer = input.nextInt();
		           
		           // Checks the users answer to be correct or not.
		          if(answer == correct)
		          {
		        	     System.out.println("Correct!");
		        	     return true;
		          }
		          else 
		          {  System.out.println("Wrong! The right answer is " + correct);
		        	     return false;
		          }
		       
		          
		      // This is the subtraction case that outputs a question and returns true or false based on the answer.
		      case '-':
		    	      // Prompting the user with the subtraction question.
		    	      System.out.println("Question " + question);
		          System.out.println("What is the result of: " + numOne + " - " + numTwo);
		           correct = numOne - numTwo;
		           answer = input.nextInt();
		          if(answer == correct)
		          {
		        	     System.out.println("Correct!");
		        	     return true;
		          }
		          else 
		          {  System.out.println("Wrong! The right answer is " + correct);
		        	     return false;
		          }
		         
		       // This is the multiplication case that outputs a question and returns true or false based on the answer.
		      case '*':
		    	    // Prompting the user with the multiplication question.
		    	      System.out.println("Question " + question);
		    	      System.out.println("What is the result of: " + numOne + " x " + numTwo);
		    	      correct = numOne * numTwo;
			      answer = input.nextInt();
			      
			         // Checking to see if the entered answer was correct.
			          if(answer == correct)
			          {
			        	     System.out.println("Correct!");
			        	     return true;
			          }
			          else 
			          {  System.out.println("Wrong! The right answer is " + correct);
			        	     return false;
			          }
		      
			}
		return false;
		
	}
	
	
	// This method outputs the questions for the first three options within the program being addition, subtraction, or multiplication.
	public static boolean presentQuestion (char operationSymbol, int question, int numOne, int numTwo)
	{
		//Declaring local variables.
		int correct;
		int answer;
		
		// This switch statement outputs an addition, subtraction, or multiplication question based on the users decision.
		switch(operationSymbol)
		{
		// This is the addition case which outputs a question and returns true or false based on the answer.
		      case'+':
		    	  // Prompting the user with the multiplication question.
		          System.out.println("Question " + question);
		          System.out.println("What is the result of: " + numOne + " + "  + numTwo);
		           correct = numOne + numTwo;
		           answer = input.nextInt();
		           
		        // Checking to see if the entered answer was correct.
		          if(answer == correct)
		          {
		        	     System.out.println("Correct!");
		        	     return true;
		          }
		          else 
		          {  System.out.println("Wrong! The right answer is " + correct);
		        	     return false;
		          }
		       
		       // This is the subtraction case which outputs a question and returns true or false based on the answer.
		      case '-':
		    	  // Prompting the user with the multiplication question.
		    	      System.out.println("Question " + question);
		          System.out.println("What is the result of: " + numOne + " - " + numTwo);
		           correct = numOne - numTwo;
		           answer = input.nextInt();
		        // Checking to see if the entered answer was correct.
		          if(answer == correct)
		          {
		        	     System.out.println("Correct!");
		        	     return true;
		          }
		          else 
		          {  System.out.println("Wrong! The right answer is " + correct);
		        	     return false;
		          }
		         
		       // This is the multiplication case which outputs a question and returns true or false based on the answer.
		      case '*':
		    	  
		    	  // Prompting the user with the multiplication question.
		    	      System.out.println("Question " + question);
		    	      System.out.println("What is the result of: " + numOne + " x " + numTwo);
		    	      correct = numOne * numTwo;
			      answer = input.nextInt();
			   // Checking to see if the entered answer was correct.
			          if(answer == correct)
			          {
			        	     System.out.println("Correct!");
			        	     return true;
			          }
			          else 
			          {  System.out.println("Wrong! The right answer is " + correct);
			        	     return false;
			          }
		      
			}
		return false;
		
	}
	
	
	
	// This method creates all of the random integers for the program.
	public static int randomInt (int minRange ,int maxRange)
	{
		// Returns an integer for the Easy mode.
		if(minRange == 0 && maxRange ==10)
		{
			int num = (int)(Math.random()*10);
			return num;
		}
		// Returns an integer for the Medium mode.
		else if(minRange == 0 && maxRange == 100)
		{
			int num = (int)(Math.random()*100);
			return num;
		}
		// Returns an integer for the Hard mode.
		else if(minRange == -100 && maxRange == 100)
		{
			// Randomly deciding if the integer will be positive or negative.
			int random = (int)(Math.random()*2)+1;
			if(random == 1)
			{
				int num = -1*(int)(Math.random()*100);
				return num;
			}
			else if(random == 2)
			{
				int num = (int)(Math.random()*100);
				return num;
			}
			
	
		}
		return 0;
	}
}
