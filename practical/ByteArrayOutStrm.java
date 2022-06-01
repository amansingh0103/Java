package corejava;
//import required packages
import java.io.*;  
public class ByteArrayOutStrm {  
public static void main(String args[])throws Exception{  
	  //Creating object
      FileOutputStream fout1=new FileOutputStream("C:\\Users\\amans\\OneDrive\\Documents\\MYfile.txt");    
      FileOutputStream fout2=new FileOutputStream("C:\\Users\\amans\\OneDrive\\Documents\\java.text");    
      
      // Create the new byte array input stream  
      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
      bout.write(65);    
      bout.writeTo(fout1);    
      bout.writeTo(fout2);    
       
      
      bout.flush();    
      //Call close Method
      bout.close();//has no effect    
      System.out.println("Success...");    
     }    
    }  
