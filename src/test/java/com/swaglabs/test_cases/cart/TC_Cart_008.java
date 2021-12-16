package com.swaglabs.test_cases.cart;

import com.swaglabs.page_actions.Product_Action;
import com.swaglabs.setup.ConfigEnviroment;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Cart_008 extends ConfigEnviroment{

    @Test (priority = 1)
    void login ()
    {
        bf.login("standard_user", "secret_sauce", "https://www.saucedemo.com/");
    }

    @Test (priority = 2)
    void clickButtons ()
    {
        Product_Action pa = new Product_Action(driver);
        pa.clickAllBtns();
        verifyTextCart("6");
        pa.clickBtnCart();
    }
    
    @Test (priority = 3)
    void removeAndVerify ()
    {
        driver.findElement(By.cssSelector(".cart_button")).click();
        verifyTextCart("5");
    }

    private void verifyTextCart (String expected)
    {
        String text = bf.getMessageElement(By.cssSelector(".shopping_cart_badge"));
        assertEquals(text, expected);
    }
}
