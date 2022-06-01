package corejava;
//import required packages
import java.io.*;  

public class BufferWriterExpression{

public static void main(String[] args) throws Exception {     
	
	//Creating FileWriter object
    FileWriter writer = new FileWriter("C:\\Users\\amans\\OneDrive\\\\Documents\\java.text");  
	
  //To read from the created file
    BufferedWriter buffer = new BufferedWriter(writer);  
	
    buffer.write("Welcome to My World");  
	
    //Call close() Method
    buffer.close();  
	//printing output
    System.out.println("Success");  
	
    } 
}