package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtils {
	static String filePath = System.getProperty("user.dir") + "/excel/DDT_excel.xlsx";
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void init() throws IOException
	{
		workbook = new XSSFWorkbook(filePath);
		sheet = workbook.getSheet("Sheet1"); // name of sheet in workbook
	}
	
	public static int getRowCount(){
		int rowsCount = 0;
		try {
			init();
			rowsCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of Rows: " + rowsCount);
		} catch (Exception e) {
			System.out.println("caught exception :" + e);
		}
		return rowsCount;
	}
	public static int getColCount(){
		int colsCount = 0;
		try {
			init();
			colsCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of Columns: " + colsCount);
		} catch (Exception e) {
			System.out.println("caught exception :" + e);
		}
		return colsCount;
	}
	@Test
	public static Object[][] iterateData(){
		int rowsCount = getRowCount();
		int colsCount = getColCount();
		Object[][] obj = null;
		try {
			obj = new Object[rowsCount][2];
			init();
			for(int i=1;i<rowsCount;i++)
			{
				for(int j=0;j<colsCount;j++)
				{
					obj[i][j]= sheet.getRow(i).getCell(j).getStringCellValue();
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("caught exception :" + e);
		}
		return obj;
	}
	
	@Test
	public static void iterateDataTest(){
		int rowsCount = getRowCount();
		int colsCount = getColCount();
		Object[][] obj = null;
		try {
			obj = new Object[rowsCount][2];
			init();
			for(int i=1;i<rowsCount;i++)
			{
				for(int j=0;j<colsCount;j++)
				{
					obj[i][j]= sheet.getRow(i).getCell(j).getStringCellValue();
//					obj[i][j+1]= sheet.getRow(i).getCell(j+1).getStringCellValue();
					System.out.println("obj["+i+"]["+j+"] = "+obj[i][j]);
//					System.out.println(", obj["+i+"]["+j+1+"] = "+obj[i][j+1]);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("caught exception :" + e);
		}
	}
	
	@Test
	public void getCellDataTest(){
		try {
			init();
			String cell_data= sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println("Cell data: "+cell_data);
		}
		catch(Exception e)
		{
			System.out.println("caught exception :" + e);
		}
	}
}
