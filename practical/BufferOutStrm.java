package corejava;
//import required packages
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutStrm {

		public static void main(String args[]) throws Exception {
		//Creating object
		FileOutputStream fout = new FileOutputStream("C:\\Users\\amans\\OneDrive\\Documents\\MYfile.txt");
		//To read from the created file
		BufferedOutputStream bout = new BufferedOutputStream(fout);
			
		 String s = "Welcome to Lecture.";
		 byte b[] = s.getBytes();
		//Call close Method
		 bout.write(b);
		 bout.flush();
		 bout.close();
		 fout.close();
		//printing output
		 System.out.println("success");
		        }
		
}


