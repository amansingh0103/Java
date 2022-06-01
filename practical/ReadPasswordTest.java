package corejava;
//import required packages
import java.io.Console;
public class ReadPasswordTest {

	public static void main(String[] args) {
		try
		{
		Console c=System.console();
		//take input from user
		System.out.println("Enter password: ");    
		char[] ch=c.readPassword();    
		String pass=String.valueOf(ch);//converting char array into string 
		}
		catch(Exception pass)
		  {
		//printing output
		System.out.println("Password is: "+pass);    
		}    
		  

	}
	}
	


