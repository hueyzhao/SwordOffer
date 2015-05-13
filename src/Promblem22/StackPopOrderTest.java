package Promblem22;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackPopOrderTest {
	private static StackPopOrder order = new StackPopOrder();
	private static int[] pushOrder = {1,2,3,4};
	private static int[] popOrder = {2,4,1,3};
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsPopOrder() {
		assertEquals(false,order.isPopOrder(pushOrder, popOrder));
	}

}
