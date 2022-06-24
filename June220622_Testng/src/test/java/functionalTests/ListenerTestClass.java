package functionalTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTestClass {
	//Execute with testng5.xml for Listeners
	@Test
	public void testP() {
		System.out.println("This is Test P");
	}

	@Test
	public void testQ() {
		System.out.println("This is Test Q");
	}

	@Test
	public void testR() {
		System.out.println("This is Test R");
		Assert.assertTrue(false);
	}

	@Test
	public void testS() {
		System.out.println("This is Test S");
	}

	@Test
	public void testT() {
		System.out.println("This is Test T");
		Assert.assertTrue(false);
	}
}
