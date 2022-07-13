package com.hrms.lib;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class General extends Global {

    public void openapplication() {
        System.setProperty("webdriver.edge.driver", "//Users//sri//code//laharika//drivers//msedgedriver");
        driver = new EdgeDriver();
        driver.navigate().to(url);
    }


    public void login() throws Exception {
        driver.findElement(By.name(txt_loginname)).sendKeys(un);
        driver.findElement(By.name(txt_password)).sendKeys(pw);
        /*robot actions
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);*/

        /*(Javascrpit Executor for click)
        WebElement element =driver.findElement(By.name(btn_login));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);*/
        driver.findElement(By.name(btn_login)).click();
        Thread.sleep(3000);
        driver.getTitle();
        Reporter.log("login done");

    }

 //   @BeforeMethod
    public void addemp() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(btn_PIM));
        Actions a = new Actions(driver);
        a.moveToElement(element).build().perform();
        System.out.println("clicked on PIM");
        Reporter.log("clicked on PIM");
        Thread.sleep(3000);
    }

   // @AfterMethod
    public void welcome() throws InterruptedException {
        driver.findElement(By.xpath(btn_welcome)).click();
        Thread.sleep(5000);
        System.out.println("clicked on welcome btn");
        Reporter.log("clicked on welcome btn");
    }

   // @AfterClass
    public void logout() throws InterruptedException, IOException {
        driver.findElement(By.xpath(btn_logout)).click();
        Thread.sleep(8000);
        System.out.println("clicked on logout");
        Reporter.log("clicked on logout");

    }

   // @BeforeClass
    public void ss() throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("/Users/sri/Desktop.jpg"));
    }

    //@AfterSuite
    public void closebrowser() {
        driver.close();
        Reporter.log("close browser");
    }
}
