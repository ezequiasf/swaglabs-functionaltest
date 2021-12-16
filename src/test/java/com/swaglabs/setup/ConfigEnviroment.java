package com.swaglabs.setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

import com.swaglabs.reuse_functions.BusinessFunctions;

public class ConfigEnviroment {

    public static WebDriver driver;
    public static BusinessFunctions bf;

    @BeforeClass
    public void initial_setup() 
    {
        //Config drivers
        WebDriverManager.edgedriver().setup();
        System.out.println("Download path: "+WebDriverManager.edgedriver().getDownloadedDriverPath());
        System.out.println("Version: "+WebDriverManager.edgedriver().getDownloadedDriverVersion());
        driver = new EdgeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        bf = new BusinessFunctions(driver);
    }

    @AfterClass
    public void tear_down () 
    {
      driver.quit();
    }

}
