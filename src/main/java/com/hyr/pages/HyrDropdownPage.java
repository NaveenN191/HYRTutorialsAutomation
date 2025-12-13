package com.hyr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HyrDropdownPage {

    WebDriver driver;

    public HyrDropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    By courseDropdown = By.id("course");
    By ideDropdown = By.id("ide");

    public void selectCourse() {
        Select course = new Select(driver.findElement(courseDropdown));
        course.selectByIndex(1);
        course.selectByValue("net");
        course.selectByVisibleText("Python");
    }

    public void selectIDE() {
        Select ide = new Select(driver.findElement(ideDropdown));
        ide.selectByValue("ij");
        ide.selectByValue("vs");
        ide.selectByVisibleText("NetBeans");
    }
}