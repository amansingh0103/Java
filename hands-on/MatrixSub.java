package corejava;
import java.util.Scanner;

public class MatrixSub {

	public static void main(String[] args) {
		int i, j;
		int[][]a=new int[3][3];
		int[][]b=new int[3][3];
		int[][]c=new int[3][3];
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter 9 elements for first matrix: "); 
		for(i=0; i<3; i++) { 
			for(j=0; j<3; j++) { 
				a[i][j] = s.nextInt(); } } 
		//input for 2nd matrix 
		System.out.print("Enter 9 elements for second matrix: ");
		
		for(i=0; i<3; i++) { 
		for(j=0; j<3; j++) { 
		b[i][j] = s.nextInt(); } } 
		for(i=0; i<3; i++) { 
		for(j=0; j<3; j++) { 
		c[i][j] = a[i][j] - b[i][j]; } } 
		
		//Addition result 
		System.out.println("\n----subtrication Result----"); 
		for(i=0; i<3; i++) { 
			for(j=0; j<3; j++) { 
		System.out.print(c[i][j]+ " "); 
		} 
			System.out.print("\n"); } } 
	


	

	}


