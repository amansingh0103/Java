//Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
package corejava;
import java.util.ArrayList;

class Thread3 extends Thread{
	    public void run(){
	        try {
	            Thread.sleep(200);
	    }
	        catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Welcome");
	    }
	}
	class Thread4 extends Thread {
	    public void run() {
	            System.out.println("Good morning");
	        }
	    }
	class Goodmorning200 {
	    public static void main(String[] args) {
	        Thread3 t3= new Thread3();
	        Thread4 t4= new Thread4();
	        t3.start();
	        t4.start();
	    }
	}

