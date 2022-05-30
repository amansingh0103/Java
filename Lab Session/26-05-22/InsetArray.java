//Java program to insert an element into the array list at the first position.

package corejava;
import java.util.*;
public class InsetArray {

	public static void main(String[] args) {
		//Create a list and add some Name to the list
		ArrayList<String> list = new ArrayList<String>();
		  list.add("AMAN");
		  list.add("ROSHAN");    
		  list.add("ANJALI");
		  list.add("TEJESH");
		  list.add("OMKAR");
		  
		  
		  System.out.println(list);
		  
		  //Now insert a Name at the first position of the list
		  list.add(0, "BAJAJ");
		  
		  
		  // Print the list
		  System.out.println(list);
		 }
		

	}


