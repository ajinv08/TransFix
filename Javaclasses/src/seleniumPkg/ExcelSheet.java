package seleniumPkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		Properties props = new Properties();
		FileInputStream fis1=new FileInputStream("C:\\Users\\LOVE IS\\Desktop\\Java Work Space\\Javaclasses\\src\\seleniumPkg\\configaji.properties");
		props.load(fis1);
		//1. Locate Excel File
		
		File file = new File(props.getProperty("excelfile"));
		
		//2. Read Excel File
		
		FileInputStream fis = new FileInputStream(file);
		
		//3. Convert to XSSF
		
		Workbook wb = new XSSFWorkbook(fis);
		
		//4. switch into specific sheets
		Sheet worksheet = wb.getSheet(props.getProperty("selsheet"));
						
		
		//5. get row count
		int lastRow = worksheet.getLastRowNum();
		int firstRow = worksheet.getFirstRowNum();
		//System.out.println(firstRow +" "+lastRow);
		
		//6. Traverse into rows & column and extract value
	
	for(int i =0;i<lastRow+1;i++) {
		Row row = worksheet.getRow(i);
		System.out.println();
		for (int j=0; j<row.getLastCellNum();j++) {
			System.out.print(row.getCell(j).getStringCellValue()+" , ");
			
		}
	}
		
	
	
	}
	
  
}
