package com.swaglabs.test_cases.login;

import static org.testng.Assert.*;

import com.swaglabs.setup.ConfigEnviroment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Login_002 extends ConfigEnviroment {
    
    @Test
    void loginFailedUser ()
    {
        bf.login("wrong_user", "secret_sauce", "https://www.saucedemo.com/");
        String msgError = bf.getMessageElement(By.cssSelector("h3[data-test='error']"));
        assertTrue(msgError.contains("Epic sadface"), "Texto não encontrado.");
    }
}
