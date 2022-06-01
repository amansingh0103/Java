package corejava;
//import required packages
import java.io.FileOutputStream;  
import java.io.PrintStream;  
public class PrintStrm {

	public static void main(String args[])throws Exception{    
			//Creating object
		   FileOutputStream fout=new FileOutputStream("C:\\Users\\amans\\OneDrive\\Documents\\MYfile.txt");    
		   PrintStream pout=new PrintStream(fout);    
		   pout.println(2016);    
		   pout.println("Hello Java");    
		   pout.println("Welcome to Java");  
		   //close method
		   pout.close();    
		   fout.close();  
		   //print
		  System.out.println("Success?");    
		 }    
		} 

