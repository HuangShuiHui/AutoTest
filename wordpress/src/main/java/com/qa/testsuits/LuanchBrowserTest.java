package com.qa.testsuits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LuanchBrowserTest {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver wb = new ChromeDriver();

        wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wb.manage().window().maximize();

        wb.get("http://localhost/wordpress/");
    }
}
