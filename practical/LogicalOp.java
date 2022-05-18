package corejava;

public class LogicalOp {

	public static void main(String[] args) {
		//intialising varible
		int a=10,b=20,c=20,d=0;
		
		//abc displaying
		
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		System.out.println("value of c:"+c);
		
		//using logical AND to verify Two constraints
		if ((a<b) && (b==c)){
			
			d=a+b+c;
			System.out.println("sum is:"+d);
					
		}
		else
			System.out.println("false condition");
	}

}
