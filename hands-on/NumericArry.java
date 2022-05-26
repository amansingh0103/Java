package corejava;
import java.util.*;
public class NumericArry {

	public static void main(String[] args) {
			int temp = 0;
		     
		     ArrayList<Integer> List = new ArrayList<Integer>(); 
		     List.add(8);
		     List.add(9);
		     List.add(5);
		     List.add(6);
		     List.add(7);
		     List.add(4);
		     
		     Collections.sort(List);
		    
		     temp=List.get(List.size()-2);
		     System.out.println("Second highest number");
		     System.out.println(temp);
		  }
		

	}


