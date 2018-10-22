package com.qa.testsuits;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SourceType;

import java.util.concurrent.TimeUnit;

public class Login {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver webdriver = new ChromeDriver();

        webdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webdriver.manage().window().maximize();

        webdriver.get("http://localhost/wordpress/");

        //c查找登录链接
        WebElement login_link = webdriver.findElement(By.xpath(".//*[@id='meta-2']/ul/li[1]/a"));

        //因为登录链接在页面底部，刚打开页面只展示一个banner图片，需要把页面拉到底部才能看到链接
        //利用js下拉滚动条
        //创建一个js执行器
        JavascriptExecutor je = (JavascriptExecutor)webdriver;

        je.executeScript("arguments[0].scrollIntoView(true);", login_link);

        login_link.click();

        Thread.sleep(1000);

        //定位用户名输入框
        webdriver.findElement(By.id("user_login")).sendKeys("erwin");
        //定位密码输入框
        webdriver.findElement(By.id("user_pass")).sendKeys("1q2w3e4r5t");
        //点击登录
        WebElement loginBtn = webdriver.findElement(By.xpath(".//*[@id='wp-submit']"));
        loginBtn.click();

        webdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //测试断言部分
        WebElement nickName = webdriver.findElement(By.xpath(".//*[@id='wp-admin-bar-my-account']/a/span"));

        if (nickName.isDisplayed()){
            System.out.println("用户登录成功");
        }
        else {
            System.out.println("用户登录失败");
        }

        webdriver.quit();

    }
}
