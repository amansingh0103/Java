//Java program to find the second highest value numerical array. 

package corejava;
import java.util.*;
public class NumericArray {

	public static void main(String[] args) {
			int temp = 0;
			//Create a Arraylist and add some Number to the list
		     ArrayList<Integer> List = new ArrayList<Integer>(); 
		     List.add(8);
		     List.add(9);
		     List.add(5);
		     List.add(6);
		     List.add(7);
		     List.add(4);
		     //Array Sorting
		     Collections.sort(List);
		    // n-2 position
		     temp=List.get(List.size()-2);
			 
		     // Printing the second highest number
		     System.out.println("Second highest number");
			 
		     // Print the list
		     System.out.println(temp);
		  }
		

	}


