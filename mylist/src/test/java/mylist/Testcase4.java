package mylist;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase4 {

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
            Thread.sleep(2000);

            // Click Leads
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[normalize-space()='Leads']")))
                    .click();
            Thread.sleep(1000);

            // Click Create Lead
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[normalize-space()='Find Leads']")))
                    .click();
            Thread.sleep(2000);
            WebElement nameTab = wait.until(ExpectedConditions.elementToBeClickable(
            	    By.xpath("//span[normalize-space()='Name and ID']")
            	));
            	nameTab.click();

            	WebElement leadid = wait.until(ExpectedConditions.visibilityOfElementLocated(
            	    By.id("ext-gen246")
            	));
            	leadid.clear();
            	leadid.sendKeys("10612");
            	Thread.sleep(3000);
            	WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(
                	    By.id("ext-gen248")
                	));
                	firstName.clear();
                	firstName.sendKeys("Vasanthi");
                	Thread.sleep(1000);
                	WebElement company = wait.until(ExpectedConditions.elementToBeClickable(
                    	    By.id("ext-gen252")
                    	));
                    	company.clear();
                    	company.sendKeys("wipro");
                    	Thread.sleep(1000);
            	
            	 wait.until(ExpectedConditions.elementToBeClickable(
                         By.xpath("//button[@id='ext-gen763']")))
                         .click();
                 Thread.sleep(4000);
                 wait.until(ExpectedConditions.elementToBeClickable(
                         By.xpath("//button[@id='ext-gen385']")));
                         
                 
                // WebElement leadList = wait.until(ExpectedConditions.visibilityOfElementLocated(
                		 //   By.xpath("//*[normalize-space()='Lead List']")));
        
                 Thread.sleep(4000);
                
                		

           
        } finally {

            // Close browser completely
            driver.quit();
        }
    }
}