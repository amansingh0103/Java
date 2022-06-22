package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void  Addtest() {
		//createing object of class
		MyJunitClass junit= new MyJunitClass();
		int result=junit.add(10,26);
		assertEquals(36,result);
	}
}


