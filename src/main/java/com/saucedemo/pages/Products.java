package com.saucedemo.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.customlisteners.CustomListeners;
import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Products extends Utility {
    public Products(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement productsText;


    public String verifyText() {
        CustomListeners.test.log(Status.PASS, "verify text products");
        return getTextFromElement(productsText);

    }

    public int verifyProductList() {
        CustomListeners.test.log(Status.PASS, "productsList");
        List<WebElement> number = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        return number.size();
    }

//    public int getSize(By by){
//        List<WebElement> number = driver.findElements(by);
//        return number.size();
//    }

   // public List<WebElement> webElementList(By by){
     //   return driver.findElements(by);
    }


