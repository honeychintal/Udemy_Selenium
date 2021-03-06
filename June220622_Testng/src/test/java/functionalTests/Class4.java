package functionalTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class4 {
	@Test(dataProvider = "getdata")
	public void testGoodMorning(String name,String Username,String password)
	{
		System.out.println("Name is :" +name);
		System.out.println("UserName is :" +Username);
		System.out.println("PassWord is :" +password);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[3][3]; //rows,columns
		data[0][0] = "Ramesh Kumar";
		data[0][1] = "Ramesh";
		data[0][2] = "Ramesh@1100";
		
		data[1][0] = "Kamala Harris";
		data[1][1] = "K. Harris";
		data[1][2] = "Harris@USA001";

		data[2][0] = "Sarita chandran";
		data[2][1] = "Savi chandra";
		data[2][2] = "ChandraS#003";
		
		return data;
	}
}
