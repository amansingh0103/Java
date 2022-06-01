package corejava;
//import required packages
import java.io.FileOutputStream;
public class FileOutputStrm {

		public static void main(String args[]){    
			  try
			  {    
			//Creating object
			FileOutputStream fout=new FileOutputStream("C:\\Users\\amans\\OneDrive\\Documents\\MYfile.txt");    
			String s = ("Welcome to my World");
			byte b[] = s.getBytes();
			fout.write(65);
			//Call close Method
			fout.close();      
			
			//printing output
			System.out.println("success...");         
			}
			catch(Exception e)
			  {
			System.out.println(e);
			}        
	}

}
