package corejava;
import java.util.Scanner;
public class IntArtOpr {

	public static void main(String[] args) {
		//create object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//Input two nos from user
		System.out.println("Enter first number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second number:");
		int num2=sc.nextInt();
		
		//perform arithmetic operation
		int add,sub,mul,div,mod;
		add = num1 + num2; 
		sub = num1 - num2; 
		mul = num1 * num2; 
		div = num1 / num2; 
		mod = num1 % num2; 

		// Print result to console. 
		System.out.println("Addition is: " + add); 
		System.out.println("subtraction is: " + sub); 
		System.out.println("multiplication is: " + mul); 
		System.out.println("Division is: " + div); 
		System.out.println("Modulo is: " + mod); 

		} 
	}


