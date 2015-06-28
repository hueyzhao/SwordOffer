package Problem40;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NumAppearOnceTest {
	private static NumAppearOnce once = new NumAppearOnce();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindNumberAppearOnce() {
		int [] testArray = {-1,-2,-3,-4,6,-1,-3,-2};
		int [] expected = {-4,6};
		assertArrayEquals(expected, once.findNumberAppearOnce(testArray));
		
	}

}
