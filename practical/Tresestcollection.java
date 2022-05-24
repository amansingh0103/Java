package corejava;
import java.util.*;  

public class Tresestcollection {

	public static void main(String[] args) {
		TreeSet<String>set=new TreeSet<String>();
		
		set.add("Aman");
		set.add("Rahul");
		set.add("Deepak");
		set.add("tejas");
		
		//Traversing list through Iterator  
		Iterator itr=set.iterator();
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
	}


	}