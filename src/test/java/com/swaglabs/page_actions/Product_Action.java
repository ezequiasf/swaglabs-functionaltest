package com.swaglabs.page_actions;

import java.util.List;

import com.swaglabs.page_objects.Product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Product_Action extends Common_Action {
    
    private WebDriver driver;
    public List<WebElement> buttonsAdd;
    
    public Product_Action (WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        buttonsAdd = driver.findElements(Product.btnAddCart);
    }

    public Product_Action selectFilterOption (int index)
    {
        Select filter = new Select(driver.findElement(Product.selectFilter));
        filter.selectByIndex(index);
        return this;
    }

    public Product_Action clickAllBtns ()
    {
        buttonsAdd.stream().forEach( e -> {
            e.click();
        });
        return this;
    }

}
