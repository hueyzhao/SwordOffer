package Problem24;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VerifyBSTTest {
	private static VerifyBST bstTest = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bstTest = new VerifyBST();
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testVerifyBST() {
		int[] postOrder = {5,6,9,11,10,8};
		assertEquals(true,bstTest.verifyBST(postOrder, 0, postOrder.length-1));
	}

}
