package com.swaglabs.test_cases.product;

import java.util.List;

import com.swaglabs.page_actions.Product_Action;
import com.swaglabs.setup.ConfigEnviroment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Product_007 extends ConfigEnviroment{

    Product_Action la;
    
    @BeforeMethod
    void initiateLa ()
    {
        la = new Product_Action(driver);
    }
    
    @Test
    void login ()
    {
        bf.login("standard_user", "secret_sauce", "https://www.saucedemo.com/");
    }
    
    @Test(priority = 1)
    void testeAtoZ()
    {
        la.selectFilterOption(0);
        verifyFirstLastTitles(5,"Sauce Labs Backpack","Test.allTheThings() T-Shirt (Red)");
    }

    @Test(priority = 2)
    void testeZtoA ()
    {
        la.selectFilterOption(1);
        verifyFirstLastTitles(5,"Test.allTheThings() T-Shirt (Red)","Sauce Labs Backpack");
    }

    @Test (priority = 3)
    void testelowToHigh ()
    {
        la.selectFilterOption(2);
        verifyFirstLastTitles(5, "Sauce Labs Onesie", "Sauce Labs Fleece Jacket");
    }

    @Test (priority = 4)
    void highToLow ()
    {
        la.selectFilterOption(3);
        verifyFirstLastTitles(5,"Sauce Labs Fleece Jacket", "Sauce Labs Onesie");
    }

    private void verifyFirstLastTitles (int lastIndex, String fTitle, String lTitle)
    {
        List<WebElement>titles = driver.findElements(By.cssSelector(".inventory_item_name"));
        assertEquals(titles.get(0).getText(),fTitle);
        assertEquals(titles.get(lastIndex).getText(),lTitle);
    }
}
