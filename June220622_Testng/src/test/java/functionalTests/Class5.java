package functionalTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ExcelUtils;

public class Class5 {
	@Test(dataProvider = "getdata")
	public void testGoodMorning(String Username,String password)
	{
		System.out.print("UserName is :" +Username);
		System.out.println(", PassWord is :" +password);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		return ExcelUtils.iterateData();
	}
}
