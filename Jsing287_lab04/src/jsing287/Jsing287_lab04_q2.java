/**
 * This class prints parallelograms to the console.
 * Author: Jasdeep Singh
 * Date: March 5, 2019 
 */
package jsing287;

import java.util.Scanner;


public class Jsing287_lab04_q2 {

	
	
      // This method receives user parameters that are used to make specific parallelograms and outputs it to the user.
      public static void main(String[] args)
      {
		
		// These local variables hold the size of the parallelogram, how many times it will be output to the console, a boolean variable, and the scanner object.
		int size = 0;
		int loop = 1;
		boolean keep =true;
		Scanner input = new Scanner(System.in);
		
		// Prompting the user to enter in the size of each parallelogram
		System.out.println("Please enter a size: ");
		size = input.nextInt();
		int tempSize = size;
	   
		// This while loops keeps the program in a loop until terminated by the user.
	    while(keep == true)
	    {
	    	  // Prompting the user for the repetitions
	    	  System.out.println("Please enter the number of repetitions (0 to exit): ");
	  	    loop = input.nextInt();
	  	  
	    	
	  	    // An if statement that ends the program of the user desires.
	        	if(loop == 0)
	      	{
	        		break;
	     	}
	      	else
	       	{   
	      	
	      		 // Prints top of each parallelogram
	             for(int i = 0; i < loop; i++)
	             {
	            	    // Printing the appropriate spaces
	            	    for(int e = 0; e < size; e++)
	            	    {
	            	    	    System.out.print(" ");
	            	    }
	            	    
	            	    // Printing the appropriate amount of hash tags.
	            	    for(int f = 0; f < size; f++)
	            	    {
	            	    	   System.out.print("# ");
	            	    }
	            	 
	          }
	             // Spacing the top line from the body of the parallelogram
	             System.out.println();
	             System.out.println();
	             
	             // Entering a loop for the amount of rows in the shape.
	          for(int w = 1; w <= (size-2); w++)
	          {
        	        
	            	    // Printing the appropriate spaces.
        	            for(int e = 0; e < (tempSize-1); e++)
        	            {
        	    	        System.out.print(" ");
        	            }
	            
	            	
	            
        	              // This loop prints a hash tag then calculates the appropriate internal spacing required for the shape.
	                for(int i = 0; i < loop; i++)
	                {

	                	    // Calculating spaces and printing the first hash tag.
	            	        System.out.print("#");
	            	        int tempSize2 = 2*size-3;
	            	        
	            	        // Printing internal spaces
	            	        for(int e = 0; e < tempSize2; e++)
           	             {
           	    	           System.out.print(" ");
           	             }
	            	       
	            	           // Printing last hash tag.
	            	           System.out.print("#");
	            	           
	            	          // Printing spaces between parallelograms.
	            	         for(int e = 0; e < size+1; e++)
	            	         {
	            	    	           System.out.print(" ");
	            	         }
	                }
	              
	                // Creating space between rows.
	                System.out.println();
	                System.out.println();
	                
	                
	                
	                tempSize--;
	            }
	            
	            
	            System.out.print(" ");
	            
	            // This loop prints the last row in every parallelogram.
	            for(int i = 0; i < loop; i++)
	             {
	            	    // Printing the hash tags
	            	    for(int f = 0; f < size; f++)
	            	    {
	            	    	   System.out.print("# ");
	            	    }
	            	    // Printing the spacing between the bottom rows.
	            	    for(int e = 0; e < size; e++)
	            	    {
	            	    	    System.out.print(" ");
	            	    }
	            	 
	             }
	        
	    
	      	}
	        	System.out.println();
	        	tempSize = size;
	    
	    }
	    
	    
	   }
      
      
     
      
      

	}


