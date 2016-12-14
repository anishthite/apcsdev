/*
 Anish Thite
 11/29/2016
 Notre Dame High School
 Project- 7-6 Lucky Sevens Reloaded
 Description- This project edits the LuckySevens game as described in project 7.6

LuckySevens.java
Simulate the game of lucky sevens until all funds are depleted.
1) Rules:
        roll two dice
        if the sum equals 7, win $4, else lose $1
2) The inputs are:
        the amount of money the user is prepared to lose 
3) Computations:
        use the random number generator to simulate rolling the dice
        loop until the funds are depleted 
        count the number of rolls
        keep track of the maximum amount
4) The outputs are:
        the number of rolls it takes to deplete the funds
        the maximum amount 
*/

import java.util.Scanner;
import java.util.Random;

public class LuckySevens {
   public static void main (String [] args) {
  
      Scanner reader = new Scanner(System.in);
      Random generator = new Random();
   
      int die1, die2;       // two dice
      int dollars;          // initial number of dollars (input)
      int roll_count = 0;	// number of rolls to reach depletion
      int total_roll_count = 0;            // total number of rolls

      // Request the input
      System.out.print("How many dollars do you have? ");
      int originalDollars = reader.nextInt();
      // Loop the simulation 100 times   
      for (int sim_count = 1; sim_count <= 100; sim_count ++){
    		dollars = originalDollars;
    		roll_count = 0;
    	// run gambling simulation if there is money left
    	  while (dollars > 0)
    		  {
    			  roll_count++;
         // Roll the dice.
    			  die1 = generator.nextInt (6) + 1; // 1-6 
    			  die2 = generator.nextInt (6) + 1; // 1-6
		  
         // Calculate the winnings or losses
         if (die1 + die2 == 7)
            {dollars += 4;}
         else 
            {dollars -= 1;}
          
         }
    	  //tally roll count
    	  total_roll_count += roll_count;
      }
            // Display the results
      System.out.println 
         ("You run out of money after an average of " + total_roll_count/100 + " rolls.");
     
    }     
}
   
