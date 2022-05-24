package corejava;
//Importing arrays and Collections class
		//from java.util class
		import java.util.Arrays;
		import java.util.Collections;
		
		//Main class

public class ArrayAsDs {
	
	//Java program to sort an array of strings
			//in ascending and descending alphabetical order
			//Using Arrays.sort()
	public static void main(String[] args) {
		
				// Custom input string
		        String arr[] = { "Aman Singh",
		                        "Omkar",
		                        "Roshan" };

		 

		        // Sorts arr[] in ascending order
		        Arrays.sort(arr);
		       // System.out.printf("In Ascending Order Modified arr[] : \n%s\n\n",Arrays.toString(arr));
		        System.out.println("In Ascending Order Modified arr[]:"+Arrays.toString(arr));


		 

		        // Sorts arr[] in descending order
		        Arrays.sort(arr, Collections.reverseOrder());

		 

		        // Lastly printing the above array
		        //System.out.printf("In descending Order Modified arr[] : \n%s\n\n",Arrays.toString(arr));
		        System.out.println("In descending Order Modified arr[] :"+Arrays.toString(arr));
		    }
		

	}


