package com.hyr.tests;

import org.testng.annotations.Test;
import com.hyr.base.BaseClass;
import com.hyr.pages.HyrDropdownPage;
import com.hyr.dataprovider.LoginDataProvider;

public class HyrDropdownTest extends BaseClass {

    @Test(
        dataProvider = "loginData",
        dataProviderClass = LoginDataProvider.class
    )
    public void loginTest(String username, String password) {

        System.out.println("Thread ID : " + Thread.currentThread().getId());
        System.out.println(username + " | " + password);

        // test steps here
    }
}