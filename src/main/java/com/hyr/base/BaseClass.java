package com.hyr.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    private static ThreadLocal<WebDriver>
    driver = new ThreadLocal<>();
    public WebDriver getDriver() {
    	return driver.get();
    }
    public void setDriver(WebDriver driverInstance) {
    	driver.set(driverInstance);
    }

    @BeforeMethod
    public void setUp() {
        WebDriver driverInstance = new ChromeDriver();
        setDriver(driverInstance);
        getDriver().manage().window().maximize();
        getDriver().get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
    }
    @AfterMethod
    public void tearDown() {
    	getDriver().quit();
    	driver.remove();
         {
            
        }
    }
}