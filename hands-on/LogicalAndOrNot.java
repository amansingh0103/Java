package corejava;
import java.util.Scanner;
public class LogicalAndOrNot {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		age = sc.nextInt();
		
		if (!(age > 18)) {
			System.out.println("You are Too Young");
		}
		else if (age > 18 && age <= 35) {
			System.out.println("Young Man");
		}
		else if (age == 36 || age <= 60) {
			System.out.println("You are Middle Age Person");
		}
		else {
			System.out.println("You are too Old");
		}
	}
}

