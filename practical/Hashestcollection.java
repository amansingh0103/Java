package corejava;
import java.util.*;  
public class Hashestcollection {

	public static void main(String[] args) {
		HashSet<String>set=new HashSet<String>();
		
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