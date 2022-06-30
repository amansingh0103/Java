package corejava;
import java.util.*;
import java.io.*;


class SpecialistDoctor extends Doctor
	{
	    private String specialist;
	  //Getter and Setter method
	    public void setSpecialist(String s) {
	        this.specialist = s;
	    }
	    //get Specialist
	    public String getSpecialist() {
	        return specialist;
	    }
	 // parametrized constructor
	    SpecialistDoctor(int i,String n,String l,String s)
	    {
	        super(i, n, l);
	        specialist = s;
	    }
	 // get Details
	    public void getDetails()
	    {
	        super.getDetails();
	        System.out.println("Specialist: "+specialist);
	    }
	


public static void main(String[] args) {
			//Creating Scannar class
	        Scanner sc = new Scanner(System.in);
	        //Taking input from user
	        String t = sc.nextLine();
	      //if statement
	        if(t.equalsIgnoreCase("Specialist"))
	        {
	            SpecialistDoctor s = new SpecialistDoctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine());
	            s.getDetails();
	        }
	        //else-if statement
	        else if(t.equalsIgnoreCase("Doctor"))
	        {
	            Doctor s = new Doctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
	            s.getDetails();
	        }
	        //else statement
	        else
	        {
	            System.out.println("Invalid Input");
	        }     
	        sc.close();  
	    
}
}
