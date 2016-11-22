//import Scanner and Math classes
import java.util.Scanner;
import java.lang.Math;
public class Project47AnishThite_main {

	public static void main(String[] args) {

	// user input exponent
	Scanner reader = new Scanner(System.in);
	System.out.print("input the exponent at which to raise 2 to");
	double exponent = reader.nextDouble();
	// check it if is <0
	if (exponent < 0 ){
		System.out.print("Sorry, that is a not an appropiate value !");
	}
	else{ 
		System.out.print("2 to the power of " + exponent + " is equal to " + Math.pow(2, exponent));
	}
	
	
	}

}
