package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyConCatTest {
	@Test
	void  Addtest() {
		//createing object of class
		MyJunitClass junit= new MyJunitClass();
		String result=junit.ConCat("am","an");
		assertEquals("aman",result);
	}
}

