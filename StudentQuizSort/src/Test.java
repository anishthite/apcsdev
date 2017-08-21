/*
 Anish Thite
 3/20/2017
 Notre Dame High School
 */
// import necessary classes

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

@SuppressWarnings("rawtypes")
public class Test implements Comparable{

	
	      private static FileInputStream inFile;
		  private static InputStreamReader inReader;
		  private static  BufferedReader reader;

		  
		 private static List<Student> classroom = new ArrayList<Student>(); // ArrayList to store the classroom.
		 
		  
		  
		  
		  

			  public static void main (String args[]) throws IOException
			  {
			    initFile();  
			    getData();
			    System.out.print(classroom);  //output of the complete class.
			    sort();
			    System.out.print(classroom); //output after sorting.
			    inFile.close();
			    
			  }
			 
			 // preparing the file for input
			 
			  public static void initFile() throws IOException

			  
			  {
			    inFile = new FileInputStream ("c:\\APCS.dev\\APCSData\\truefalse.txt");
			    inReader = new InputStreamReader(inFile);
			    reader = new BufferedReader(inReader);
			    
			  }
	
			  
			  //  Separate the id from the answers and store the answers in an array.
			  
			  public static void getData() throws IOException
			  {
			    String line = reader.readLine();  //Seed
			    
			    String[] answerkey = new String[10];  //Store the answer key from the first line of the txt file.
			    
			    for(int i=0; i<answerkey.length; i++){ // take that line and place each answer in an array.
			    	
			    	answerkey[i]=line.substring(i,i+1);			    	
			    }
			    
			    line = reader.readLine();    // read the following line of the txt file.
			    			     
			                                
			    while(line != null)   // Read and create a student for each line.
			    {
			      String[] answers = new String[10];
			      StringTokenizer strTkn = new StringTokenizer(line); 
			      String id = strTkn.nextToken();
			      String answerline = strTkn.nextToken();
			      
						      
			      for(int i=0; i<answers.length; i++){
			    	  
			    	  answers[i]=answerline.substring(i, i+1);
			    	  
			      }
			      
			      Student stu = new Student(id,answers);
			      
			      stu.grade(answerkey, answers);
			      
			      classroom.add(stu);  
			     
			      
			      
			      			      
			      line = reader.readLine();   //updating what is being read
			                                  
			    }
			    
			  }
			  
			
			  // In this method you should sort the classroom in ascending order depending on the score obtained on the quiz. 
			  public static void sort(){
				  
				  //Implementation of code here.
				  
				  int k = 0;
				  boolean exchangeMade = true;
				  while ((k < classroom.size() -1) && exchangeMade){
					  exchangeMade = false;
					  k++;
				int x = classroom.size() - k;
				  for (int j = 0; j < x; j++){
					  if (classroom.get(j).getScore() > classroom.get(j+1).getScore())
						  swap(classroom,j,j+1);
				  }
					exchangeMade = true;
				  }
			  }
			    
			    
			    public static int findMinimum(List<Student> classroom2, int first){
			    	
					int minIndex = first;
					for (int i = first + 1; i < classroom2.size(); i++){
						if (((Comparable)classroom2.get(i)).compareTo(classroom2.get(minIndex)) < 0){
							minIndex = i;
						}
					}
					return minIndex;
					
			    }
			    
			    public static void swap(List<Student> classroom2,  int x, int y){
			    	
			    	Student temp = classroom2.get(x);
					classroom2.set(x, classroom2.get(y));
					classroom2.set(y, temp);

			    }
			    			  
	  }



