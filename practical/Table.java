package corejava;
import java.util.Scanner;
	public class Table {
	public static void main(String[] args) {
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for the table: ");

		int s = sc.nextInt();
	
		for (i=1;i<=10;i++){
			 n = s * i;
		
			System.out.println(n + "*"+ i + " = " + n);	
		}
	}
	}
	


