package corejava;
//import required packages
import java.io.FileInputStream;
import java.io.SequenceInputStream;
public class SequenceInputStrm {

		
	public static void main(String args[])throws Exception{   
	//Creating object
	 FileInputStream input1=new FileInputStream("C:\\Users\\amans\\OneDrive\\Documents\\MYfile.txt");    
	 FileInputStream input2=new FileInputStream("C:\\Users\\amans\\OneDrive\\Documents\\java.text");    
	 SequenceInputStream inst=new SequenceInputStream(input1, input2);    
	 int j;    
	 while((j=inst.read())!=-1){    
	 System.out.print((char)j);    
	 }   
	//Call close Method
	 inst.close();    
	 input1.close();    
	 input2.close();      
	 }   
}