package interviewQuestions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws Exception  {
		File src=new File("E:\\QE Automation\\ExcelData\\Login.xlsx");
        FileInputStream fis=new FileInputStream(src);
       
       XSSFWorkbook wb=new XSSFWorkbook(fis);
       XSSFSheet sheet1=wb.getSheetAt(0);
      String data0= sheet1.getRow(0).getCell(0).getStringCellValue();
      System.out.println(data0);
      
      
	}

}
