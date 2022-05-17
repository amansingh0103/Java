package corejava;

public class simpleInherit {
public void print() {
	System.out.println("Aman");
}
}
class SimpleOne extends simpleInherit{
	public void show() {
	System.out.println("Amu");
	}
	}
class RunMethod{
    
    public static void main(String[] args) {        
        SimpleOne s= new SimpleOne();
        s.print();
        s.show();
        s.print();
    }
}




