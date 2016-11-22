/*
 Anish Thite
 11/20/2016
 Notre Dame High School
 Project- 7-1 Guessing Game (Human guess)
 Description- This project replicates a guessing game; the computer picks a 
 random number from between 1 and 100, and the user has to guess the number 
 */

import java.util.*;
public class Anish_Thite_71 {
	
	public static int correctNumber, guess, count = 0; 
	public static Scanner reader;
	public static Random generator;
	public static boolean correctAnswer = false;
	public static void main(String[] args) {
		// generate number between 1 and 100
		// print out prompt
		generate_number();
		//read input
		while (!correctAnswer){
			user_guess();
			//check to see if number is > or < generated number, print response, in while loop 
			check_guess();
		}
	}

	public static void generate_number(){
		
		generator = new Random();
		correctNumber = generator.nextInt(101);
		System.out.println("I am thinking of a number between 1 and 100. Take a guess!");
	}
	
	public static void user_guess() throws InputMismatchException{
		reader = new Scanner(System.in);
		guess = reader.nextInt();
		count ++;
	}
	public static void check_guess(){
			if ((guess > correctNumber) && (guess >= 1) && (guess <= 100)) {
				System.out.println("The answer is lower than your guess. PLease try again!");
			}
			else if ((guess < correctNumber) && (guess >=1) && (guess <= 100)){
				System.out.println("The answer is higher than your guess. Please try again!");
			}
			else if ((guess == correctNumber) && (guess >=1) && (guess <= 100)){
				System.out.println("Nice job! You got the right answer.\n You got the answer in " + count + " tries.");
				correctAnswer = true;
			}
			else {
				System.out.println("Sorry, that is not a valid input, try again!");
			}
		
	}
	
	
	
}