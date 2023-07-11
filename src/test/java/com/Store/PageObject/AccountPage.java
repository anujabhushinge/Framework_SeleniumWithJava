package com.Store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	WebDriver driver;
@FindBy(xpath="//a[@title='View my customer account']")
private WebElement AccHolderName;

public String NameOfACCHolder()
{
	String name=AccHolderName.getText();
	return name;
}
public AccountPage(WebDriver rdriver)
{
	driver=rdriver;
	PageFactory.initElements(rdriver, this);
}
}

