package maventestingproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MavenAnnotations {
	@Before
	public void BeforeTestMethod()
	{
		System.out.println("@Before-runBeforetestMethod");
	}
	
	@After
	public void AfterTestMethod()
	{
		System.out.println("@After-runAftertestMethod");
	}
	@BeforeClass
	public static void runOnceBeforeclass()
	{
		System.out.println("@Beforeclass-runOnceBeforeclass");
	}
	@AfterClass
	public static void runAfterclass()
	{
		System.out.println("@Afterclass-runOnceAfterclass");
	}
	@Ignore
	public void Ignore()
	{
		System.out.println("@Ignore- Ignoring the method...");
		
	}
	@Test(timeout=100)
	public void testTimeout()
	{
		System.out.println("@TestTimeout(timeout=100)-Setting the time");
	}
	@Test
	public void Test()
	{
		System.out.println("@Test-Test method@After");
	}
	@Test(timeout=200)
	public void testTimeOut()
	{
		System.out.println("@TestTimeout(timeout=200)-Setting the time");
	}
	
	
	
	

}
