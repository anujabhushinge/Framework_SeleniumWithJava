package com.Store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation {
	WebDriver driver;
	Select s;
@FindBy(xpath="//input[@id='id_gender2']")
private WebElement Title;
@FindBy(xpath="//input[@name='customer_firstname']")
private WebElement FirstName;
@FindBy(xpath="//input[@name='customer_lastname']")
private WebElement LastName;
@FindBy(xpath="(//input[@name='email'])[1]")
private WebElement email;
@FindBy(xpath="//input[@id='passwd']")
private WebElement password;
@FindBy(xpath="//select[@id='days']")
private WebElement day;
@FindBy(xpath="//select[@id='months']")
private WebElement month;
@FindBy(xpath="//select[@id='years']")
private WebElement year;
@FindBy(xpath="//div[@class='submit clearfix']")
private WebElement submit;

public void selectTitle()
{
	Title.click();
}
public void EnterFirstName(String Fname)
{
	FirstName.sendKeys(Fname);
}
public void EnterLastName(String Lname)
{
	LastName.sendKeys(Lname);
}
public void EnterEmail(String Mail)
{
	email.sendKeys(Mail);
}
public void EnterPass(String Pass)
{
	password.sendKeys(Pass);
}
/*public void selectDay(String Day)
{   s=new Select(day);
	s.selectByValue(Day);;
}
public void selectMonth(String Month)
{
 s=new Select(month);
 s.selectByValue(Month);
}
public void selectYear(String Year)
{   s=new Select(year);
	s.selectByValue(Year);
}*/
public void clickOnSubmitBtn()
{
	submit.click();
}
public AccountCreation(WebDriver rdriver)
{
	driver=rdriver;
	PageFactory.initElements(driver, this);
}
}
