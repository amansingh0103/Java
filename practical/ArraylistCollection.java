package corejava;
import java.util.*;
public class ArraylistCollection {

	public static void main(String[] args) {
		//Creating Arraylist
		ArrayList<String>list=new ArrayList<String>();
		
		//Adding object in arraylist  
		list.add("Aman");
		list.add("Rahul");
		list.add("Deepak");
		list.add("tejas");
		
		//Traversing list through Iterator  
		Iterator itr=list.iterator();
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
	}

}
