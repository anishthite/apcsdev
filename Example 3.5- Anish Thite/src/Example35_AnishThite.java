/*
 Anish Thite
 10/18/2016
 Notre Dame High School
 Project- 3-5 Total Weekly Pay calculator
 Decsription- This project calculates the total weekly pay on an employee from the overtime hours they worked, 
 	the regular hours they worked, and the weekly pay
 */
// import Scanner class
import java.util.Scanner;

public class Example35_AnishThite {
	
	//set variables used
	public static double hourlyWage, regularHours = 0, overtimeHours = 0, weeklyPay;
	public static Scanner reader = new Scanner(System.in);
	public static String name;  
	

	public static void main(String[] args) {
		
		//Assign user inputs to various prompts
		System.out.println("Enter your name: ");
		name = reader.nextLine();
		System.out.println("Enter the hourly wage: ");
		hourlyWage= reader.nextDouble();
		
		
		//run method to add data from each day
		hours_input("Monday");
		hours_input("Thursday");
		hours_input("Friday");
		hours_input("Saturday");
	
//		System.out.println("Enter the regular hours worked on Monday: ");
//		regularHours += reader.nextDouble();
//		System.out.println("Enter the overtime hours worked on Monday: ");
//		overtimeHours += reader.nextDouble();
//		System.out.println("Enter the regular hours worked on Tuesday: ");
//		regularHours += reader.nextDouble();
//		System.out.println("Enter the overtime hours worked on Tuesday: ");
//		overtimeHours += reader.nextDouble();
//		System.out.println("Enter the regular hours worked on Wednesday: ");
//		regularHours += reader.nextDouble();
//		System.out.println("Enter the overtime hours worked on Wednesday: ");
//		overtimeHours += reader.nextDouble();
//		System.out.println("Enter the regular hours worked on Thursday: ");
//		regularHours += reader.nextDouble();
//		System.out.println("Enter the overtime hours worked on Thursday: ");
//		overtimeHours += reader.nextDouble();
//		System.out.println("Enter the regular hours worked on Friday: ");
//		regularHours += reader.nextDouble();
//		System.out.println("Enter the overtime hours worked on Friday: ");
//		overtimeHours += reader.nextDouble();
//		
//		
		
		// calculate weekly pay and print result
		System.out.println("The total weekly pay is: $"+ hourlyWage*regularHours + (overtimeHours * 1.5 * hourlyWage));
		
	}
	
	
	public static void hours_input(String day)
	{
		System.out.println("Please enter the regular hours worked on " + day);
		regularHours += reader.nextDouble();
		System.out.println("Enter the overtime hours worked  on " + day);
		overtimeHours += reader.nextDouble();
	}


}
