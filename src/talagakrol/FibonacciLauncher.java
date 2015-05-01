package talagakrol;

import java.math.BigInteger;

public class FibonacciLauncher
{
	public static void main(String[] args) 
	{
		//TODO not implementet yet
	}
	
	public static BigInteger getElemntLoop(int index)
	{
		if (index < 1)
			throw new IllegalArgumentException();
		if (index == 1)
			return new BigInteger("1");
		if (index == 2)
			return new BigInteger("1");

		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		BigInteger c = new BigInteger("0");

		for (int i = 3; i <= index; i++)
		{
			c = b.add(a);
			a = b;
			b = c;
		}
		return c;
	}
	
	private static void printFoundedElement(int i)
	{
		System.out.println(i);
		System.out.println(getElemntLoop(i));
	}

	private static boolean checkFibonacciTerm(int i)
	{
		return getElemntLoop(i).toString().length() == 1000;
	}
}
