package corejava;

	class ConstructorOverloding {
	String name;
	double gpa;
	
	ConstructorOverloding(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	ConstructorOverloding(String name) {
		
		this.name = name;
	}
	
	public static void main(String[] args) {
		ConstructorOverloding obj=new ConstructorOverloding("Aman",9.83);	
		ConstructorOverloding cod=new ConstructorOverloding("Aman");
		System.out.println("Name:"+obj.name+"\t"+"Number:"+obj.gpa);
		System.out.println("Name:"+cod.name);

	}
	}


