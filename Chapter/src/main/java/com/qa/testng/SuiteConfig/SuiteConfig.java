package com.qa.testng.SuiteConfig;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行啦！");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite运行啦！");
    }


}
