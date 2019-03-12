/**
 * This class prompts the user will various math problems
 * of varying difficulty.
 * Author: Jasdeep Singh
 * Date: March 5, 2019
 */

package jsing287;

import java.util.Scanner;

public class Jsing287_lab04_q3 {

	// Fields used throughout the class to use in various methods, etc.
	public static Scanner input = new Scanner(System.in);
	public static Jsing287_lab04_q3 methods = new Jsing287_lab04_q3();
	public static int decision;
	public static int amount = 0;
	


	
	// this main method acts as the control panel for the program.
	public static void main(String[] args) 
	{
		
		// Prompting the user will options.
		System.out.println("Welcome to the math practise program!");
		System.out.println("Please choose a difficulty level: ");
		System.out.println("1. Easy: Integers ranging between 0 and 10");
		System.out.println("2. Medium: Integers ranging between 0 and 100");
		System.out.println("3. Difficult: Integers ranging between -100 and 100");
		int choice = input.nextInt();
		
		// Verifying input.
		while(!(choice>=1 && choice <=3))
		{
			System.out.println("Invalid diffuclty choice!");
			System.out.println("Please input a choice(1-3)");
			choice = input.nextInt();
		}
		
		// Prompting the user with options.
		System.out.println("Please select the types of problems: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Random");
		System.out.println("5. Change difficulty");
		System.out.println("6. Exit");
		
	    decision = input.nextInt();
	    
	    // Verifying input.
		while(!(decision>=1 && decision <= 6))
		{
			System.out.println("Invalid please enter a choice 1-6: ");
			decision = input.nextInt();
		}
		
		
		// Analyzing which option was chosen and which method to run.
		if(choice == 1 && decision == 1)
		{
			methods.additionEasy();
		}
		else if(choice == 2 && decision == 1)
		{
			methods.additionMedium();
		}
		else if(choice == 3 && decision == 1)
		{
			methods.additionHard();
		}
		else if(choice == 1 && decision == 2)
		{
			methods.subtractionEasy();
		}
		else if(choice == 2 && decision == 2)
		{
			methods.subtractionMedium();
		}
		else if(choice == 3 && decision == 2)
		{
			methods.subtractionHard();
		}
		else if(choice == 1 && decision == 3)
		{
			methods.multiplicationEasy();
		}
		else if(choice == 2 && decision == 3)
		{
			methods.multiplicationMedium();
		}
		else if(choice == 3 && decision == 3)
		{
			methods.multiplicationHard();
		}
		else if(choice == 1 && decision  == 4)
		{
			methods.randomEasy();
		}
		else if(choice  == 2 && decision  == 4)
		{
			methods.randomMedium();
		}
		else if(choice == 3 && decision == 4)
		{
			methods.randomHard();
		}
		
	}
	

	
	// This method prompts the user with addition questions ranging with integers from 1-10.
	public void additionEasy()
	{
		int right  =0;
		int wrong = 0;
		double totalTime = 0;
		
		// This loop runs for 10 questions.
		   for(int i = 0; i <10; i++)
		       {
			    System.out.println("Question " + (i+1));
			    
			    // Calculating two random integers.
		        int num1 = (int)(Math.random()*10);
		        int num2 = (int)(Math.random()*10);
		        int resultActual = num2 + num1;
		        int resultUser = 0;
		   
		
		        // Prompting the user with the question and starting the timer.
		        double start = System.currentTimeMillis();
		        System.out.println("What is the result of " + num1  +  " + " + num2);
		
		        resultUser = input.nextInt();
		
		        // Retrieving end time and calculating question time
		        double finish = System.currentTimeMillis();
		        totalTime += (finish-start);
		        
		        // Calculating right and wrong questions.
		        if(resultUser == resultActual)
		        {
			        System.out.println("Correct!");
			        right++;
			    System.out.println();
		        }
		        else 
		        {
			        System.out.println("Incorrect! The correct answers was "  + resultActual);
			        wrong++;
			        System.out.println();
		        }  
		   
		   }
		
		// Outputting results on 10 questions.
		double averageTime = totalTime/10000;
		
		System.out.println("You scored " + right + "/10"  + " questions correctly and \nThe average question time was " + averageTime);
		System.out.println();System.out.println();
		this.main(null);
		
	
		
	}
	

	// This method prompts the user with addition questions ranging from 1-100 SEE ABOVE FOR SPECIFIC COMMENTS.
	public void additionMedium()
	{
		int right  =0;
		int wrong = 0;
		double totalTime= 0;
		
	
		    for(int i = 0; i <10; i++)
		    {
			    System.out.println("Question " + (i+1));
		        int num1 = (int)(Math.random()*100);
		        int num2 = (int)(Math.random()*100);
		        int resultActual = num2 + num1;
		        int resultUser = 0;
		   
		
		        double start = System.currentTimeMillis();
		        System.out.println("What is the result of " + num1  +  " + " + num2);
		
		        resultUser = input.nextInt();
		
		        double finish = System.currentTimeMillis();
		        totalTime += (finish-start);
		        if(resultUser == resultActual)
		        {
			       System.out.println("Correct!");
			       right++;
			       System.out.println();
		        }
		        else 
		        {
			       System.out.println("Incorrect! The correct answers was "  + resultActual);
			       wrong++;
			       System.out.println();
		        } 
	    
		   
		    }
		
		double averageTime = totalTime/10000;
		
		System.out.println("You scored " + right + "/10"  + " questions correctly and \nThe average question time was " + averageTime);
		System.out.println();System.out.println();
		this.main(null);
		
	
	
		
	}
	

	// This method prompts the user with addition questions ranging from -100-100 SEE additionEasy method for specific comments.
	public void additionHard()
	{
		int right  =0;
		int wrong = 0;
		double totalTime= 0;
		
			 for(int i = 0; i <10; i++)
		     {
			     System.out.println("Question " + (i+1));
		        int num1 = (int)(Math.random()*100);
		        int num2 = (-1)*(int)(Math.random()*100);
		        int resultActual = num2 + num1;
		        int resultUser = 0;
		   
		
		        double start = System.currentTimeMillis();
		        System.out.println("What is the result of " + num1  +  " + " + num2);
		
		        resultUser = input.nextInt();
		
		        double finish = System.currentTimeMillis();
		        totalTime += (finish-start);
		        if(resultUser == resultActual)
		        {
			    System.out.println("Correct!");
			    right++;
			    System.out.println();
		        }
		        else 
		        {
			    System.out.println("Incorrect! The correct answers was "  + resultActual);
			    wrong++;
			    System.out.println();
		        }  
		   
		     }
		
		
		double averageTime = totalTime/10000;
		
		System.out.println("You scored " + right + "/10"  + " questions correctly and \nThe average question time was " + averageTime);
		System.out.println();System.out.println();
		this.main(null);
		
	
	
		
	}
	
	// This method prompts the user with subtraction questions ranging from 1-10, see additionEasy method for specific comments
	public void subtractionEasy()
	{
		int right  = 0;
		int wrong = 0;
		double totalTime= 0;
		
	
		   for(int i = 0; i <10; i++)
		   {
			    System.out.println("Question " + (i+1));
		        int num1 = (int)(Math.random()*10);
		        int num2 = (int)(Math.random()*10);
		        int resultActual = num2 - num1;
		        int resultUser = 0;
		   
		
		        double start = System.currentTimeMillis();
		        System.out.println("What is the result of " + num2  +  " - " + num1);
		
		        resultUser = input.nextInt();
		
		        double finish = System.currentTimeMillis();
		        totalTime += (finish-start);
		       if(resultUser == resultActual)
		       {
			        System.out.println("Correct!");
			        right++;
			        System.out.println();
		       }
		       else 
		       {
			        System.out.println("Incorrect! The correct answers was "  + resultActual);
			        wrong++;
			        System.out.println();
		       }  
		   
		   }
		
		double averageTime = totalTime/10000;
		
		System.out.println("You scored " + right + "/10"  + " questions correctly and \nThe average question time was " + averageTime);
		System.out.println();System.out.println();
		this.main(null);
		
	
	}
	
	// This method prompts the user with subtraction questions ranging from 1-100, see additionEasy method for specific comments.
	public void subtractionMedium()
	{
		int right  =0;
		int wrong = 0;
		double totalTime= 0;
		
	
			for(int i = 0; i <10; i++)
			{
		      	System.out.println("Question " + (i+1));
		        int num1 = (int)(Math.random()*100);
		        int num2 = (int)(Math.random()*100);
		        int resultActual = num2 - num1;
		        int resultUser = 0;
		   
		
		        double start = System.currentTimeMillis();
		        System.out.println("What is the result of " + num2  +  " - " + num1);
		
		        resultUser = input.nextInt();
		
		        double finish = System.currentTimeMillis();
		        totalTime += (finish-start);
		        if(resultUser == resultActual)
		        {
			        System.out.println("Correct!");
			        right++;
			        System.out.println();
		        }
		       else 
		       {
			        System.out.println("Incorrect! The correct answers was "  + resultActual);
			        wrong++;
			        System.out.println();
		       }  
		   
		    }
			double averageTime = totalTime/10000;
			
			System.out.println("You scored " + right + "/10"  + " questions correctly and \nThe average question time was " + averageTime);
			System.out.println();System.out.println();
		    this.main(null);
		
		
	
		
	}
	
	// This method prompts the user with subtraction questions ranging from -100 to 100, see additionEasy method for specific comments.
	public void subtractionHard()
	{
		int right  =0;
		int wrong = 0;
		double totalTime= 0;
		
			for(int i = 0; i <10; i++)
			{
				System.out.println("Question " + (i+1));
			   int num1 = (-1)*(int)(Math.random()*100);
			   int num2 = (int)(Math.random()*100);
			   int resultActual = num2 - num1;
			   int resultUser = 0;
			   
			
			   double start = System.currentTimeMillis();
			   System.out.println("What is the result of " + num2  +  " - " + num1);
			
			   resultUser = input.nextInt();
			
			   double finish = System.currentTimeMillis();
			   totalTime += (finish-start);
			   if(resultUser == resultActual)
			   {
				    System.out.println("Correct!");
				    right++;
				    System.out.println();
			   }
			   else 
			   {
				    System.out.println("Incorrect! The correct answers was "  + resultActual);
				    wrong++;
				    System.out.println();
			   }  
			   
			}
		
		
		double averageTime = totalTime/10000;
		
		System.out.println("You scored " + right + "/10"  + " questions correctly and \nThe average question time was " + averageTime);
		System.out.println();System.out.println();
		this.main(null);
		
	
	}
	
	// This method prompts the user with multiplication questions ranging from 1-10, see additionEasy for specific comments.
	public void multiplicationEasy()
	{
		int right  =0;
		int wrong = 0;
		double totalTime= 0;
		
		    for(int i = 0; i <10; i++)
		    {
			    System.out.println("Question " + (i+1));
		        int num1 = (int)(Math.random()*10);
		        int num2 = (int)(Math.random()*10);
		        int resultActual = num2 * num1;
		        int resultUser = 0;
		   
		
		        double start = System.currentTimeMillis();
		        System.out.println("What is the result of " + num1  +  " x " + num2);
		
		        resultUser = input.nextInt();
		
		        double finish = System.currentTimeMillis();
		        totalTime += (finish-start);
		        if(resultUser == resultActual)
		        {
			       System.out.println("Correct!");
			       right++;
			       System.out.println();
		        }
		       else 
		        {
			       System.out.println("Incorrect! The correct answers was "  + resultActual);
			       wrong++;
			       System.out.println();
		        }  
	       }
		
		
		double averageTime = totalTime/10000;
		
		System.out.println("You scored " + right + "/10"  + " questions correctly and \n The average question time was " + averageTime);
		System.out.println();System.out.println();
		this.main(null);
		
	
		
	}
	
	// This method prompts the user with multiplication questions ranging from 1-100, see addition Easy for specific comments.
	public void multiplicationMedium()
	{
		int right  =0;
		int wrong = 0;
		double totalTime= 0;
		
		
			for(int i = 0; i <10; i++)
			{
				System.out.println("Question " + (i+1));
			   int num1 = (int)(Math.random()*100);
			   int num2 = (int)(Math.random()*100);
			   int resultActual = num2 * num1;
			   int resultUser = 0;
			   
			
			   double start = System.currentTimeMillis();
			   System.out.println("What is the result of " + num1  +  " x " + num2);
			
			   resultUser = input.nextInt();
			
			   double finish = System.currentTimeMillis();
			   totalTime += (finish-start);
			   if(resultUser == resultActual)
			   {
				    System.out.println("Correct!");
				    right++;
				    System.out.println();
			   }
			   else 
			   {
				    System.out.println("Incorrect! The correct answers was "  + resultActual);
				    wrong++;
				    System.out.println();
			   }  
			   
			}
		
		
		
		double averageTime = totalTime/10000;
		
		System.out.println("You scored " + right + "/10"  + " questions correctly and \nThe average question time was " + averageTime);
		System.out.println();System.out.println();
		this.main(null);
		
	
		
	}
	
	// This method prompts the user with multiplication questions ranging from -100-100, see additionEasy for specific comments.
	public void multiplicationHard()
	{
		int right  =0;
		int wrong = 0;
		double totalTime= 0;
		
			for(int i = 0; i <10; i++)
			{
				System.out.println("Question " + (i+1));
			   int num1 = (-1)*(int)(Math.random()*100);
			   int num2 = (int)(Math.random()*100);
			   int resultActual = num2 * num1;
			   int resultUser = 0;
			   
			
			   double start = System.currentTimeMillis();
			   System.out.println("What is the result of " + num1  +  " x " + num2);
			
			   resultUser = input.nextInt();
			
			   double finish = System.currentTimeMillis();
			   totalTime += (finish-start);
			   if(resultUser == resultActual)
			   {
				    System.out.println("Correct!");
				    right++;
				    System.out.println();
			   }
			   else 
			   {
				    System.out.println("Incorrect! The correct answers was "  + resultActual);
				    wrong++;
				    System.out.println();
			   }  
			   
			}
		
		
		double averageTime = totalTime/10000;
		
		System.out.println("You scored " + right + "/10"  + " questions correctly and \nThe average question time was " + averageTime);
		System.out.println();System.out.println();
		this.main(null);
		
	
		
	}
	
	// This method prompts the user with random addition, multiplication, and subtraction questions from 1-10. 
	public void randomEasy()
	{
		int right = 0;
		int wrong = 0;
		double totalTime= 0;
		
			for(int i = 0; i <10; i++)
			{
			   System.out.println("Question " + (i+1));
			   int num1 = (int)(Math.random()*10);
			   int num2 = (int)(Math.random()*10);
			   int operation = (int)(Math.random()*3+1);
			   System.out.println(operation);
			   if(operation ==1)
			   {
				   int resultActual = num2 + num1;
				   int resultUser = 0;
				   
				
				   double start = System.currentTimeMillis();
				   System.out.println("What is the result of " + num1  +  " + " + num2);
				
				   resultUser = input.nextInt();
				
				   double finish = System.currentTimeMillis();
				   totalTime += (finish-start);
				   if(resultUser == resultActual)
				   {
					    System.out.println("Correct!");
					    right++;
					    System.out.println();
				   }
				   else 
				   {
					    System.out.println("Incorrect! The correct answers was "  + resultActual);
					    wrong++;
					    System.out.println();
				   }  
			  
			   }
			   else if(operation == 2)
			   {
				   int resultActual = num2 - num1;
				   int resultUser = 0;
				   
				
				   double start = System.currentTimeMillis();
				   System.out.println("What is the result of " + num2  +  " - " + num1);
				
				   resultUser = input.nextInt();
				
				   double finish = System.currentTimeMillis();
				   totalTime += (finish-start);
				   if(resultUser == resultActual)
				   {
					    System.out.println("Correct!");
					    right++;
					    System.out.println();
				   }
				   else 
				   {
					    System.out.println("Incorrect! The correct answers was "  + resultActual);
					    wrong++;
					    System.out.println();
				   }  
			   }
			   else if(operation == 3)
			   {
				   int resultActual = num2 * num1;
				   int resultUser = 0;
				   
				
				   double start = System.currentTimeMillis();
				   System.out.println("What is the result of " + num1  +  " x " + num2);
				
				   resultUser = input.nextInt();
				
				   double finish = System.currentTimeMillis();
				   totalTime += (finish-start);
				   if(resultUser == resultActual)
				   {
					    System.out.println("Correct!");
					    right++;
					    System.out.println();
				   }
				   else 
				   {
					    System.out.println("Incorrect! The correct answers was "  + resultActual);
					    wrong++;
					    System.out.println();
				   }  
			   }
			   
			}
		
		
		double averageTime = totalTime/10000;
		
		System.out.println("You scored " + right + "/10"  + " questions correctly and \nThe average question time was " + averageTime);
		System.out.println();System.out.println();
		this.main(null);
		
	   
		
	}		
	
	


	// This method prompts the user with random addition, multiplication, and subtraction questions from 0-100. 
	public void randomMedium()
	{
		int right  =0;
		int wrong = 0;
		double totalTime= 0;
		
			for(int i = 0; i <10; i++)
			{
			   System.out.println("Question " + (i+1));
			   int num1 = (int)(Math.random()*100);
			   int num2 = (int)(Math.random()*100);
			   int operation = (int)(Math.random()*3+1);
			   if(operation ==1)
			   {
				   int resultActual = num2 + num1;
				   int resultUser = 0;
				   
				
				   double start = System.currentTimeMillis();
				   System.out.println("What is the result of " + num1  +  " + " + num2);
				
				   resultUser = input.nextInt();
				
				   double finish = System.currentTimeMillis();
				   totalTime += (finish-start);
				   if(resultUser == resultActual)
				   {
					    System.out.println("Correct!");
					    right++;
					    System.out.println();
				   }
				   else 
				   {
					    System.out.println("Incorrect! The correct answers was "  + resultActual);
					    wrong++;
					    System.out.println();
				   }  
			  
			   }
			   else if(operation == 2)
			   {
				   int resultActual = num2 - num1;
				   int resultUser = 0;
				   
				
				   double start = System.currentTimeMillis();
				   System.out.println("What is the result of " + num2  +  " - " + num1);
				
				   resultUser = input.nextInt();
				
				   double finish = System.currentTimeMillis();
				   totalTime += (finish-start);
				   if(resultUser == resultActual)
				   {
					    System.out.println("Correct!");
					    right++;
					    System.out.println();
				   }
				   else 
				   {
					    System.out.println("Incorrect! The correct answers was "  + resultActual);
					    wrong++;
					    System.out.println();
				   }  
			   }
			   else if(operation == 3)
			   {
				   int resultActual = num2 * num1;
				   int resultUser = 0;
				   
				
				   double start = System.currentTimeMillis();
				   System.out.println("What is the result of " + num1  +  " x " + num2);
				
				   resultUser = input.nextInt();
				
				   double finish = System.currentTimeMillis();
				   totalTime += (finish-start);
				   if(resultUser == resultActual)
				   {
					    System.out.println("Correct!");
					    right++;
					    System.out.println();
				   }
				   else 
				   {
					    System.out.println("Incorrect! The correct answers was "  + resultActual);
					    wrong++;
					    System.out.println();
				   }  
			   }
			   
			}
		
		
		double averageTime = totalTime/10000;
		
		System.out.println("You scored " + right + "/10"  + " questions correctly and \nThe average question time was " + averageTime);
		System.out.println();System.out.println();
		this.main(null);
	}
	

	// This method prompts the user with random addition, multiplication, and subtraction questions from -100-100. 
	public void randomHard()
	{
		int right  =0;
		int wrong = 0;
		double totalTime= 0;
		
			for(int i = 0; i <10; i++)
			{
			   System.out.println("Question " + (i+1));
			   int num1 = (-1)*(int)(Math.random()*100);
			   int num2 = (int)(Math.random()*100);
			   int operation = (int)(Math.random()*3+1);
			   if(operation ==1)
			   {
				   int resultActual = num2 + num1;
				   int resultUser = 0;
				   
				
				   double start = System.currentTimeMillis();
				   System.out.println("What is the result of " + num1  +  " + " + num2);
				
				   resultUser = input.nextInt();
				
				   double finish = System.currentTimeMillis();
				   totalTime += (finish-start);
				   if(resultUser == resultActual)
				   {
					    System.out.println("Correct!");
					    right++;
					    System.out.println();
				   }
				   else 
				   {
					    System.out.println("Incorrect! The correct answers was "  + resultActual);
					    wrong++;
					    System.out.println();
				   }  
			  
			   }
			   else if(operation == 2)
			   {
				   int resultActual = num2 - num1;
				   int resultUser = 0;
				   
				
				   double start = System.currentTimeMillis();
				   System.out.println("What is the result of " + num2  +  " - " + num1);
				
				   resultUser = input.nextInt();
				
				   double finish = System.currentTimeMillis();
				   totalTime += (finish-start);
				   if(resultUser == resultActual)
				   {
					    System.out.println("Correct!");
					    right++;
					    System.out.println();
				   }
				   else 
				   {
					    System.out.println("Incorrect! The correct answers was "  + resultActual);
					    wrong++;
					    System.out.println();
				   }  
			   }
			   else if(operation == 3)
			   {
				   int resultActual = num2 * num1;
				   int resultUser = 0;
				   
				
				   double start = System.currentTimeMillis();
				   System.out.println("What is the result of " + num1  +  " x " + num2);
				
				   resultUser = input.nextInt();
				
				   double finish = System.currentTimeMillis();
				   totalTime += (finish-start);
				   if(resultUser == resultActual)
				   {
					    System.out.println("Correct!");
					    right++;
					    System.out.println();
				   }
				   else 
				   {
					    System.out.println("Incorrect! The correct answers was "  + resultActual);
					    wrong++;
					    System.out.println();
				   }  
			   }
			   
			}
		
		
		double averageTime = totalTime/10000;
		
		System.out.println("You scored " + right + "/10"  + " questions correctly and \nThe average question time was " + averageTime);
		System.out.println();System.out.println();
		this.main(null);
	}
	

	
}
