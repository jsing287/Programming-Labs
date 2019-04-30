/**
 * This class performs addition, subtraction, and multiplication 
 * on 3x3 matrices which are filled with user entered values.
 * Author: Jasdeep Singh
 * Date: March 26, 2019
 */


package jsing287;

import java.util.Scanner;

public class Jsing287_lab07_q2 {

	// static field for the program.
	private static Scanner in =  new Scanner(System.in);
	
	
	// The main method prompts the user to fill the two matrices and choose which operation they would like.
	public static void main(String[] args) 
	{
		
		// Declaring the 2D array and the decision variable.
		double[][] matrixOne  = new double[3][3];
		double[][] matrixTwo =  new double[3][3];
		double[][] matrixResult = new double[3][3];
		String decision = " ";
	    boolean check = true;
	    boolean check2 =  true;
	    
	   
	    // Prompting the user to fill the first matrix and then reprinting it out.
	    System.out.println("Welcome! Please populate the first matrix: ");
	    populateMatrix(matrixOne);
	    	printMatrix(matrixOne);
	    	    
	    	// Prompting the user to fill the second matrix and then reprinting it out.
	    	System.out.println("Please populate the second matrix: ");
	    	populateMatrix(matrixTwo);
	    	printMatrix(matrixTwo);
	    	    
	    	
	    	// This loop will run until the user exits the program.
	    	    while(check == true)
	    	    {
	    	    	
	    	    	// Prompting the user with options.
	    	    System.out.println("Please choose an option: ");
	    	    System.out.println("a. Addition");
	    	    System.out.println("b. Subtraction");
	    	    System.out.println("c. Multiplication");
	    	    System.out.println("d. Exit");
	    	    decision = in.next();
	  
	    	    // Running addition, subtraction, multiplication, and exit option based on the user input.
	    		  if(decision.equalsIgnoreCase("a"))
		    	  {
		    	    		addMatrices(matrixOne, matrixTwo, matrixResult);
		    	    		printMatrix(matrixResult);
		    	    		  
		    	    		
		    	    		
		    	  }
		    	  else if(decision.equalsIgnoreCase("b"))
		    	  {
		    	     	subtractMatrices(matrixOne, matrixTwo, matrixResult);
		    	     	printMatrix(matrixResult);
		    	     	
		    	  }
		    	  else if(decision.equalsIgnoreCase("c"))
		    	  {
		    	     	multiplyMatrices(matrixOne, matrixTwo, matrixResult);
		    	     	printMatrix(matrixResult);
		    	  }
		    	  else if(decision.equalsIgnoreCase("d"))
		    	  {
		    	     	check = false;
		    	  }
	    		  
	    	  }
	    	    
 

	    	    
	    	    
	    	    
	    

	}

	
	// This method will populate the passed matrix.
	public static void populateMatrix(double[][] a)
	{
		  for(int i = 0; i<a.length; i++)
  	      {
  	    	  
  	          for(int e = 0 ; e<a[0].length; e++)
  	          {
  	        	    System.out.println("Enter a real number for elemement (" + i + "," + e + ")");
  	        	    a[i][e] = in.nextDouble();
  	          }
  	    	
  	      }
		
	}
	
	
	// This method will print the passed matrix.
	public static void printMatrix (double[][] a)
	{
		for(int i = 0; i<a.length; i++)
     	{
	    	  
     		for(int e = 0 ; e<a[0].length; e++)
     		{
     			System.out.print(a[i][e] + "  ");
     		}
     		System.out.println();
     		System.out.println();
	    	
     	}
		
	}
	
	public static void addMatrices(double[][] a, double[][] b, double[][] result)
	{
		for(int i = 0; i<a.length; i++)
     	{
	    	  
     		for(int e = 0 ; e<a[0].length; e++)
     		{
     			result[i][e] = a[i][e] + b[i][e];
     		}
     		
	    	
     	}
	}
	
	
	// Thus matrix passes through each location in matrixOne and subtracts materixTwo from it.
	public static void subtractMatrices(double[][] a, double[][] b, double[][] result)
	{
		for(int i = 0; i<a.length; i++)
     	{
	    	  
     		for(int e = 0 ; e<a[0].length; e++)
     		{
     			result[i][e] = a[i][e] - b[i][e];
     		}
     		
	    	
     	}
		
	}
	
	
	// This method performs the multiplication algorithm on the two passed matrices.
	public static void multiplyMatrices(double[][] a, double[][] b, double[][] result)
	{
		
		// Local variables
		double sum = 0;
		int counter = 0;
		int first = 0;
		int second = 0;
		
		
		// This for loop will go through each of a[] rows.
		for(int w  = 0; w<a.length; w++)
		{
			
			   // Summing the w row of a[] with the first column of b[]
				for(int i = 0; i<a.length; i++)
				{
					sum += a[w][i]*b[i][counter];
					
		     		
			    	
				}
				
				// Saving sum in result[] and resetting sum.
				result[w][counter] = sum;
				sum = 0;
				
				
				// Summing the w row a[] with the second column of b[].
				for(int i = 0; i<a.length; i++)
				{
					sum += a[w][i]*b[i][counter+1];
					
		     		
			    	
				}
				
				// Saving sum in result[]
				result[w][counter+1] = sum;
				sum = 0;
				
				
				// Summing the w row of the a[] with the third column of b[]/
				for(int i = 0; i<a.length; i++)
				{
					sum += a[w][i]*b[i][counter+2];
					
		     		
			    	
					
				}
				
				// Saving sum in the result[]
				result[w][counter+2] = sum;
				sum = 0;
				
		}	
			
		
		
		
			
		
		
	}
}
