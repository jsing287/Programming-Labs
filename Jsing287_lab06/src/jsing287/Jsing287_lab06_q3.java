/**
 * This class mimics a casino game in which
 * a user is given a randomly drawn card from the deck and asked 
 * if the next card will be greater or lower in value than the first.
 * Author: Jasdeep Singh
 * Date: March 19, 2019
 * 
 */
package jsing287;

import java.util.Scanner;

public class Jsing287_lab06_q3 {

	
	// This main method acts as the control panel of the program, initializing variables and arrays, and sending and receiving information to and from other methods.
	public static void main(String[] args)
	{
		// Initializing header variables and passing them to the printHeader method.
		int labNum = 6;
		int questionNum = 3;
		String fName  = "Jasdeep";
		String lName = " Singh";
		String mission = "This program allows the user to play a simple card game: ";
		printHeader(labNum, questionNum, fName, lName, mission);
		
		// Local variables to hold user decisions, and to evaluate a loop
		String decision = " ";
		boolean check = true;
		
		
		// Initializing a scanner object named in.
		Scanner in =  new Scanner(System.in);
		
		
		// Initializing the cards array that will hold all 52 cards within a deck.
		String[] cards =  new String[52];
		
		// Initializing a suits[] to hold the four suits in a deck.
		String[] suits = {"H", "C", "D", "S"};
		
		// Passing the cards and suits array through to fill the cards method into a full deck.
		populateDeck(cards, suits);
		
		System.out.println();
		
		// This while loop encompasses the entire game and asks the user after each iteration if he/she would like to continue.
		while(check ==true)
		{
			// Drawing a card from the deck and retrieving the value associated for comparison purposes.
			String playerCard = drawCard(cards);
			int comparePlayer = showNumber(playerCard);
     
			// Outputting the card drawn to the user and asking if the next will be higher.
			System.out.println("The card drawn was " + playerCard);
			System.out.println("Will the next card be higher?");
			decision =  in.next();
			
			// Drawing the next card from the deck and showing the user, compareDeck holds the cards numerical value.
			String nextCard = drawCard(cards);
			System.out.println("The next card drawn is the " + nextCard);
			int compareDeck =  showNumber(nextCard);
			
			// This if-else if-else, statement compares the drawn cards value to the users prediction and outputs if they are right or not accordingly.
			if(compareDeck > comparePlayer && decision.equalsIgnoreCase("y"))
			{
				System.out.println("You are correct!");
			}
			else if(compareDeck <comparePlayer && decision.equalsIgnoreCase("n"))
			{
				System.out.println("You are correct!");
			}
			else
			{
				System.out.println("Too bad!");
			}
             // Asking the user if they would like to keep playing the game
			System.out.println("Would you like to play again? (y/n)");
			decision = in.next();
			
			// If they say yes keep check and true if not keep check as false and end the while loop.
			if(decision.equalsIgnoreCase("y"))
			{
				check=true;
			}
			else if (decision.equalsIgnoreCase("N"))
			{
				check = false;
			}
			
			
		}
		
	
		
		
		

	}
	
	
	// This method returns the numerical part of each String card, For example: "JH", returns 10. "8C" returns 8.
	public static int showNumber(String convertCard)
	{
		// Creating local variable front to hold the beginning part of each card, and compareNum to hold its final value.
		String front = " ";
		int compareNum = 0;
		
		// This if-else statement checks if the passed string has a length of 2, as all cards will except ten and finds the substring accordingly.
		if(convertCard.length()<3)
		{
			front = convertCard.substring(0, 1);
		}
		else
		{
			
			return 10;
		}
		
	    
		// This if-else statement check to see if the front of the given card is a royal card in which further conversion must be done to find its value.
		if(front.equals("J") || front.equals("Q") || front.equals("K") || front.equals("A"))
		{
			// This switch statement sets compareNum to the appropriate value based on which royal card was given to this method.
			switch(front)
			{
			   case "J":
				   compareNum = 11;
				   break;
				   
			   case "Q":
				   compareNum = 12;
				   break;
				   
			   case "K":
				   compareNum = 13;
				   break;
				   
			   case "A":
			       compareNum = 14;
			       break;
			   default:
			   
			}
			return compareNum;
		}
		// This else statement runs if it is not a royal card and so its numerical value is just the front end of the card parsed.
		else
		{
			return Integer.parseInt(front);
		}
		
		
	}
	
	
		
	// This method receives the cards[] and suits[] from the main method and then populates the cards[] with 52 cards.
	public static void populateDeck(String [] deck, String[] suits)
	{
		    // Initializing local variables for array position and card value.
			int count = 0;
			String actual = " ";
			
			// These structure of nested for loops takes each number from 1-14 and copies is four times with a different suit each time and saves those values in deck.
			for(int i = 1; i < 14;i++)
			{
				// This for loop loops through each of the suits and concatenates it with the integer number given from the above for-loop.
				for(int e = 0; e < suits.length; e++)
				{
					
						deck[count] = i + suits[e];
						count++;
						
					
				}
				
				
			}
		     
			
			
			
			// This for loops assigns the values 1, 11, 12, 13 to A, J, Q, and K respectively.
			for(int i = 0; i<deck.length; i++)
			{
				int firstNum;
				
				// Checking the length of the String so the appropriate index is used to find the beginnig value of each card.
				if(deck[i].length()<3)
				{
				    firstNum = Integer.parseInt(deck[i].substring(0,1));
				}
				else
				{
				    firstNum = Integer.parseInt(deck[i].substring(0,2));
					
				}
		
				// This series of if-else statement check to see if the found value is a royal card and then used the showCard method to retrieve its proper royal String name.
				if(firstNum==1)
				{
					String suit = deck[i].substring(1,2);
					String wholeCard = deck[i];
					deck[i] = showCard(wholeCard) + suit;
					
				}
				else if(firstNum==11||firstNum==12||firstNum==13)
				{
					String suit = deck[i].substring(2,3);
					String wholeCard = deck[i];
					deck[i] = showCard(wholeCard) + suit;
					
				}
				else
				{
					continue;
				}
			}
			
		
		}
		
		

	// This method is given the card[](deck), and called when a card is needed to be randomly drawn.
	public static String drawCard(String[] draw)
	{
		    // Generating a random integer from 0-51, not 52 as array positions are needed.
			int random =  (int)(Math.random()*52);
			// Retrieving the card at position random in the draw[].
			String chosenCard = draw[random];
			
			// This while loop checks if the drawn card is a 10 and already marked and if so finds another card as this one has been used.
			while(chosenCard.substring(0,1).equals("10") && chosenCard.length()>3)
			{
				random =  (int)(Math.random()*52);
				chosenCard = draw[random];
				
				
			}
			
			// This while loop checks if the drawn card has a String length greater than 2 and if so it has already been used so it finds another unmarked card.
			while(chosenCard.length()>2)
			{
				random =  (int)(Math.random()*52);
				chosenCard = draw[random];
				
			}
			// Holding chosenCard in tempCard as it is about to be modified and marked so it is not used again.
			String tempCard = chosenCard;
			draw[random] = draw[random] + "#";
			
			// Returning an unused card.
			return tempCard;
	}
		
	// This method assigns a royal string to appropriate numerical values in the deck.
	public static String showCard(String cardValue)
	{
		    // Initializing local String variable to hold the front part of each card.
			String numCard = " ";
			
			// Finding the front of each card based on their length.
			if(cardValue.length()<3)
			{
			    numCard = cardValue.substring(0,1);
			}
			else
			{
				 numCard = cardValue.substring(0,2);
			}
			
			// Converting that String to an integer and initializing a local Srting variable to hold royal Strings.
			int num = Integer.parseInt(numCard);
			String finalCard = " ";
			
			// This switch statement has a case for the 1, 11, 12, and 13 integers and converts them to a J,Q,K,A respectively.
			switch(num)
			{
			    case 1: 
			    	finalCard  = "A";
			    	break;
			    	
			    case 11:
			    	finalCard = "J";
			    	break;
			    	
			    case 12:
			    	finalCard = "Q";
			    	break;
			    	
			    case 13:
			    	finalCard = "K";
			    	break;
			    	
			    	default:
			    		return " ";
			}
			
			return finalCard;
			
			
	}
		
		
		

		 // This method uses specific arguments given from the main method and prints it out to the console.
		private static void printHeader(int labNum, int questionNum, String fName, String lName, String mission)
		{
			   
			   
				// Printing out the *
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
				for(int i = 0; i < mission.length(); i++)
				{
					System.out.print("*");
				}
			    System.out.println();
		}
		  
		
		

}
