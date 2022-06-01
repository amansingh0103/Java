package corejava;
//import required packages
import java.io.*;
public class DataOutStrm {

	public static void main(String[] args) throws IOException {  
		//Creating object
        FileOutputStream file = new FileOutputStream("C:\\Users\\amans\\OneDrive\\Documents\\MYfile.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        //Call close Method
        data.close();  
        System.out.println("Succcess...");  
    }  
} 

