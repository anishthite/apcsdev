/*
 Anish Thite
 12/07/2016
 Notre Dame High School
 Project- 7-8 Word Statistics
 Description- This project calculates and displays the total word count, total character length, and the average word length of an inout. 
 */
import java.util.Scanner;
public class AnishThiteProject78 {

	public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in);
	      
	      String input;
	      int word_num = 0;
	      double char_sum = 0;
	      double average = 0;
//input string
	      System.out.println("What is the input string?");
	      input = reader.nextLine();
//get word number and character sum	      
	      for (String word : input.split(" ")){
	          word_num++;
	          char_sum = char_sum + word.length();
	      }
//calculate average	      
	      char_sum = char_sum / word_num;
//print results
	      System.out.println("There are " + word_num + " words.");
	      System.out.println("The average word length is " + char_sum);
	      System.out.println("The length is " + input.length() + " characters long");
	}

}
