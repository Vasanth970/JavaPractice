package com.javaLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class LaunchBrowser {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement signIn = driver.findElement(By.xpath("//button[@id='submit']"));
        username.sendKeys("student");
        password.sendKeys("Password123");
        signIn.click();
        WebElement print = driver.findElement(By.xpath("//*[@class='post-title']"));
        String landing =    print.getText();
        System.out.println(landing);
        Thread.sleep(50000);
        driver.quit();
    }

}
