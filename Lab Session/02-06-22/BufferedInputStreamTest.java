//Java Program to demonstarte on BufferdInputStream.
package corejava;
import java.io.*;
public class BufferedInputStreamTest {

	public static void main(String[] args)throws Exception {
	    //Creating FileReader object
		FileReader file =new FileReader("C:\\Users\\amans\\OneDrive\\Documents\\BufferedInputStreamTest.text");
		
		//To read from the created file
		BufferedReader br=new BufferedReader(file);
		
		//Call Read Method By Using While Loop
		int i;
		while((i=br.read())!=-1){
			 System.out.print((char)i);
		}
	    //Call close Method

		br.close();
		file.close();
	}

}