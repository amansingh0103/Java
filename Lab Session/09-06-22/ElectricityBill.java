package corejava;
import java.util.*;
//class name should be "ElectricityBill";
public class ElectricityBill {

	//Create Static variable
	static double CalculateElectricityBill(int units) {
		
		//write method code here
		int u;
		double amt=0,uni;//initiating amt
		uni=units;
		if(units<=0) {
			return units;
		}
		else {
			//calculate for bill unit grater 30
			if(units>30) {
				u=units-30;
				amt=30.0*3.5;
				if(u>30&&u>=70) {
					u=u-70;
					//calculate for bill unit grater 70
					amt=amt+(70*4);
				
				}
					amt=amt+(u*5);
				}
						
			else {
				//for unit value between 1-3 
				amt=uni*3.5;
			}
	}
		return amt;
	}
		public static void main(String[] args) {

			int units;
			double amount ;
			System.out.println("Enter the value");
			Scanner sc= new Scanner(System.in);
			units=sc.nextInt();
			amount = CalculateElectricityBill(units);
			if(amount<0) {
				System.out.println("INVALID INPUT");
			}
			else if (amount==0) {
				System.out.println(0.0);
			}
			else {
				//printing amount
				System.out.println(amount);
			}
		

	}
}
