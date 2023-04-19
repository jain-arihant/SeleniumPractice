package com.qa.pages;

import com.qa.utils.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    @FindBy(name = "username")
        WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//input[@type = 'submit']")
    WebElement loginBtn;

    //initialisation of the page objects
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    //        Actions
}
