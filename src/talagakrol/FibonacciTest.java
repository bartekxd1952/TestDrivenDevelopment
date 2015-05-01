package talagakrol;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void getElementLoopTest()
	{
		assertEquals(50, FibonacciLauncher.getElemntLoop(6));
	}
}
