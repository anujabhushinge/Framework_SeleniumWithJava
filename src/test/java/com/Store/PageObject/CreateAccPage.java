package com.Store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccPage {
	WebDriver driver;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement EmailId;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement CreateAccBtn;
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	private WebElement LoginEmailID;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement LoginPass;
	
	@FindBy(xpath="//p[@class='submit']")
	private WebElement LoginBtn ;
	
	public void EnterEmailID(String EmailID)
	{
		EmailId.sendKeys(EmailID);
	}
	
	public void ClickOnCreateAccBtn()
	{
		CreateAccBtn.click();
	}
	
	public void EnterLoginEmail(String LoginMail)
	{
		LoginEmailID.sendKeys(LoginMail);
	}
	
	public void EnterLoginPass(String LoginPassword)
	{
		LoginPass.sendKeys(LoginPassword);
	}
	
	public void ClickOnLogin()
	{
		LoginBtn.click();
	}
	
	public  CreateAccPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver, this);
	}


}
