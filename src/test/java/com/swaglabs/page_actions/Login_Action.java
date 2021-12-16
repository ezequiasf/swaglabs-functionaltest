package com.swaglabs.page_actions;

import com.swaglabs.page_objects.Login;

import org.openqa.selenium.WebDriver;

public class Login_Action {
    
    private WebDriver driver;
    
    public Login_Action (WebDriver driver)
    {
        this.driver = driver;
    }

    public Login_Action writeUser (String username)
    {   
        driver.findElement(Login.txtUser).sendKeys(username);
        return this;
    }

    public Login_Action writePass (String password)
    {
        driver.findElement(Login.txtPass).sendKeys(password);
        return this;
    }

    public Login_Action clickBtn ()
    {
        driver.findElement(Login.btnLogin).click();
        return this;
    }
}
