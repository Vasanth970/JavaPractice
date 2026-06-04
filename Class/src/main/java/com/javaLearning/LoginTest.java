package com.javaLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);

        // Open login page
        loginPage.openUrl("https://practicetestautomation.com/practice-test-login/");

        // Login
        loginPage.login("student", "Password123");
        System.out.println("After login: " + loginPage.getLandingText());

        // Logout
        loginPage.logout();
        System.out.println("After logout: " + loginPage.getLogoutMessage());

        // Close browser
        loginPage.quitBrowser();
    }
}
