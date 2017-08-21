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
				 System.out.println("Which sort option (Enter merge for Merge Sort or quick for Quick Sort)?");
				 Scanner chooseSort = new Scanner (System.in);
				 String sortType = chooseSort.nextLine().toLowerCase(); 
				 if (sortType.equals("merge")){
					 System.out.println(classroom.size());
					 merge_sort();
				 }
				 else if (sortType.equals("quick")){
					 quick_sort(0, classroom.size()-1);
				 }
				 //Implementation of code here.
				  
//				  int k = 0;
//				  boolean exchangeMade = true;
//				  while ((k < classroom.size() -1) && exchangeMade){
//					  exchangeMade = false;
//					  k++;
//				int x = classroom.size() - k;
//				  for (int j = 0; j < x; j++){
//					  if (classroom.get(j).getScore() > classroom.get(j+1).getScore())
//						  swap(classroom,j,j+1);
//				  }
//					exchangeMade = true;
//				  }
			  }
			    
			 public static void merge_sort(){
				 List<Student> copyBuffer = new ArrayList<Student>(classroom.size());
				 for (int i = 0; i <classroom.size(); i++ ) {
					 copyBuffer.add(new Student());
				 }
				 mergeSortHelper( copyBuffer, 0, classroom.size()-1);
			 }
			 public static void mergeSortHelper(List<Student> copyBuffer,int low, int high ){
				 System.out.println(low+ "," +high);
				 if (low < high){
					 int middle = (low + high) / 2;
					 mergeSortHelper(copyBuffer, low, middle);
					 mergeSortHelper(copyBuffer, middle + 1, high);
					 merge(copyBuffer, low, middle, high);
					 
				 }	 
			 }
			 public static void merge(List<Student> copyBuffer, int low, int middle, int high){
				 int i1 = low, i2 = middle + 1;
				 for (int i = low; i <= high; i++){
					//System.out.println(i1+ "," +i2);
					 if (i1 > middle){
						copyBuffer.set(i, classroom.get(i2++));
					}
					else if (i2 > high){
						copyBuffer.set(i, classroom.get(i1++));
					}
					else if (classroom.get(i1).getScore() < classroom.get(i2).getScore()){
						copyBuffer.set(i, classroom.get(i1++));
					}
					else{
						//System.out.println(classroom.get(i2++));
						copyBuffer.set(i, classroom.get(i2++));
					}
				 }
				for (int i = low; i <= high; i++){
					
					classroom.set(i, copyBuffer.get(i));
				}	
			}
			 public static void quick_sort(int left, int right){
				 if (left >= right){
					 return;
				 }
				 int i = left;
				 int j = right;
				 int pivotValue = classroom.get((left+ right)/2).getScore();
				 while (i < j){
					 while (classroom.get(i).getScore() < pivotValue)
						 i++;
					 while (pivotValue < classroom.get(j).getScore())
						 j--;
					 if (i <= j){	
					    	Student temp = classroom.get(i);
							classroom.set(i, classroom.get(j));
							classroom.set(j, temp);
							i++;
							j--;
					 }
				 }
				 quick_sort(left, j);
				 quick_sort(i, right);
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



