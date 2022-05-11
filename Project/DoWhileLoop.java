package corejava;
import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		//creating object of scrnner class
		Scanner sc=new Scanner(System.in);
		//Declaring variable
		int num,sum;
		sum=0;
		num=0;
		do {
			sum+=num;
			System.out.println("Enter a number:");
			num=sc.nextInt();
		}
		while(num>=0);
		System.out.println("\"The sum of numbers are:" + sum);
		sc.close();
	}

}
