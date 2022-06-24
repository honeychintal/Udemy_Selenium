package functionalTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class2 {
	@BeforeMethod
	public void beforemethod()
	{
		System.out.print("Class 2: TWO: ");
	}
	@Test(groups={"smoke", "regression"})
	public void testX()
	{
		System.out.println("This is Test X");
	}
	
	@Test(groups={"smoke"})
	public void testY()
	{
		System.out.println("This is Test Y");
	}
	
	@Test(groups={"regression"})
	public void testZ()
	{
		System.out.println("This is Test Z");
	}
	
}
