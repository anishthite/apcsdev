/*
 Anish Thite
 11/20/2016
 Notre Dame High School
 Project- 7-1 Guessing Game (Computer guess)
 Description- This project replicates a guessing game; the human picks a number from between 1 and 100, and the computer has to guess the number 
 */
import java.util.*;
public class AnishThite72 {
	public static int correctNumber, boundLow, boundHigh, guess, count = 0;
	public static Scanner reader = new Scanner(System.in);
	public static String check;
	public static boolean correct = false;
	public static Random generator = new Random();
	
	public static void main(String[] args) {
		// user defines the correct answer and range
		user_input();
		// computer defines guess
		while (!correct){
			guess();
			check();
			
		}

	}

	public static void user_input(){
		boundHigh = 101;
		boundLow = 1;
		System.out.println("Enter the number you are thinking of ");
		correctNumber = Integer.parseInt(reader.nextLine());
	}
	public static void guess(){
		guess = generator.nextInt(boundHigh-boundLow) + boundLow;
		count ++;
	}
	public static void check(){
	System.out.println("My guess is " + guess + ". Is this correct, too high, or too low?");
	check = reader.nextLine().trim().toLowerCase();
	if (check.equals("correct")){
		System.out.print("I got the answer in " + count + " tries. That was fun! ");
		correct = true; 
		}
	else if (check.equals("too high")){
			if (boundHigh> guess){
				boundHigh = guess-1;	
			}
		}
	else if (check.equals("too low")){ 
		boundLow = guess+1;
		}
	else{
		System.out.println("Sorry, I do not recognize that statement!");
	}
	
	}	
}
	

	

