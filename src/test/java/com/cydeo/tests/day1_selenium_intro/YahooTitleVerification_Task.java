package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTitleVerification_Task {

    public static void main(String[] args) {

        // setup browser manager
        WebDriverManager.chromedriver().setup();

        // 1. open chrome browser
        WebDriver driver = new ChromeDriver();

        //maximize the page
        driver.manage().window().maximize();

        // 2. go to yahoo.com
        driver.get("https://www.yahoo.com");


        //Expected: currentTitle = Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        // 3. verify current page title
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        if (currentTitle.equals(expectedTitle)) {
            System.out.println("Title is expected. Verification PASSED!");
        } else {
            System.out.println("Title is not expected. Verification FAILED!");
        }

        //this will close all of opened window
        driver.quit();

    }
}
