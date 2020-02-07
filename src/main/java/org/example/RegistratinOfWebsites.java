package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RegistratinOfWebsites {

    static protected WebDriver driver;

    @Test

    public void RegisterSuccessfully() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/BrowserDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.asda.com/");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        driver.findElement(By.linkText("Groceries")).click();
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abcd@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/div[2]/div/input")).sendKeys("xyz12345");
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/div[4]/div/input")).sendKeys("hb87bl");
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/label[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/label[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/button")).click();

    }


    @Test
    public void RegisterSuccessfullyacado(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/BrowserDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ocado.com/");
         WebDriverWait wait = new WebDriverWait(driver, 50);
        driver.findElement(By.xpath("//*[@id=\"quickReg\"]")).click();
        driver.findElement(By.xpath("//*[@name=\"title\"]")).sendKeys("Mr");
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Michal");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Smith");
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("Smithsmith@mr.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
        driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("Rm104bl");
        driver.findElement(By.xpath("//*[@id=\"registration-submit-button\"]")).click();

    }




@Test
    public void RegisterSuccessfullyEbay() {
    System.setProperty("webdriver.chrome.driver", "src/test/java/BrowserDrivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().fullscreen();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.ebay.co.uk/");
    WebDriverWait wait = new WebDriverWait(driver, 50);
    driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"body\"]")).click();
}
@Test
public void RegisterSuccessfullyMockPlus() {

    System.setProperty("webdriver.chrome.driver", "src/test/java/BrowserDrivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().fullscreen();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.mockplus.com/");
    WebDriverWait wait = new WebDriverWait(driver, 50);
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hemali@om.com");
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("xyz45678");
    driver.findElement(By.xpath("//*[@id=\"cofPassword\"]")).sendKeys("xyz45678");
    driver.findElement(By.xpath("//*[@id=\"agree\"]/span[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"register\"]")).click();

}


}





























