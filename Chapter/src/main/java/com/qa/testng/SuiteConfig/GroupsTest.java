package com.qa.testng.SuiteConfig;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {

    @Test(groups = "server")
    public void test1(){
        System.out.println("测试服务组11111111111");
    }

    @Test(groups = "client")
    public void test2(){
        System.out.println("测试客户组22222222222");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("before Groups On Server");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("after Groups On Server");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("before Groups On Client");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("after Groups On Client");
    }
}
