package com.qa.pages;

import com.qa.utils.TestBase;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
//Elements:

    //initialisation of the page objects
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    //        Actions
}
