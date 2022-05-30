//Java program that prompts the users to input a positive integer.
//It should then out a message indicating whether the number is a prime Number.

package corejava;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		
		int temp;
		boolean isPrime=true;
		// Create scanner class object
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int num=sc.nextInt();
		for(int i=2;i<=num/2;i++)//executes until the condition returns true 
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		 // Print the Number
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   }
	}