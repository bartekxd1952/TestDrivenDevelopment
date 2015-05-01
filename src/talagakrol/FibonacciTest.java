package talagakrol;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void getElementLoopTest()
	{
		assertEquals(50, FibonacciLauncher.getElemntLoop(6).intValue());
		assertEquals(60, FibonacciLauncher.getElemntLoop(7).intValue());
		assertEquals(100, FibonacciLauncher.getElemntLoop(20).intValue());
		assertEquals(144, FibonacciLauncher.getElemntLoop(12).intValue());
	}
}
