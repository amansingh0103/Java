package corejava;

public class Singledimension {

	public static void main(String[] args) {
		String a[]=new String[5];//declaration and instantiation  

		a[0]=" Aman";//initialization  

		a[1]=" Roshan";  

		a[2]=" Tejas";  

		a[3]=" Suraj";  

		a[4]=" Omkar";  

//traversing array  
for(int i=0;i<a.length;i++)//length is the property of array  
	System.out.println(a[i]);  
	}
}