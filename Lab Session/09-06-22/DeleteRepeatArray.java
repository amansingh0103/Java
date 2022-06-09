package corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteRepeatArray {
	
	//creating static method
	public static Character[] k;
	public static void main(String[] args)throws Exception {
		
		//creating object of Scanner class
		Scanner sc =new Scanner(System.in);
		char[] arr=new char[4];
		System.out.println("Array before deleting duplicates");
		
		//i-input
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next().charAt(0);
			System.out.println("a["+i+"] = "+arr[i]);
			
		}
		//printing values
		System.out.println("SIze: "+arr.length);
		System.out.println("Array after deleting duplicates : ");
		
		//code to delete repeated value in array
		int size=deleteRepeats(arr);
		for(int i=0;i<size;i++) {
			System.out.println("a["+i+"] = "+k[i]);
			
		}
		//printing values
		System.out.println("Final Size: "+k.length);
		

	}
	
	//Creating static method
	public static int deleteRepeats(char[] arr) {
		ArrayList<Character>lis=new ArrayList<Character>();
		for(int i=0;i<arr.length;i++) {
			if(lis.contains(arr[i])) {
				continue;
			}
			else{
				lis.add(arr[i]);
				
			}
		}
		k=new Character[lis.size()];
		k=lis.toArray(k);
		return k.length;
	}

}