package corejava;
//import required packages
import java.io.*;
public class DataInputStrm {

	
		public static void main(String[] args) throws IOException { 
			//Creating object
		    InputStream input = new FileInputStream("C:\\Users\\amans\\OneDrive\\Documents\\MYfile.txt");  
		    DataInputStream inst = new DataInputStream(input);  
		    int count = input.available();//creating int count  
		    // Create the new byte array input stream
		    byte[] ary = new byte[count];  
		    inst.read(ary); 
		    //Conversion of a byte into character 
		    for (byte bt : ary) {  
		      char k = (char) bt;  
		      //Printing output
		      System.out.print(k+"-");  
		    }  
		  }  
		 
	

	}


