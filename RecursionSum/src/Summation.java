public class Summation {

private static int low,high,result; //VARIABLES USED IN THIS CLASS.

//CONSTRUCTOR METHOD 1

public Summation(){

low=1;

high=10;

result = sum(low,high);

}

//CONSTRUCTOR METHOD 2

public Summation(int a, int b){

low = a;

high = b;

result = sum(low,high);

}

//STATIC METHOD FOR SUM

private static int sum(int a, int b){

// TYPE HERE THE CODE FOR THE RECURSIVE SUM.
	int sum;
	System.out.println("Parameter in call: " + a + " and " + b);
	System.out.println("");
	
	if (b-1 == a){
		int x = a +b;
		System.out.println("Result in call: " + x);
		return x;
	}
	else {
		int x = a + sum(b-1, b );
		System.out.println("Result in call: " + x);
		return x;
		
	}
}

public String toString(){

String a = "The recursive sum is: " + result;

return a;

}

}