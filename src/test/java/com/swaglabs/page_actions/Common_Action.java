package com.swaglabs.page_actions;

import com.swaglabs.page_objects.Commons;

import org.openqa.selenium.WebDriver;

public class Common_Action {

    private WebDriver driver;

    public Common_Action (WebDriver driver)
    {
        this.driver = driver;
    }
    
    public Common_Action clickBtnOption ()
    {
        driver.findElement(Commons.btnOption).click();
        return this;
    }
    
    public Common_Action clickBtnLogout ()
    {
        driver.findElement(Commons.btnLogout).click();
        return this;
    }

    public Common_Action clickBtnCart ()
    {
        driver.findElement(Commons.btnCart).click();
        return this;
    }
}
