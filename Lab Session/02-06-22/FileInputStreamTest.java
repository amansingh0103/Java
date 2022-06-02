//Java program to demonstrate on fileInputStream.
package corejava;
//import required packages
import java.io.*;
public class FileInputStreamTest {

	public static void main(String[] args)throws IOException {
		//Creating object
		File data = new File("C:\\Users\\amans\\OneDrive\\Documents\\FIleInputStream..txt");  
        FileInputStream  file = new FileInputStream(data);  
          
        int k =0;  
        // Read until the end of a file 
        while((k=file.read())!=-1){  
        	//printing output
            System.out.print((char)k);  
        }  
        //Call close Method
        file.close();  
       
    }  
}


