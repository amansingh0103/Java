package corejava;
import java.util.*;  
public class Vectorcollection {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  
		v.add("aman");  
		v.add("Amit");  
		v.add("Anshu");  
		v.add("Garima");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		


	}


