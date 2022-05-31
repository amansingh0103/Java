package corejava;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ImputStremReaderExample {

			public static void main(String args[])throws Exception{             
				//Creating object
			    InputStreamReader r=new InputStreamReader(System.in);    
				
			    BufferedReader br=new BufferedReader(r);            
				
			    System.out.println("Enter your name");    
				
			    String name=br.readLine();    
			   
			    //To Reading The Value From The User
			    System.out.println("Welcome "+name);    
				
			}    
				
			
	}


