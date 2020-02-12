package org.example;

//import com.google.common.annotations.VisibleForTesting;
import org.junit.After;
//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Text;

public class  RegistrationAutomation {
    static protected WebDriver driver;

    //creating parameterised method for Clicking on element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //creating method for Enter Text/sendkey
    public void sendkey(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //creating method for selectFromDropDownByValue
    public void selectFromDropDownByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    //creating method for selectFromDropDownByVisible text
    public void selectFromDropDownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //creating method for selectFromDropDownByIndex
    public void SelectFromDropDownByIndex(By by, int index){
        Select select = new Select(driver.findElement(by));}

    //Get Text From Element
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    } public String timestamp() {
        DateFormat dateFormat = new SimpleDateFormat("ddmmyy");
        Date date = new Date();
        return (dateFormat.format(date));
    }
    @Before
         public void openbrowser () {
             System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
             driver = new ChromeDriver();
             driver.manage().window().fullscreen();
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         }

         @After
         public void closeBrowsers () {
             driver.quit();
         }


         @Test

         public void RegisterSuccessfullyAsda () {
             System.setProperty("webdriver.chrome.driver", "src/test/java/BrowserDrivers/chromedriver.exe");
             driver = new ChromeDriver();
             driver.manage().window().fullscreen();
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
             //TYPE URL
             driver.get("https://www.asda.com/");
             WebDriverWait wait = new WebDriverWait(driver, 50);
            // CLICK ON REGISTER
            // clickOnElement(By.linkText("Grocerie"));
             clickOnElement(By.linkText("Register"));

             //ENTER EMAIL
             sendkey(By.xpath("//input[@type='email']"),"abcd@gmail.com");
             clickOnElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/div[2]/div/input"));

             //ENTER POSTCODE
             clickOnElement(By.xpath("\"//*[@id=\\\"app\\\"]/main/div/div/div/div/form/div[4]/div/input"));
             clickOnElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/label[1]/span"));
             clickOnElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/label[2]/span"));

         }



         @Test
         public void RegisterSuccessfullyacado () {
             System.setProperty("webdriver.chrome.driver", "src/test/java/BrowserDrivers/chromedriver.exe");
             driver = new ChromeDriver();
             driver.manage().window().fullscreen();
             driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
             //ENTER URL
             driver.get("https://www.ocado.com/");
             WebDriverWait wait = new WebDriverWait(driver, 50);
            //CLICK ON REGISTER BUTTON

             clickOnElement(By.xpath("//*[@id=\"quickReg\"]"));

             sendkey(By.xpath("//*[@name=\"title\"]"), "Mrs");
               wait = new WebDriverWait(driver, 40);
            //enter first name
             sendkey(By.name("Michal"),"Michal");

             //ENTER LAST NAME
             sendkey(By.xpath("//*[@id=\"lastName\"]"), "Smith");

             //ENTER EMAIL
             sendkey(By.xpath("//*[@id=\"login\"]"), "Smithsmith@mr.com");

           //  ENTER PASSWORD
             sendkey(By.xpath("//*[@id=\"password\"]"), "12345678");

             //ENTER POSTCODE
             sendkey(By.xpath("//*[@id=\"postcode\"]"), "Rm104bl");

             //CLICK ON REGISTER BUTTON

             clickOnElement(By.xpath("//*[@id=\"registration-submit-button\"]"));
             }

         @Test
         public void RegisterSuccessfullyEbay () {
             System.setProperty("webdriver.chrome.driver", "src/test/java/BrowserDrivers/chromedriver.exe");
             driver = new ChromeDriver();
             driver.manage().window().fullscreen();
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           //  TYPE URL
             driver.get("https://www.ebay.co.uk/");
             WebDriverWait wait = new WebDriverWait(driver, 50);

             clickOnElement(By.xpath("\"//*[@id=\\\"gh-ug-flex\\\"]/a\""));

             clickOnElement(By.xpath("\"//*[@id=\\\"body\\\"]\""));
         }

         @Test
         public void RegisterSuccessfullyMockPlus () {

             System.setProperty("webdriver.chrome.driver", "src/test/java/BrowserDrivers/chromedriver.exe");
             driver = new ChromeDriver();
             driver.manage().window().fullscreen();
             driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
             //TYPE URL
             driver.get("https://www.mockplus.com/");
             WebDriverWait wait = new WebDriverWait(driver, 50);
             //CLICK ON REGISTER BUTTON
             clickOnElement(By.linkText("\"Register\""));

             //ENTER EMAIL
             sendkey(By.xpath("//*[@id=\"email\"]"),"hemali@om.com");

             //ENTER PASSWORD
             sendkey(By.xpath("//*[@id=\"password\"]"),"xyz45678");

            // ENTER CONFIRM PASSWORD

             sendkey(By.xpath("//*[@id=\"cofPassword\"]"),"xyz45678");
             clickOnElement(By.xpath("//*[@id=\"agree\"]/span[1]"));

             //CLICK ON REGISTER BUTTON
            clickOnElement(By.xpath("//*[@id=\"register\"]"));
         }

         @Test
         public void RegisterSuccessfullyDominos () {

             System.setProperty("webdriver.chrome.driver", "src/test/java/BrowserDrivers/chromedriver.exe");
             driver = new ChromeDriver();
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
             driver.get("https://www.dominos.co.uk/");
             WebDriverWait wait = new WebDriverWait(driver, 50);
            // driver.findElement(By.linkText("Register")).click();
             clickOnElement(By.linkText("Register"));
             driver.findElement(By.xpath("//*[@id=\"registerPanel\"]/div/form/div[1]/div[1]/input")).sendKeys("Manoj");
             wait = new WebDriverWait(driver, 50);
           WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("Manoj")));
           //ENTER NAME
             clickOnElement(By.name("Manoj"));

             sendkey(By.xpath("//*[@id=\"registerPanel\"]/div/form/div[2]/div[1]/div/input"),"Manoj123");

             sendkey(By.xpath("//*[@id=\"registerPanel\"]/div/form/div[1]/div[2]/input"),"1234567890");
             //ENTER EMAIL

             sendkey(By.xpath("Email"),"xyz45678@.com");
            // ENTER POSTCODE

             sendkey(By.xpath("//*[@id=\"register_postcodeLookup\"]"),"HB5 3AB");
             //CLICK ON REGISTER BUTTON
           
              clickOnElement(By.xpath("\"//*[@id=\\\"registerPanel\\\"]/div/form/div[3]/button"));

         }


}





























