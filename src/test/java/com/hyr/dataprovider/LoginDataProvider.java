package com.hyr.dataprovider;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
            {"admin", "admin123"},
            {"user1", "pass123"},
            {"test", "test123"}
        };
    }
}