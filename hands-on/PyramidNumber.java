package corejava;

public class PyramidNumber {

	public static void main(String[] args) {
        int i=1 ,row=5;
        
        System.out.println("print the pattern of 5");

        

        for ( i = 1; i <= 5; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}