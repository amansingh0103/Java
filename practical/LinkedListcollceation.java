package corejava;
import java.util.*;
public class LinkedListcollceation {

	public static void main(String[] args) {
		//Creating LinkedList
			LinkedList<String> al=new LinkedList<String>();  				
			//Adding object in LinkedList  
				al.add("Aman");
				al.add("Rahul");
				al.add("Deepak");
				al.add("tejas");
				
				//Traversing list through Iterator  
				Iterator itr=al.iterator();
				while(itr.hasNext()){  
					System.out.println(itr.next());  
				}
			}

		}
