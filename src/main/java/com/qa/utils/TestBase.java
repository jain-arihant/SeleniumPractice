package com.qa.utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;

    public TestBase(){
        try{
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src/main/java/com/qa/config/config.properties");
            prop.load(fis);
        }
        catch (IOException e){
            e.getMessage();
        }
    }
    public static void initialization(){
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","/Users/arihant/Downloads/chromedriver_mac_arm64/chromedriver");
            driver = new ChromeDriver();
        }
        else {
            System.setProperty("webdriver.chrome.driver","/Users/arihant/Downloads/chromedriver_mac_arm64/chromedriver");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
//        driver.manage().window().setSize(new Dimension(1024,920)); // sets the dimention of the browser with width and height
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));

    }
}
