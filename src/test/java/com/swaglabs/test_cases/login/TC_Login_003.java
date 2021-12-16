package com.swaglabs.test_cases.login;

import static org.testng.Assert.*;

import com.swaglabs.setup.ConfigEnviroment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Login_003 extends ConfigEnviroment{
    
    @Test
    void loginFailedPass ()
    {
        bf.login("standard_user","wrong_password", "https://www.saucedemo.com/");
        String msgError = bf.getMessageElement(By.cssSelector("h3[data-test='error']"));
        assertTrue(msgError.contains("Epic sadface"), "Texto não encontrado.");
    }
}
