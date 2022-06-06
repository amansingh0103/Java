package corejava;

public class CallByValue1 {

		static void swap(int a,int b) {
		        int temp = a;
		        a=b;
		        b=temp;
		        System.out.println("Values after swapping x="+a+" y="+b);
		    }
		    public static void main(String[]args) {
		        int x=3;
		        int y=8;
		        System.out.println("Values before swapping x="+x+" y="+y);
		        //calling swap method
		        swap(x,y);

		 

		    }
		

	}


