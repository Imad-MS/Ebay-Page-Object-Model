package com.selenium.Ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EbayBase {

    WebDriver driver;

    public EbayBase(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/imaso/Documents/Techbee Training/chromedriver.exe");
        driver = new ChromeDriver();
    }



    //Sign in to an account
    public void signIn(String username, String password){

        //driver.get("https://www.ebay.com/");
        driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
        driver.findElement(By.id("userid")).sendKeys(username);
        driver.findElement(By.id("signin-continue-btn")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("sgnBt")).click();
    }

    //Register for a new account
    public void register(String firstName, String lastName, String email, String password){
//        System.setProperty("webdriver.chrome.driver", "C:/Users/imaso/Documents/Techbee Training/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
        driver.findElement(By.id("firstname")).sendKeys(firstName);
        driver.findElement(By.id("lastname")).sendKeys(lastName);
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("EMAIL_REG_FORM_SUBMIT")));
        driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
        
    }

    //Goes to the "today's deals" section
    public void dailyDeals(){
//        System.setProperty("webdriver.chrome.driver", "C:/Users/imaso/Documents/Techbee Training/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gh-p-1\"]/a")).click();

    }

    public void brandOutlet(){
//        System.setProperty("webdriver.chrome.driver", "C:/Users/imaso/Documents/Techbee Training/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gh-p-4\"]/a")).click();


    }

    public void helpAndContact(){
//        System.setProperty("webdriver.chrome.driver", "C:/Users/imaso/Documents/Techbee Training/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gh-p-3\"]/a")).click();
    }

    public void sell(){
//        System.setProperty("webdriver.chrome.driver", "C:/Users/imaso/Documents/Techbee Training/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gh-p-2\"]/a")).click();
    }

    public void wishlist(){
//        System.setProperty("webdriver.chrome.driver", "C:/Users/imaso/Documents/Techbee Training/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gh-wl-click\"]/div/a[1]")).click();


    }

    public void notifications(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gh-Alerts-i\"]")).click();
    }

    public void cart(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a[1]/svg")).click();
    }

    public void aboutEbay(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gf-l\"]/li[1]/a")).click();
    }

    public void announcements(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gf-l\"]/li[2]/a")).click();
    }

    public void community(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gf-l\"]/li[3]/a")).click();
    }

    public void securityCenter(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gf-l\"]/li[4]/a")).click();
    }

    public void resolutionCenter(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gf-l\"]/li[5]/a")).click();
    }

    public void sellerCenter(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gf-l\"]/li[5]/a")).click();
    }

    public void policies(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gf-l\"]/li[6]/a")).click();
    }

    public void affiliates(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gf-l\"]/li[8]/a")).click();
    }

    public void siteMap(){
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//*[@id=\"gf-l\"]/li[10]/a")).click();
    }

}
