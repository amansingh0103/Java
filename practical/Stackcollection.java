package corejava;
import java.util.*;

public class Stackcollection {

	public static void main(String[] args) {
		Stack<String>stack=new Stack<String>();
		
		stack.push("Aman");
		stack.push("Rahul");
		stack.push("Deepak");
		stack.push("tejas");
		stack.pop();  
		
		//Traversing list through Iterator  
		Iterator itr=stack.iterator();
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
	}


	}


