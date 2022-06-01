package corejava;
//import required packages
import java.io.*;
public class FileOutStrm {

		public static void main(String[] args) throws IOException { 
			//Creating object
	        File data = new File("C:\\Users\\amans\\OneDrive\\Documents\\MYfile.txt");  
	        FileOutputStream file = new FileOutputStream(data);  
	        FilterOutputStream filter = new FilterOutputStream(file);  
	        String s="Welcome to Mumbai.";  //Creating string variable    
	        byte b[]=s.getBytes();      
	        filter.write(b);     
	        filter.flush(); 
	        filter.close();  
	        file.close();  
	        
	        //Printing output
	        System.out.println("Success...");  
	    }  
	


	}


