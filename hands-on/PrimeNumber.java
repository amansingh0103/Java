package corejava;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		int temp;
		boolean isPrime=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int num=sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   }
	}