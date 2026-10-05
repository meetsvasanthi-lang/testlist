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

public class Testcase2 {

    @Test
    public void secondlist()throws InterruptedException {
    	 ChromeOptions options = new ChromeOptions();

	        options.setExperimentalOption(
	                "prefs",
	                Map.of("profile.password_manager_leak_detection", false)
	        );

        WebDriver driver = new ChromeDriver(options);

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
                    By.xpath("//a[normalize-space()='Find Leads']")))
                    .click();
            Thread.sleep(2000);
            WebElement id=wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//input[@name='id']")));
                   id.click();
                   id.sendKeys("10778");
                   wait.until(ExpectedConditions.elementToBeClickable(
                           By.xpath("//button[text()='Find Leads']")))
                           .click();
                   Thread.sleep(5000);
                   wait.until(ExpectedConditions.elementToBeClickable(
                           By.xpath("//a[text()='10778']")))
                           .click();
                   Thread.sleep(2000);
                   
            Thread.sleep(2000);
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
           
   System.out.println("Data Updated Successfully");
            
           
;        } finally {

            // Close browser completely
            driver.quit();
        }
    }
}