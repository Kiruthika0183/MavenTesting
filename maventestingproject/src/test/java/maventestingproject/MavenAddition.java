package maventestingproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class MavenAddition {
	public static int add(int a,int b)
	{
		int add=a+b;
		return add;
	}
	@Test
	public void addtest()
	{
		//assertEquals(Expected,Actual);
		assertNotSame(5,MavenAddition.add(2, 2));
	}
	
	

}
