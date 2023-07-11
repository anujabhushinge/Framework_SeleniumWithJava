package com.Store.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.*;
import com.Store.Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;
public static Logger logger;
ReadConfig Config=new ReadConfig();
String browser=Config.getbrowser();
String baseUrl= Config.getbaseUrl();

@BeforeTest
public void setup()
{
	switch(browser.toLowerCase())
	{
	case "chrome":
          WebDriverManager.chromiumdriver().setup();
          ChromeOptions option=new ChromeOptions();
          option.addArguments("--remote-allow-origins=*");
          driver=new ChromeDriver(option);
          break;
    case "firefox":
	      WebDriverManager.firefoxdriver().setup();
	      driver=new FirefoxDriver();
	      break;
    case "edge":
          WebDriverManager.edgedriver().setup();
	      driver=new EdgeDriver();
	      break; 
   default:
		  driver=null;
		  break;
    }
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 logger = LogManager.getLogger("MyStore");
	 driver.get(baseUrl);
	 logger.info("Url Opened");
	}
@AfterTest
public void tearDown()
{
	driver.close();
	driver.quit();
}


public void CaptureScreenshot(WebDriver driver, String Name) throws IOException
{
	File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File(System.getProperty("user.dir")+"//Screenshots//"+Name+".png");
	FileHandler.copy(Source, dest);		
}



}
