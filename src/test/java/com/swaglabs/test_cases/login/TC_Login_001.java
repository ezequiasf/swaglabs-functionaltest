package com.swaglabs.test_cases.login;

import static org.testng.Assert.*;

import com.swaglabs.setup.ConfigEnviroment;

import org.testng.annotations.Test;

public class TC_Login_001 extends ConfigEnviroment {
   
    @Test
    void loginSuccessfull ()
    {
        bf.login("standard_user", "secret_sauce", "https://www.saucedemo.com/");
        assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
    }
   
}
