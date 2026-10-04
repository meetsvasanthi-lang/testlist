package mylist;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Testcase2 {

    @Test
    public void secondlist()throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );

        try {

            // Open application
            driver.get("https://leaftaps.com/opentaps/control/login");

            driver.manage().window().maximize();

            // Login
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.id("username")))
                    .sendKeys("DemoCSR");

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.id("password")))
                    .sendKeys("crmsfa");

            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//input[@type='submit']")))
                    .click();
            Thread.sleep(4000);

            // Click CRM/SFA
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//img[contains(@src,'crm.png')]")))
                    .click();

            // Click Leads
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[normalize-space()='Leads']")))
                    .click();
            Thread.sleep(2000);
            // Click Create Lead
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[normalize-space()='Vasanthi Karthik (Wipro)']")))
                    .click();
            Thread.sleep(3000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Edit']")))
            .click();
            Thread.sleep(4000);
            WebElement company = wait.until(ExpectedConditions.visibilityOfElementLocated(
            	    By.id("updateLeadForm_companyName")
            	));
            	company.clear();
            	company.sendKeys("TCS");
            Thread.sleep(2000);
            WebElement department= wait.until(ExpectedConditions.visibilityOfElementLocated(
            	    By.id("updateLeadForm_departmentName")
            	));
            	department.clear();
            	department.sendKeys("Automation");
            Thread.sleep(2000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='submitButton']")))
            .click();
            Thread.sleep(1000);
           
   
            
           
;        } finally {

            // Close browser completely
            driver.quit();
        }
    }
}