package com.selenium.Ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayAdvancedSearch {

    WebDriver driver;

    public EbayAdvancedSearch(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/imaso/Documents/Techbee Training/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/sch/ebayadvsearch");
    }

    public void itemsAndStores(String choice){
        if (choice.equals("Find Items")){
            driver.findElement(By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[1]/a")).click();
        } else if(choice.equals("On eBay Motors") || choice.equals("on ebay motors")){
            driver.findElement(By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[2]/a")).click();
        } else if (choice.equals("By seller") || choice.equals("by seller")){
            driver.findElement(By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[3]/a")).click();
        } else if (choice.equals("By item number") || choice.equals("by item number")){
            driver.findElement(By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[4]/a")).click();
        } else if (choice.equals("Items in stores") || choice.equals("by items in stores")){
            driver.findElement(By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[5]/a")).click();
        } else if (choice.equals("Find in stores") || choice.equals("find in stores")){
            driver.findElement(By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[6]/a")).click();
        } else {
            System.out.println("ERROR");
        }
    }

    public void findByKeyword(String keyword){
        driver.findElement(By.xpath("//*[@id=\"_nkw\"]")).sendKeys(keyword);
    }

    public void searchIncluding(int choice){
        if (choice == 0){
            driver.findElement(By.xpath("//*[@id=\"LH_TitleDesc\"]")).click();
        } else if (choice == 1){
            driver.findElement(By.xpath("//*[@id=\"LH_Complete\"]")).click();
        } else if (choice == 2){
            driver.findElement(By.xpath("//*[@id=\"LH_Sold\"]")).click();
        } else {
            System.out.println("Error, enter a number between 0-2");
        }
    }

    public void price(String lowerbound, String upperbound){
        driver.findElement(By.xpath("//*[@id=\"adv_search_from\"]/fieldset[3]/input[2]")).sendKeys(lowerbound);
        driver.findElement(By.xpath("//*[@id=\"adv_search_from\"]/fieldset[3]/input[3]")).sendKeys(upperbound);
    }

    public void buyingFormats(int choice){
        if (choice == 0){
            driver.findElement(By.xpath("//*[@id=\"LH_Auction\"]")).click();
        } else if (choice == 1){
            driver.findElement(By.xpath("//*[@id=\"LH_BIN\"]")).click();
        } else if (choice == 2){
            driver.findElement(By.xpath("//*[@id=\"LH_CAds\"]")).click();
        } else {
            System.out.println("Error, enter a number between 0-2");
        }
    }

    public void condition(int choice){
        if (choice == 0){
            driver.findElement(By.xpath("//*[@id=\"LH_ItemConditionNew\"]")).click();
        } else if (choice == 1){
            driver.findElement(By.xpath("//*[@id=\"LH_ItemConditionUsed\"]")).click();
        } else if (choice == 2){
            driver.findElement(By.xpath("//*[@id=\"LH_ItemConditionNS\"]")).click();
        } else {
            System.out.println("Error, enter a number between 0-2");
        }
    }

    public void showResults(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"adv_search_from\"]/fieldset[7]/legend"));
        Actions action = new Actions(driver);
        action.moveToElement(element);
        action.perform();
    }

    public void shippingOptions(int choice){
        if (choice == 0){
            driver.findElement(By.xpath("//*[@id=\"LH_FS\"]")).click();
        } else if (choice == 1){
            driver.findElement(By.xpath("//*[@id=\"LH_LPickup\"]")).click();
        } else {
            System.out.println("Error, enter a number between 0 and 1.");
        }
    }

    public void location(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"adv_search_from\"]/fieldset[7]/legend"));
        Actions action = new Actions(driver);
        action.moveToElement(element);
        action.perform();
    }

    public void sellers(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"byseller\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(element);
        action.perform();
    }

    public void sort(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"adv_search_from\"]/div[2]/label[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(element);
        action.perform();
    }
}
