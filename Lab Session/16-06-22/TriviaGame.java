package corejava;

import java.util.*;

public class TriviaGame {

//static variables
public static int[] points = {2,3,2,3,5};
public static String[] answers = {
"LOTUS",
"TIGER",
"HOCKEY",
"DELHI",
"PEACOCK"
	};

//static triviaMethod
public static int triviaMethod(String[] questions, String[] stt) {
	
//Creating object of scanner class
Scanner sc = new Scanner(System.in);
String str;
int point=0;
for(int i=0;i<5;i++) {
System.out.println(questions[i]);
System.out.println(stt[i]);
if(stt[i].toUpperCase().equals(answers[i])) {
System.out.println("Correct!");
point+=points[i];
System.out.println("");
}
else {
System.out.println("Wrong answer");
System.out.println("");
}
}
return point;			
}

//One Dimentional Array
public static void main(String[] args) {

	
//adding questions
int point;
Scanner sc = new Scanner(System.in);
String[] stt=new String[5];
String[] questions = {
"Question 1: What is the National Flower of INDIA?",
"Question 2: What is the National Animal of INDIA?",
"Question 3: What is the National Game of INDIA?",
"Question 4: What is the capital of INDIA ?",
"Question 5: What is the National Bird of INDIA ?",
};
		
for(int i=0;i<5;i++) {			
System.out.println(questions[i]);
stt[i]=sc.nextLine();			
}

point=triviaMethod(questions,stt);
System.out.println("Final score: "+point);
		
if(point==15) 
{
System.out.println("You are the Winner!");
	
}
else if(point>3 && point<15)
{
System.out.println("You are Runnerup!!");
}
else
{
System.out.println("Better Luck Next Time!!");	
}
}
}



