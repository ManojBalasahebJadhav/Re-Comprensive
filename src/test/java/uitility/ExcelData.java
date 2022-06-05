package uitility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelData {
	public HSSFWorkbook wb;
	
	public ExcelData() {
		File src=new File("C:\\Users\\mindsdet337\\eclipse-workspace\\Re-HybridFramework\\ExcelData\\Excel.xls");
		
		
			
			FileInputStream fis;
			try {
				fis = new FileInputStream(src);
				wb=new HSSFWorkbook(fis);
			} catch (Exception e) {
				
				e.printStackTrace();
				System.out.println("Unable to read file");
			}
			
		
	}
	
	public String getStringData(String sheetName,int row,int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
	}
	
	public double getNumberData(String sheetName,int row,int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}



}
