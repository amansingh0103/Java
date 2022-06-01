package corejava;
//import required packages
import java.io.FileInputStream;
public class FileInputStrem {

		public static void main(String args[])
		{    
			try
			{     
			//Creating object
			FileInputStream fin=new FileInputStream("C:\\Users\\amans\\OneDrive\\Documents\\MYfile.txt");    
			  int i=0;    
			  while((i=fin.read())!=-1)
			  {    
			 System.out.print((char)i);    
			  }    
			//Call close Method
			 fin.close();    
			 }
			catch(Exception e)
			{
				 System.out.println(e);
			 }            
			 

	}

}
