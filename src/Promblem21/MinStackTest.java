package Promblem21;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MinStackTest {

	private static MinStack stack = new MinStack();

	@Before
	public void setUp() throws Exception {
		stack.push(-1);
		stack.push(6);
		stack.push(8);
		
		stack.push(0);
		stack.push(-2);
	}

	@Test
	public void testMinValue() {
		stack.pop();
		assertEquals(-1,stack.minValue());
	}

	@Test
	public void testPop() {
		stack.pop();
		assertEquals(0,stack.pop());
	}

}
