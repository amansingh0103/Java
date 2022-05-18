package corejava;
import java.util.Scanner;
public class relationophandson {

	public static void main(String[] args) {
		int num,num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		num = sc.nextInt();
		System.out.println("Enter the 2nd number : ");
		num1 = sc.nextInt();
		//is equal to
		  System.out.println("num1 == num2 = " + (num == num1));
		  //is not equal to
		  System.out.println("num1 != num2 = " + (num != num1));
		  //Greater than
		  System.out.println("num1 >  num2 = " + (num >  num1));
		  //Less than
		  System.out.println("num1 <  num2 = " + (num <  num1));
		  //Greater than or equal to
		  System.out.println("num1 >= num2 = " + (num >= num1));
		  //Less than or equal to
		  System.out.println("num1 <= num2 = " + (num <= num1));
		

	}

}
