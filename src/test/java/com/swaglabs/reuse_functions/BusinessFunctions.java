package com.swaglabs.reuse_functions;

import java.util.concurrent.TimeUnit;

import com.swaglabs.page_actions.Login_Action;
import com.swaglabs.page_actions.Product_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusinessFunctions {

    private WebDriver driver;
    private Product_Action pa;

    public BusinessFunctions(WebDriver driver) {
        this.driver = driver;
        pa = new Product_Action(driver);
    }

    public void login(String username, String password, String url) {
        Login_Action logAct = new Login_Action(driver);
        driver.get(url);
        logAct.writeUser(username).writePass(password).clickBtn();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public String getMessageElement (By locator)
    {
        return driver.findElement(locator).getText();
    }

    public void logout ()
    {
        pa.clickBtnOption();
        pa.clickBtnLogout();
    }

    public void clickMatch (By locator)
    {
        driver.findElements(locator).stream().forEach(btn -> btn.click());
    }

}
