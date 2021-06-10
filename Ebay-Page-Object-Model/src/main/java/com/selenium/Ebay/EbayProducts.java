package com.selenium.Ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayProducts extends EbayBase {
    WebDriver driver;

    public EbayProducts(String url){
        System.setProperty("webdriver.chrome.driver", "C:/Users/imaso/Documents/Techbee Training/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    public void buyItNow(){
        driver.findElement(By.xpath("//*[@id=\"binBtn_btn\"]")).click();
    }

    public void addToCart(){
        driver.findElement(By.xpath("//*[@id=\"isCartBtn_btn\"]")).click();
    }

    public void addToWatchlist(){
        driver.findElement(By.xpath("//*[@id=\"vi-atl-lnk\"]")).click();
    }

    public void price(){
        String price = driver.findElement(By.xpath("//*[@id=\"prcIsum\"]")).getText();
        System.out.println(price);
    }

    public void description() {
        String description = driver.findElement(By.xpath("//*[@id=\"ds_div\"]/font/p[4]")).getText();
        System.out.println(description);

        WebElement element = driver.findElement(By.xpath("//*[@id=\"viTabs_0\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(element);
        action.perform();

    }

}
