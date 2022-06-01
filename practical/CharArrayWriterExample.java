package corejava;
//import required packages
import java.io.CharArrayWriter;  
import java.io.FileWriter;  

public class CharArrayWriterExample {
		
	public static void main(String args[])throws Exception{  
		//Creating object
        CharArrayWriter out=new CharArrayWriter();    
        out.write("Welcome to Mumbai ");    
        FileWriter f1=new FileWriter("C:\\Users\\amans\\OneDrive\\Documents\\MYfile.txt");    
        FileWriter f2=new FileWriter("C:\\Users\\amans\\OneDrive\\Documents\\MYfile - Copy.txt");    
        FileWriter f3=new FileWriter("C:\\Users\\amans\\OneDrive\\Documents\\MYfile - Copy (2).txt");    
        FileWriter f4=new FileWriter("C:\\Users\\amans\\OneDrive\\Documents\\MYfile - Copy (3).txt");    
        out.writeTo(f1);    
        out.writeTo(f2);    
        out.writeTo(f3);    
        out.writeTo(f4); 
        //close method
        f1.close();    
        f2.close();    
        f3.close();    
        f4.close();    
        //printing
        System.out.println("Success...");    
       }    
      

		

	}


