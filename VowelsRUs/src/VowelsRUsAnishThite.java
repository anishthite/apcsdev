/*
 Anish Thite
 12/10/2016
 Notre Dame High School
 Project- VowelsRUs 
 Description- 
  */
//import necessary classes
import java.util.*;
import java.io.*;

public class VowelsRUsAnishThite {
	//variables for input/reading file
	private static BufferedReader reader;
	private static String root, line, ending, suffixStart;
	
	private static boolean vowel, doubleVowel, consonant, doubleConsonant;
	
	public static void main(String[] args) throws IOException {
	//Steps:
	//import text
	init_File();
	//get data 
	//split to second word
	while ((line = reader.readLine()) !=null){
	//splits line into the root word and the ending (aka suffix)
	split_line();
	// check if last letter is vowel (compare to A,C,S,L)
	check_vowel();
	//checks for more than one vowel
	check_doubleVowel();
	//checks for consonant
	check_consonant();
	//checks for more than one consonant
	check_doubleConsonant();
	//checks the first letter of suffix
	check_suffixStart();
	// creates plural based on result
	change_plural();
	//creates suffix based on result
	change_suffix();
	//print results (Orig String, plural, and suffix)

	}
	}
	//splits line into root and ending
	public static void split_line(){
		String[] parts =  line.split(" ");
		ending = parts[1];
		root = parts[0];
	}
	//initializes file
	public static void init_File() throws IOException {
		FileInputStream inFile = new FileInputStream("c:\\APCS.dev\\APCSData\\test.txt");
		 InputStreamReader inReader = new InputStreamReader(inFile);
		reader = new BufferedReader(inReader);

	}
	// read the ending part of the word ( after " ")
	public static void get_ending() throws IOException{
		line = reader.readLine();
		System.out.println("The original line is " + line);
		String[] parts =  line.split(" ");
		ending = parts[1];
		root = parts[0];
	}
	// checks ending of root to see if it is a vowel- returns vowel(true of false)
	public static boolean check_vowel(){
				if (root.substring(root.length()-1).equalsIgnoreCase("A") || 
					root.substring(root.length()-1).equalsIgnoreCase("C") || 
					root.substring(root.length()-1).equalsIgnoreCase("S") || 
					root.substring(root.length()-1).equalsIgnoreCase("L")  )
				{
				vowel = true;
				}
				else{
				vowel = false;
				}
			return vowel;
	}
	//checks to see for a double vowel at the ending of the root- returns doubleVowel (true or false)
	public static boolean check_doubleVowel(){
		if ((root.substring(root.length()-2,root.length()-1).equalsIgnoreCase("A") || 
			root.substring(root.length()-2,root.length()-1).equalsIgnoreCase("C") || 
			root.substring(root.length()-2,root.length()-1).equalsIgnoreCase("S") || 
			root.substring(root.length()-2,root.length()-1).equalsIgnoreCase("L")) && (vowel == true))
		{
		doubleVowel = true;
		}
		else{
		doubleVowel = false;
		}
	return doubleVowel;
	}
	//checks to see if last letter is consonant- returns consonant (true or false)
	public static boolean check_consonant(){
		if (!root.substring(root.length()-1).equalsIgnoreCase("A") && 
			!root.substring(root.length()-1).equalsIgnoreCase("C") && 
			!root.substring(root.length()-1).equalsIgnoreCase("S") && 
			!root.substring(root.length()-1).equalsIgnoreCase("L")  )
		{
		consonant = true;
		}
		else{
		consonant = false;
		}
	return consonant;
	}	
	//checks to see if the word ends with a double consonant- returns doubleConsonant (true or false)
	public static boolean check_doubleConsonant(){
		if ((!root.substring(root.length()-2,root.length()-1).equalsIgnoreCase("A")&& 
			!root.substring(root.length()-2,root.length()-1).equalsIgnoreCase("C") && 
			!root.substring(root.length()-2,root.length()-1).equalsIgnoreCase("S") && 
			!root.substring(root.length()-2,root.length()-1).equalsIgnoreCase("L")) && (consonant == true))
		{
		doubleConsonant = true;
		}
		else{
		doubleConsonant = false;
		}
	return doubleConsonant;
	}
	//checks to see if the first letter of the suffix is a vowel or consonant- returns suffixStart (true or false)
	public static String check_suffixStart(){
		if (ending.substring(0,1).equalsIgnoreCase("A")|| 
			ending.substring(0,1).equalsIgnoreCase("C") || 
			ending.substring(0,1).equalsIgnoreCase("S") || 
			ending.substring(0,1).equalsIgnoreCase("L"))
		{
		suffixStart = "vowel";
		}
		else{
		suffixStart = "consonant";
		}
	return suffixStart;
	}
	//changes word to plural based on results from check_vowel(),check_doubleVowel(), check_consonant(), and check_doubleConsonant()
	public static String change_plural(){
		String plural = " ";
		//change based on vowel
		if ((vowel == true) && (doubleVowel != true)){
			plural = root.substring(0, root.length()-1) + "G";
		}
		//change based on double vowel
		if ((vowel == true) && (doubleVowel == true)){
			plural = root + root.substring(root.length()-1) + "H";
		}	
		//change based on consonant
		if ((consonant == true) && (doubleConsonant != true)){
			plural = root + "GH";
		}
		//change based on double consonant
		if ((consonant == true) && (doubleConsonant == true)){
			plural = root + root.substring(root.length()-1) + "H";
		}
		System.out.println("The plural is " + plural);
		return plural;
	}
	// Creates suffix based on results from check_suffixStart(), check_vowel(),check_doubleVowel(), check_consonant(), and check_doubleConsonant(), leftmost_vowel(), and leftmost_consonant()
	public static String change_suffix(){
		String suffix = " ";
		//change based on vowel
		if ((vowel == true) && (doubleVowel != true)){
			if (suffixStart == "vowel" ){
				suffix = root + ending.substring(1);
			}
			else{
				suffix = root + ending.substring(0, 1) + ending;
			}
		}
		//change based on double vowel
		if ((vowel == true) && (doubleVowel == true)){
			if (suffixStart == "vowel" ){
				suffix = root + ending.substring(0, 1) + ending;
			}
			else{
				int leftmostvowel = leftmost_vowel();
				suffix = root.substring(0, leftmostvowel) + root.substring((leftmostvowel + 1)) + ending;
			}
		}
		//change based on consonant
		if ((consonant == true) && (doubleConsonant != true)){
			suffix = root + ending;
		}
		//change based on double consonant
		if ((consonant == true) && (doubleConsonant == true)){
			if (suffixStart == "vowel" ){
				suffix = root + ending.substring(0, 1) + ending;
			}
			else{
				int leftmostconstant = leftmost_constant();
				suffix = root.substring(0, leftmostconstant) + root.substring((leftmostconstant + 1)) + ending;
			}
		}
		System.out.println("The suffix is " + suffix);
		return suffix;
	}
	//used to find the leftmost vowel ( will be used to exclude the leftmost vowel)
	public static int leftmost_vowel(){
		int leftVowelIndex = -1;
		for (int i = root.length()-1; i >=0; i-- ){
			if (root.charAt(i) == 'A' || 
				root.charAt(i) == 'C' || 
				root.charAt(i) == 'S' || 
				root.charAt(i) == 'L' || 
				root.charAt(i) == 'a' || 
				root.charAt(i) == 'c' || 
				root.charAt(i) == 's' || 
				root.charAt(i) == 'l'  )
				{
					leftVowelIndex = i;
				
				}
				else{
				break;
				}
		}
		return leftVowelIndex;
	}
	//used to find the leftmost consonant ( will be used to exclude the leftmost consonant)
	public static int leftmost_constant(){
		int leftConstantIndex = -1;
		for (int i = root.length()-1; i >=0; i-- ){
			if (root.charAt(i) != 'A' && 
				root.charAt(i) != 'C' && 
				root.charAt(i) != 'S' && 
				root.charAt(i) != 'L' &&
				root.charAt(i) != 'a' && 
				root.charAt(i) != 'c' && 
				root.charAt(i) != 's' && 
				root.charAt(i) != 'l')
				{
					leftConstantIndex = i;
				
				}
				else{
				break;
				}
		}
		return leftConstantIndex;
	}
}
