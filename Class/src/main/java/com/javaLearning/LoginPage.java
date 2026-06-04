package com.javaLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    // Locators
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton   = By.id("submit");
    private By logoutButton  = By.xpath("//a[text()='Log out']");
    private By landingTitle  = By.xpath("//*[@class='post-title']");
    private By logoutMessage = By.xpath("//div[@class='post-content']//p");

    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver); // calls BasePage constructor
    }

    // Actions
    public void login(String username, String password) {
        typeText(usernameField, username);
        typeText(passwordField, password);
        click(loginButton);
    }

    public void logout() {
        click(logoutButton);
    }

    // Utility methods
    public String getLandingText() {
        return getText(landingTitle);
    }

    public String getLogoutMessage() {
        return getText(logoutMessage);
    }
}
