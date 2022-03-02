package com.w2a.testCases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class OpenAccountTest extends TestBase {
	
	@Test (dataProviderClass=TestUtil.class,dataProvider="dp")
	public void openAccountTest(Hashtable<String,String> data) throws InterruptedException {
		
		click("OpenAccount_CSS");
		
		select("Customer_CSS",data.get("Customer"));
		select("Currency_CSS",data.get("Currency"));
		Thread.sleep(2000);
		click("Process_CSS");
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//Assert.assertTrue(alert.getText().contains(alertText));
		alert.accept();
		
		
		
		
//		click("Add_Customer_Btn1_CSS");
//		type("FirstName_CSS",firstName);
//		type("LastName_CSS",lastName);
//		type("PostCode_CSS",postCode);
//		click("Add_Customer_Btn2_CSS");
//		
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		Assert.assertTrue(alert.getText().contains(alertText));
//		alert.accept();
//		
//		Assert.fail("Customer Not Added Successfully");
//		
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();

	//	Thread.sleep(3000);
	//log.debug("Customer Added");
//		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("Add_Customer_Btn2_CSS"))));

}
	}