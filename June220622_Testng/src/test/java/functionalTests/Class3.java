package functionalTests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class3 {
//Execute testng4.xml for this test 
	@Parameters({"name","rollno"}) //values on parameters passed through testng4.xml 
	@Test
	public void testHello(String name, int rollno)
	{
		System.out.println("This is Test Hello");
		System.out.println("Hello "+name+" your roll number is :"+rollno);
	}	
}
