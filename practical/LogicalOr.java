package corejava;

public class LogicalOr {

	public static void main(String[] args) {
		//intialising varible
				int a=10,b=20,c=20,d=0;
				
				//abc displaying
				
				System.out.println("value of a:"+a);
				System.out.println("value of b:"+b);
				System.out.println("value of c:"+c);
				System.out.println("value of d:"+d);
				
				//using logical AND to verify Two constraints
				if ((a<b || c==d)){
					
					
					System.out.println("One or both\" + \" the conditions are true");
							
				}
				else
					System.out.println("Both the\" + \" conditions are false");
			}

		

	}


