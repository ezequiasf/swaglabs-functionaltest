package com.swaglabs.test_cases.product;

import static org.testng.Assert.assertTrue;

import com.swaglabs.setup.ConfigEnviroment;

import org.testng.annotations.Test;

public class TC_Product_004 extends ConfigEnviroment {
    
    @Test
    void loginSuccessfull ()
    {
        bf.login("standard_user", "secret_sauce", "https://www.saucedemo.com/");
    }

    @Test
    void verifyButtons ()
    {
        bf.logout();
        assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/"));
    }
}
