package com.Store.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import com.Store.PageObject.AccountCreation;
import com.Store.PageObject.AccountPage;
import com.Store.PageObject.CreateAccPage;
import com.Store.PageObject.Index_Page;

public class TC_1_VerifyRegAndLogin extends BaseClass{
	Index_Page IP;
	CreateAccPage CP;
	AccountCreation AC;
	AccountPage AP;
	/*@Test
	public void VerifyRegistrationAndLogin() {
	logger.info("****************TC_1 Verify Registration starts********************");
		 IP=new Index_Page(driver);
		 CP= new CreateAccPage(driver);
		 AC=new AccountCreation(driver);
		 AP= new AccountPage(driver);
		driver.get(baseUrl);
		IP.ClickOnSign();
		
		CP.EnterEmailID("Neha1234@gmail.com");
		CP.ClickOnCreateAccBtn();
		AC.selectTitle();
		logger.info("Title selected");
		AC.EnterFirstName("Neha");
		logger.info("First name entered");
		AC.EnterLastName("Patil");
		logger.info("Last name entered");
		//AC.EnterEmail("anjali@gmail.com");
		AC.EnterPass("NehaPatil1234");
		logger.info("Password entered");
		//AC.selectDay("17");
		//AC.selectMonth("May");
	//	AC.selectYear("1996");
		System.out.println("going to click on submit btn");
		AC.clickOnSubmitBtn();
		System.out.println("Clicked on submit btn");
		logger.info("Clicked on create account button");
		
	String name=AP.NameOfACCHolder();
	System.out.println(name);
		Assert.assertEquals(name,"Nisha Patil");
		
logger.info("*****************************TC_1 Verification of Registration ends***************");} 
	
	@Test
	public void VerifyLogin() throws IOException
	{
		IP=new Index_Page(driver);
		 CP= new CreateAccPage(driver);
		 AC=new AccountCreation(driver);
		 AP= new AccountPage(driver);
		driver.get(baseUrl);
	
		IP.ClickOnSign();
		logger.info("Clicked On Sign in button");
		
		CP.EnterLoginEmail("Kriti1435@gmail.com");
		logger.info("Email address entered");
		
		CP.EnterLoginPass("kriti1435");
		logger.info("password entered");
		
		CP.ClickOnLogin();
		logger.info("Clicked on sign in button");
		
	   String username=AP.NameOfACCHolder();
	   if(username.equals("Kriti Singh"))
	   {
		   logger.info("Verify login=passed");
		   Assert.assertTrue(true);
	   }
	   else
	   {
		   logger.info("Verify login=Failed");
		   CaptureScreenshot(driver, "VerifyLogin");
		   Assert.assertTrue(false);
	   }
	}*/
	@Test
	public void VerifyLogin1() throws IOException
	{
		IP=new Index_Page(driver);
		 CP= new CreateAccPage(driver);
		 AC=new AccountCreation(driver);
		 AP= new AccountPage(driver);
		driver.get(baseUrl);
	
		IP.ClickOnSign();
		logger.info("Clicked On Sign in button");
		
		CP.EnterLoginEmail("Kriti1435@gmail.com");
		logger.info("Email address entered");
		
		CP.EnterLoginPass("kriti1435");
		logger.info("password entered");
		
		CP.ClickOnLogin();
		logger.info("Clicked on sign in button");
		
		CaptureScreenshot(driver,"VerifyLogin1");
		Assert.assertTrue(false);
}
}