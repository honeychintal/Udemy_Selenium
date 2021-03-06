package functionalTests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {
	Logger log= LogManager.getLogger(Class1.class);
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.print("Class 1: ONE: ");
		log.info("Log message in, beforemethod");
	}
	@Test(groups={"regression"})
	public void testA()
	{
		System.out.println("This is Test A");
	}
	
	@Test(groups={"smoke"})
	public void testB()
	{
		System.out.println("This is Test B");
	}
	
	@Test(groups={"smoke", "regression"})
	public void testC()
	{
		System.out.println("This is Test C");
	}
	
	@Test
	public void testLogging()
	{
		System.out.println("This is Test testLogging");
		log.trace("Log trace message in, testLogging");
		log.info("Log info message in, testLogging");
		log.error("Log error message in, testLogging");
		log.warn("Log warn message in, testLogging");
		log.fatal("Log fatal message in, testLogging");
		log.debug("Log debug message in, testLogging");
	}
	
}
