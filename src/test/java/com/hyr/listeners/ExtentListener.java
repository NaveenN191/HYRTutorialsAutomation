package com.hyr.listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.hyr.base.BaseClass;
import com.hyr.reports.ExtentManager;

import Utilities.ScreenshotUtil;

public class ExtentListener implements ITestListener {

    private static ExtentReports extent = ExtentManager.getExtentReports();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test Passed");
    }

    @Override
    
    	public void onTestFailure(ITestResult result) {
    	    ExtentTest test = ExtentManager.getExtentReports().createTest(result.getMethod().getMethodName());
    	    test.fail(result.getThrowable());

    	    // Capture screenshot
    	    WebDriver driver = BaseClass.getDriver(); // if you have static driver in BaseClass
    	    String screenshotPath = ScreenshotUtil.captureScreenshot(driver, result.getMethod().getMethodName());
    	    test.addScreenCaptureFromPath(screenshotPath);
    	}
    

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();   // 🔥 very important
    }
}