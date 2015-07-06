package Problem44;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StraightTest {
	private static Straight straight;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		straight = new Straight();
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testIsStraight() {
		int [] straightArray = {4,5,6,6,7};
		assertEquals(true,straight.isStraight(straightArray));
	}

}
