package com.qa.testng.SuiteConfig;

import org.testng.annotations.Test;

public class IngoreTest {

    @Test
    public void ingoreTest1(){
        System.out.println("ingore test 1 执行");
    }

    @Test(enabled = false)
    public void ingoreTest2(){
        System.out.println("ingore test 2 执行");
    }

    @Test(enabled = false)
    public void ingoreTest3(){
        System.out.println("ingore test 3 执行");
    }
}
