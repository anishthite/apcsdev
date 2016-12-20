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
	private static FileInputStream inFile;
	private static InputStreamReader inReader;
	private static BufferedReader reader;
	private StringTokenizer strTkn;
	private static String line, ending, plural, suffixStart;
	
	private static boolean vowel, doubleVowel, consonant, doubleConsonant;
	
	public static void main(String[] args) {
	//Steps:
	//import text
	//get data 
	//split to second word
	// check if last letter is vowel (compare to A,C,S,L)
	// change to plural based on result
	//change to suffix based on result
	//print results (Orig String, plural, and suffix)
	}
	//import files
	public static void init_File() throws IOException {
		inFile = new FileInputStream("c:\\APCS.dev\\APCSData\\test.txt");
		inReader = new InputStreamReader(inFile);
		reader = new BufferedReader(inReader);

	}
	// read the ending part of the word ( after " ")
	public static void get_ending() throws IOException{
		line = reader.readLine();
		String[] parts =  line.split(" ");
		ending = parts[1];
		ending = ending.toLowerCase();
	}
	// checks ending to see if it is a vowel
	public static boolean check_vowel(){
				if (ending.substring(ending.length()-1) == "a" || 
					ending.substring(ending.length()-1) == "c" || 
					ending.substring(ending.length()-1) == "s" || 
					ending.substring(ending.length()-1) == "l"  )
				{
				vowel = true;
				}
				else{
				vowel = false;
				}
			return vowel;
	}
	//checks to see for a double value
	public static boolean check_doubleVowel(){
		if ((ending.substring(ending.length()-2) == "a" || 
			ending.substring(ending.length()-2) == "c" || 
			ending.substring(ending.length()-2) == "s" || 
			ending.substring(ending.length()-2) == "l" ) && (vowel == true))
		{
		doubleVowel = true;
		}
		else{
		doubleVowel = false;
		}
	return doubleVowel;
	}
	public static boolean check_consonant(){
		if ((ending.substring(ending.length()-1) != "a" || 
			ending.substring(ending.length()-1) != "c" || 
			ending.substring(ending.length()-1) != "s" || 
			ending.substring(ending.length()-1) != "l" ) && (vowel == false))
		{
		consonant = true;
		}
		else{
		consonant = false;
		}
	return consonant;
	}	
	public static boolean check_doubleConsonant(){
		if ((ending.substring(ending.length()-2) != "a"|| 
			ending.substring(ending.length()-2) != "c" || 
			ending.substring(ending.length()-2) != "s" || 
			ending.substring(ending.length()-2) != "l" ) && (consonant == true))
		{
		doubleConsonant = true;
		}
		else{
		doubleConsonant = false;
		}
	return doubleConsonant;
	}
	public static String check_suffixStart(){
		if (ending.substring(0) == "a"|| 
			ending.substring(0) == "c" || 
			ending.substring(0) == "s" || 
			ending.substring(0) == "l")
		{
		suffixStart = "vowel";
		}
		else{
		suffixStart = "consonant";
		}
	return suffixStart;
	}
	//changes word to plural
	public static String change_plural(){
		//change based on vowel
		if ((vowel == true) && (doubleVowel != true)){
			
		}
		//change based on double vowel
		if ((vowel == true) && (doubleVowel == true)){
			
		}
		//change based on consonant
		if ((consonant == true) && (doubleConsonant != true)){
			
		}
		//change based on double consonant
		if ((consonant == true) && (doubleConsonant == true)){
			
		}
		return plural;
	}
	public static String change_suffix(){
		//change based on vowel
		if ((vowel == true) && (doubleVowel != true)){
			
		}
		//change based on double vowel
		if ((vowel == true) && (doubleVowel == true)){
			
		}
		//change based on consonant
		if ((consonant == true) && (doubleConsonant != true)){
			
		}
		//change based on double consonant
		if ((consonant == true) && (doubleConsonant == true)){
			
		}
		return plural;
	}
}
