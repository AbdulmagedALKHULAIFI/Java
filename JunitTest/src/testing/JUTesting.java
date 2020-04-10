package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUTesting {

	@Test
	public void test() {
		TestingClass test = new TestingClass();
		int output =test.square(5);
		assertEquals(25,output);
	} 
}
