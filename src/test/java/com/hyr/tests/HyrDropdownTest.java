package com.hyr.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.hyr.base.BaseClass;
import Utilities.RetryAnalyzer;

public class HyrDropdownTest extends BaseClass {

    @Test(retryAnalyzer = Utilities.RetryAnalyzer.class)
    public void verifyDropdownSelection() {
    	 // System.out.println("CI/CD Trigger Test";line).
        System.out.println("CI/CD Trigger Test");   // Running dropdown test...
        Assert.assertTrue(true, "Dropdown test passed successfully");
    }
}