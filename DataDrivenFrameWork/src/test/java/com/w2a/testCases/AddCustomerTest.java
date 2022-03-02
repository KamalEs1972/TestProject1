package com.w2a.testCases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class AddCustomerTest extends TestBase {
	
	@Test (dataProviderClass=TestUtil.class,dataProvider="dp")
	public void addCustomerTest(Hashtable<String,String> data) throws InterruptedException {
		 if(!data.get("runmode").equals("Y")) {
			 
			 throw new SkipException("Skipping the test case as the Run Mode of the date set NO");
		 }
		click("Add_Customer_Btn1_CSS");
		type("FirstName_CSS",data.get("fisrtName"));
		type("LastName_CSS",data.get("lastName"));
		type("PostCode_CSS",data.get("postCode"));
		click("Add_Customer_Btn2_CSS");
		Thread.sleep(2000);
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(data.get("alertText")));
		alert.accept();
		
		Thread.sleep(2000);
		
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();

	//	Thread.sleep(3000);
	log.debug("Customer Added");
//		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("Add_Customer_Btn2_CSS"))));
}
//	@DataProvider
//	public Object [] [] getData() {
//		
//		String sheetName="AddCustomerTest";
//		int rows = excel.getRowCount(sheetName);
//		
//		int cols = excel.getColumnCount(sheetName);
//		
//		Object [][] data=new Object[rows-1][cols];
//		
//		for(int rowNum=2;rowNum<=rows;rowNum++) {
//			
//			for(int colNum=0;colNum<cols;colNum++)	{
//				//data[0][0]
//				data[rowNum-2][colNum]=excel.getCellData(sheetName,colNum,rowNum);
//			}
//		}
//		return data;
//		
//	}
}