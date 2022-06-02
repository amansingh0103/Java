//Java program to Create a file in java using exception heandling
package corejava;
//import required packages
import java.io.FileOutputStream;

public class ExceptionHandingTest {

	public static void main(String[] args) {
		try
		{
			//Creating object
			FileOutputStream fout=new FileOutputStream("C:\\Users\\amans\\OneDrive\\Documents\\regular.txt");
			String s = ("Hii everyone");
			byte b[] = s.getBytes();
			fout.write(80);
			//Call close Method
			fout.close();
			//printing output
			System.out.println(" Program Done");         
	}
	catch(Exception x)
	  {
	System.out.println(x);
	}        


}


	}


