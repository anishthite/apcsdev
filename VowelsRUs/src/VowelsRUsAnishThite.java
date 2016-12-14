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
	private static String line, ending, plural;
	
	private static boolean vowel;
	
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
	public static boolean check_ending(){
		int pos = 0;
		while ( pos <= ending.length()){
				if (ending.substring(pos) == "a" || 
					ending.substring(pos) == "c" || 
					ending.substring(pos) == "s" || 
					ending.substring(pos) == "l"  )
				{
				vowel = true;
				}
		pos++;
		}
		return vowel;
	}
	//changes word to plural
	public static String change_plural(){
		
		
		return plural;
	}
}
