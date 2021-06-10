package com.selenium.Ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EbayHomepage {

    WebDriver driver;

    public EbayHomepage(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/imaso/Documents/Techbee Training/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void home(){
        driver.get("https://www.ebay.com/");
    }

    public void saved(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[2]/a")).click();
    }

    public void motors(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")).click();
    }

    public void motorsExpand(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
        action.moveToElement(element).perform();



    }

    public void fashion(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")).click();
    }

    public void fashionExpand(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
        action.moveToElement(element).perform();
    }

    public void electronics(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a")).click();
    }

    public void electronicsExpand(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));
        action.moveToElement(element).perform();
    }

    public void collectiblesAndArt(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")).click();
    }

    public void collectiblesAndArtExpand(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"));
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"));
        action.moveToElement(element).perform();
    }

    public void homeAndGarden(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a")).click();
    }

    public void homeAndGardenExpand(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a"));
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a"));
        action.moveToElement(element).perform();
    }

    public void sportingGoods(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a")).click();
    }

    public void sportingGoodsExpand(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a"));
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a"));
        action.moveToElement(element).perform();
    }

    public void toys(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a")).click();
    }

    public void toysExpand(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a"));
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a"));
        action.moveToElement(element).perform();
    }

    public void businessAndIndustrial(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/a")).click();
    }

    public void businessAndIndustrialExpand(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/a"));
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/a"));
        action.moveToElement(element).perform();
    }

    public void music(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[11]/a")).click();
    }

    public void musicExpand(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[11]/a"));
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[11]/a"));
        action.moveToElement(element).perform();
    }

    public void deals(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[12]/a")).click();
    }

    public void dealsExpand(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[12]/a"));
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[12]/a"));
        action.moveToElement(element).perform();
    }

    public void todaysDeals(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"items_list1\"]/div[1]/div/div[2]/a")).click();

    }

    public void search(String searchText){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.id("gh-ac")).sendKeys(searchText);
        driver.findElement(By.id("gh-btn")).click();
    }

    public void searchByCategory(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gh-cat\"]")).click();

    }

    public void signIn(String username, String password){
        //driver.get("https://www.ebay.com/");
        driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
        driver.findElement(By.id("userid")).sendKeys(username);
        driver.findElement(By.id("signin-continue-btn")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("sgnBt")).click();
    }

    public void advancedSearch(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gh-as-a\"]")).click();
    }
}
