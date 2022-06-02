//Java program to demonstrate on fileoutputStream.

package corejava;
//import required packages
import java.io.FileOutputStream;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		try
		{
			//Creating object
			FileOutputStream fout=new FileOutputStream("C:\\Users\\amans\\OneDrive\\Documents\\MYfile.txt");
			String s = ("Hii everyone");
			byte b[] = s.getBytes();
			fout.write(80);
			//Call close Method
			fout.close();
			//printing output
			System.out.println("Hii everyone WE are here to attend the session req of our life goal stay on.");         
	}
	catch(Exception b)
	  {
	System.out.println(b);
	}        


}
}




