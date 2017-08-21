/*
 Anish Thite
 3/20/2017
 Notre Dame High School
 */
// import necessary classes

import java.util.*;

public class Student {
	//initialize variables
	private String id;
	private String [] quizresult=new String[10]; 
	private int score;
	private String grade;
	public Student(){
		
		id=" ";
		for(int i =0; i<quizresult.length; i++){
		     quizresult[i]="";
		     			
		}
		
		score =0;
	}
	
	//Student constructor - constructs the class ( assigns variables)
	public Student(String a, String[] answers){
		
		id=a;
		
		for(int i=0; i<answers.length; i++){
			
			quizresult[i]=answers[i];
			
		}
		
		score = 0;
		
	}
	//allows the program to access the Answers (quizresults) for further use
	public String [] getAnwers(){
		
		return quizresult;
		
	}
	//allows the program to access the student's score ( for use in Test and in this class)
	public int getScore(){
		
		return score;
		
	}
	//allows the program to access the student's grade ( for use in this class and other classes)
	public String getGrade(){
		
		return grade;
	}
	//allows the program to set the Grade indirectly ( as the variable itself is a private variable
	//sets the student's letter grade
	public void setGrade(){
		
		if (score == 100)
			grade = "A";
		else if (score == 90)
			grade = "B";
		else if (score == 80 || score == 70)
			grade = "C";
		else if (score == 60 || score == 50)
			grade = "D";
		else
			grade = "F";
		
		
	}
	//allows the program to access the Student's ID ( without needing access to the variable itself)
	public String getId(){
		
		return id;
		
	}
	
	// function that grades the Student's tests - it compares the student's answers with the Test key and tallies up points for them
	//at the end it also calls the method to convert the numerical score to a letter grade
	public void grade(String [] answerkey, String[] studentanswer){
		
		int count=0;
		
				for(int i=0; i<answerkey.length; i++){
					
					if(answerkey[i].equals(studentanswer[i])){
						
						count = count+10;
						
					}
					
				}
		
				score = count;
				setGrade();
		
	}
	// Prints out the object and all of the data associated with the Student
	public String toString(){
		
		String a = "Student id: " + id + " " +  Arrays.toString(quizresult) + " The score for this quiz is:  " +  score  + " The letter grade is: " + grade + "\n";
		
		return a;
		
		
			
			}

}
	
	


