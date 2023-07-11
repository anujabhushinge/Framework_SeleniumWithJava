package com.Store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Index_Page {
	WebDriver driver;
      @FindBy(xpath="//a[@title='Log in to your customer account']")
      private WebElement SignIn;
      
   
      public void ClickOnSign() 
      {
    	  SignIn.click();
      }
      

public Index_Page(WebDriver rdriver)
{
	driver=rdriver;
	PageFactory.initElements(rdriver,this);
}





}
