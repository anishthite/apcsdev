/*
 Anish Thite
 12/07/2016
 Notre Dame High School
 Project- 3-5 Total Weekly Pay calculator
 Description- This project calculates the total weekly pay on an employee from the overtime hours they worked, 
 	the regular hours they worked, and the weekly pay
 */
// import necessary classes
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class Example35_AnishThite {
	
	//set variables and objects used
	public static double hourlyWage, regularHours = 0, overtimeHours = 0, weeklyPay;
	public static Scanner input = new Scanner(System.in);
	public static String line, name;  
	private static FileInputStream inFile;
	private static InputStreamReader inReader;
	private static BufferedReader reader;
	private static StringTokenizer strTkn; 
	
	public static void main(String[] args) throws IOException {
		
		//Assign user inputs to various prompts
		init_file();
		getData();
		// tallies the hours 5 times ( representing the days worked)
		for (int count = 1; count < 6; count ++) {
			hours_input();
		}
		// calculate weekly pay and print result
		calculate_pay(hourlyWage,regularHours,overtimeHours);
		print(name, weeklyPay);
		
	}
	public static void init_file() throws IOException{
		inFile = new FileInputStream ("c:\\APCS.dev\\APCSData\\test.txt"); 
		inReader = new InputStreamReader(inFile);
		reader = new BufferedReader(inReader);
		line = reader.readLine();
		strTkn = new StringTokenizer(line);
		
	}
	public static void getData() throws IOException{
		name = strTkn.nextToken() + " " + strTkn.nextToken();
		name.trim();
		int i = name.compareTo(line);
		if (i == 0){
			System.out.print("There is only a name inputed.");
		}
		if (name.equals(" ") || name.length() <= 0 || name.equalsIgnoreCase(" ")){
			System.out.print("There is no name you inputed");
		}
		if (name.indexOf('.') >-1 || name.indexOf('.', 0) >-1){
			boolean middleInitial = true;
		}
		String unchangedName;
		unchangedName = name.replace('a','a');
		hourlyWage = Double.parseDouble(strTkn.nextToken());
	}
	public static void hours_input() {
		//Prompt user for regular hours and add it to total
		regularHours += Double.parseDouble(strTkn.nextToken());
		//Prompt user for overtime hours and add it to total
		overtimeHours += Double.parseDouble(strTkn.nextToken());
	}
	public static void calculate_pay( double hourlyWage,double regularHours, double overtimeHours){
		weeklyPay = hourlyWage*regularHours + (overtimeHours * 1.5 * hourlyWage);
	}

	public static void print(String name, double weeklyPay){ 
		System.out.println("The total weekly pay for " + name +" is: $" + weeklyPay );
		name.toLowerCase();
		name.toUpperCase();
	}
}
