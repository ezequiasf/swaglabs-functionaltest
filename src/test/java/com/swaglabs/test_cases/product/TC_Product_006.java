package com.swaglabs.test_cases.product;

import com.swaglabs.page_actions.Product_Action;
import com.swaglabs.setup.ConfigEnviroment;

import org.openqa.selenium.By;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class TC_Product_006 extends ConfigEnviroment {


    @Test
    void login ()
    {
        bf.login("standard_user", "secret_sauce", "https://www.saucedemo.com/");
    }

    @Test
    void verifyingRemoveButtons ()
    {
        Product_Action pa = new Product_Action(driver);
        pa.clickAllBtns();
        driver.findElements(By.cssSelector(".btn_secondary")).stream()
            .forEach(btnRemove -> {
                btnRemove.click();
            });
               
        String length = driver.findElement(By.cssSelector(".shopping_cart_link"))
            .getAttribute("childElementCount");
        assertTrue(length.equals("0"));
    }
    
}
