package com.swaglabs.test_cases.product;

import com.swaglabs.page_actions.Product_Action;
import com.swaglabs.setup.ConfigEnviroment;

import org.openqa.selenium.By;
import static org.testng.Assert.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Product_005 extends ConfigEnviroment{

    Product_Action pa;

    @BeforeMethod
    void instatiatePa ()
    {
        pa = new Product_Action(driver);
    }
    
    @Test (priority = 1)
    void login ()
    {
        bf.login("standard_user", "secret_sauce","https://www.saucedemo.com/");
    }

    @Test (priority = 2)
    void verifyingButtons ()
    {
        pa.clickAllBtns();
        String nProducts = bf.getMessageElement(By.cssSelector(".shopping_cart_badge"));
        assertEquals(nProducts, "6");
    }

    @Test (priority = 3)
    void verifyingPageCart ()
    {
        pa.clickBtnCart();
        int nItens = driver.findElements(By.cssSelector(".cart_item")).size();
        System.out.println(nItens);
        assertTrue (nItens == 6);
    }
    
}
