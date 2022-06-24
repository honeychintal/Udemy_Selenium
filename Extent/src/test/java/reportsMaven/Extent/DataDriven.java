package reportsMaven.Extent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.logging.log4j.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	private static Logger log = LogManager.getLogger(DataDriven.class.getName());
	public static void main(String[] args) throws IOException
	{
		log.info("Started program...");
		String testcase ="Purchase";
		String sheetname ="testdata";
		FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir")+"//resources//testResources.xlsx"));
		log.info("FileInputStream created...");
		System.out.println(fis.available());
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets =workbook.getNumberOfSheets();
		log.info("Extracted number of sheets...");
		System.out.println("no of sheets "+sheets);
		for(int i=0;i< sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase(sheetname)){
				log.info("getting the sheets...");
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> ce = firstrow.cellIterator();
				int column=0, k=0;
				while(ce.hasNext())
				{
					log.info("validating the sheet if having the perticular column...");
					Cell value = ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestCase")){
						column =k;
					}
					k++;
				}
				System.out.println("column "+column);
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcase))
					{
						log.info("iterating the content of the rows....");
						Iterator<Cell> cv = r.cellIterator();
						while(cv.hasNext())
						{
							System.out.println(cv.next().getStringCellValue());
						}
					}
					
				}
			}
		}
		log.error("Closing workbook...");
		workbook.close();
	}
}