package corejava;

public class TestGarbage1 {
	public void finalize(){
		System.out.println("garbage collected object");
		}

	public static void main(String[] args) {
		TestGarbage1 s1=new TestGarbage1();
		TestGarbage1 s2=new TestGarbage1();
		s1=null;
		s2=null;
		System.gc();

	}

}
