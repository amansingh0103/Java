package corejava;

import java.util.Scanner;

public class ToysMarts {

//create  multidimensional string Array	
String[][] toys = new String [6][6];

//Constructor
ToysMarts()
{
toys [0][0]="1";
toys[0][1]="Chhota Bheem";

toys [1][0]="2";
toys [1][1] ="Ben 10";

toys [2][0]="3";
toys [2][1]="Batman";

toys [3][0]="4";
toys [3][1]="Motu patlu";

toys [4][0]="5";
toys[4][1]="Doremon";
	    
toys [5][0]="5";
toys[5][1]="Shaktiman";

	    }
//Static getToy Method
public static String getToy(int price)
	    {
String ToysString;
//Switch case
switch(price)
{
//Price of each toy in case
case 449: 
ToysString = "Chhota Bheem";
return ToysString;
	            
case 349:
ToysString = "Ben 10";
return ToysString;
	               
case 249:
ToysString = "Batman";
return ToysString;
	              
case 599:
ToysString = "Motu patlu";
return ToysString;
	               
case 499:
ToysString = "Doraemon";
return ToysString;
	                
case 199:
ToysString = "Shaktiman";
return ToysString;

//default value
default:
ToysString = "No Toys Available in this Range \n Thank you visiting";
return ToysString;
	        }
	    }

public static void main(String[] args) {
System.out.println("Enter a value between 199 to 599");

//create Scanner class
Scanner sc = new Scanner (System.in); 
int price = sc.nextInt ();
System.out.println(getToy(price));
sc.close();
	    }
	
	}


