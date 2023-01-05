package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        // 2- create instance of Selenium web driver
        // this is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        // to make the screen mode fullscreen
        driver.manage().window().maximize();

        // full screen mode for MAC, another option
        // driver.manage().window().fullscreen();

        // 3- go to ...
        driver.get("https://www.tesla.com");

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // get the current URL using Selenium
        String currentURL = driver.getCurrentUrl();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium navigate back
        driver.navigate().back();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to naviigate forward
        driver.navigate().forward();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium navigate to refresh
        driver.navigate().refresh();

        // use navigate().to():
        driver.navigate().to("https://www.google.com");

        // get the title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());

        // get the currentTitle of new page
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // get the current URL using Selenium
        currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        // this will close the currently opened window
        driver.close();

        //this will close all of opened window
        driver.quit();

    }
}
