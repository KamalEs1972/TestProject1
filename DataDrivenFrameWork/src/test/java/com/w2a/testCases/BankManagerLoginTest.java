package com.w2a.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {
	@Test
	public void loginAsBankManager() throws InterruptedException, IOException {
		
			
		verifyEqulas("aBC", "XYZ");
		
		Thread.sleep(3000);
		log.debug("Inside Login Test!!");
		
		//driver.findElement(By.cssSelector(OR.getProperty("bmlBtn_CSS"))).click();
		click("bmlBtn_CSS");
		Reporter.log("Inside Login Test!!");
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("Add_Customer_Btn1_CSS"))));
		
		log.debug("Login successfully executed!!");
		
		
		
		//Thread.sleep(3000);
	
		
		//driver.findElement(By.cssSelector(OR.getProperty("Add_Customer_Btn1_CSS"))).click();
		click("Add_Customer_Btn1_CSS");
		//Thread.sleep(3000);
		log.debug("Adding Customer executed");
		
		//Assert.fail("Login Not Successfull");
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("Add_Customer_Btn2_CSS"))));
		Reporter.log("Adding Customer executed");
		
		
	driver.findElement(By.cssSelector(OR.getProperty("Add_Customer_Btn2_CSS"))).click();
//		Thread.sleep(3000);
	}

}

