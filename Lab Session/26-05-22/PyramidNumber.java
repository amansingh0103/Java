//java program to print the number pyramid.

package corejava;

public class PyramidNumber {

	public static void main(String[] args) {
        int i=1 ,row=5;//i for rows and row for columns   
        
        System.out.println("print the pattern of 5");

        

        for ( i = 1; i <= 5; i++)//outer loop for rows
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++)
            {
                System.out.print(i + " ");
            }
		    //Print the output
            System.out.println();
        }
    }
}