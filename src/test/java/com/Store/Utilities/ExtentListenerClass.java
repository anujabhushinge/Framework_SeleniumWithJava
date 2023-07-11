 package com.Store.Utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListenerClass implements ITestListener {
ExtentSparkReporter htmlReporter;
ExtentReports report;
ExtentTest test;

public void ConfigureReport()
 { 
	String timeStamp=new SimpleDateFormat("yyyy.mm.dd,hh.mm.ss").format(new Date());
	String reportName="My Store Test Report"+timeStamp+".html";
	htmlReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//"+reportName);
	report=new ExtentReports();
	report.attachReporter(htmlReporter);
	
	report.setSystemInfo("Machine","TestPC1");
	report.setSystemInfo("OS","Windows10" );
	report.setSystemInfo("Env","SIT" );
	report.setSystemInfo("userName","Anuja" );
	
	htmlReporter.config().setDocumentTitle("ExtentListener Report Demo");
	htmlReporter.config().setReportName("This is my First Report");
	htmlReporter.config().setTheme(Theme.DARK);
	
	
}

@Override
public void onTestStart(ITestResult result) {
	System.out.println("Name of the test method sta rted"+result.getName());
}

@Override
public void onTestSuccess(ITestResult result) {
	System.out.println("Name of Succesful Test case is:"+result.getName());
	test=report.createTest(result.getName());
	test.log(Status.PASS,MarkupHelper.createLabel("Name of succesful Test case is:"+result.getName(),ExtentColor.GREEN));
}

@Override
public void onTestFailure(ITestResult result) {
System.out.println("Name of failed test:"+result.getName());
test=report.createTest(result.getName());
test.log(Status.FAIL,MarkupHelper.createLabel("Name of failed test case is:"+result.getName(),ExtentColor.RED));

String ScrrenshotPath=System.getProperty("user.dir")+"//Screenshots//"+result.getName()+".png";
File ScreenshotFile=new File(ScrrenshotPath);
if(ScreenshotFile.exists())
{
	test.fail("captured screenshot is :"+test.addScreenCaptureFromPath(ScrrenshotPath));
}}

@Override 
public void onTestSkipped(ITestResult result) {
	System.out.println("Name of skipped test case is:"+result.getName());
	test=report.createTest(result.getName());
	test.log(Status.SKIP,MarkupHelper.createLabel("Name of Skipped test case is:"+result.getName(),ExtentColor.YELLOW));
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
}

@Override
public void onTestFailedWithTimeout(ITestResult result) {
	
}

@Override
public void onStart(ITestContext context) {
	ConfigureReport();
	System.out.println("On start method invoked......");
}

@Override
public void onFinish(ITestContext context) {
	System.out.println("On finish method invoked.......");
	report.flush();
}
}