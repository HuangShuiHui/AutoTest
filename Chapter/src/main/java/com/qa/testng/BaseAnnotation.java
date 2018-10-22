package com.qa.testng;

import org.testng.annotations.*;

public class BaseAnnotation {

    @Test
    public void testcase1() {
        System.out.println("这是测试1");
    }
    @Test
    public void testcase8() {
        System.out.println("这是测试8");
    }

    @BeforeMethod
    public void testcase2() {
        System.out.println("方法前运行");
    }

    @AfterMethod
    public void testcase3() {
        System.out.println("方法后运行");
    }

    @BeforeClass
    public void testcase4() {
        System.out.println("类前运行");
    }

    @AfterClass
    public void testcase5() {
        System.out.println("类后运行");
    }

    @BeforeSuite
    public void testcase6(){
        System.out.println("用例集前运行");
    }

    @AfterSuite
    public void testcase7(){
        System.out.println("用例集后运行");
    }
}
