package mylist;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testcase3 {

    @Test
    public void secondlist() throws InterruptedException{
    
    	 ChromeOptions options = new ChromeOptions();

    	        options.setExperimentalOption(
    	                "prefs",
    	                Map.of("profile.password_manager_leak_detection", false)
    	        );

    	        WebDriver driver = new ChromeDriver(options);

    	        driver.manage().window().maximize();

        

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
            Thread.sleep(3000);

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
            	WebElement leadId = wait.until(ExpectedConditions.visibilityOfElementLocated(
            		    By.name("id")
            		));
            		leadId.clear();
            		leadId.sendKeys("10778");
            	
            	Thread.sleep(3000);
            	
            	 wait.until(ExpectedConditions.elementToBeClickable(
                         By.xpath("//button[text()='Find Leads']")))
                         .click();
                 Thread.sleep(5000);
                

           System.out.println("Data Found Successfully");
            
         
           
        } finally {

            // Close browser completely
            driver.quit();
        }
    }
}
