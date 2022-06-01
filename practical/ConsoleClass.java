package corejava;
//import required packages
import java.io.Console;  
public class ConsoleClass {

 public static void main(String[] args){
	        // Create the console object
	        Console cnsl= System.console();
	        if (cnsl == null) {
	            System.out.println("No console available");
	            return;
	        }
	        // Read line
	        String str = cnsl.readLine("Enter string : ");
	        // Print
	        System.out.println(
	            "You entered : " + str);
	    }
}



