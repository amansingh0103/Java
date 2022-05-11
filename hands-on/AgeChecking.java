package corejava;
import java.util.Scanner;
 class AgeChecking {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your age");
        age = sc.nextInt();
	
	if(age>=18) 
	{
		System.out.println("You are eligible:");
	}
	else
	{
		System.out.println("You are not eligible:");
	}
	
	}
 }
