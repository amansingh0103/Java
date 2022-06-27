//program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
package corejava;
import java.util.ArrayList;
class Thread1 extends Thread{
	//Initiated run method for thread
    public void run(){
        while (true){
        System.out.println("Welcome");
    }
    }
}
class Thread2 extends Thread {
	//Initiated run method for thread
    public void run() {
        while (true) {
            System.out.println("Good morning");
        }
    }
}
class Goodmorning {
    public static void main(String[] args) {
    	//Initializing Thread object
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
      //invoking thread
        t1.start();
        t2.start();
        
        
       
    }
}