package mylist;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class thirdlist {

    @Test
    public void secondlist() {

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

            // Click CRM/SFA
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//img[contains(@src,'crm.png')]")))
                    .click();

            // Click Leads
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[normalize-space()='Leads']")))
                    .click();

            // Click Create Lead
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[normalize-space()='Create Lead']")))
                    .click();

            // Enter Company Name
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.id("createLeadForm_companyName")))
                    .sendKeys("Wipro");

            // Enter First Name
            driver.findElement(
                    By.id("createLeadForm_firstName"))
                    .sendKeys("Vasanthi");

            // Enter Last Name
            driver.findElement(
                    By.id("createLeadForm_lastName"))
                    .sendKeys("Karthik");

            // Enter Local First Name
            driver.findElement(
                    By.id("createLeadForm_firstNameLocal"))
                    .sendKeys("Saranya");

            // Enter Department
            driver.findElement(
                    By.id("createLeadForm_departmentName"))
                    .sendKeys("Data Analyst");

            // Enter Description
            driver.findElement(
                    By.id("createLeadForm_description"))
                    .sendKeys("Keep doing");

            // Enter Email
            driver.findElement(
                    By.id("createLeadForm_primaryEmail"))
                    .sendKeys("meetsvasanthi@gmail.com");

            // Click Create Lead button
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//input[@value='Create Lead']")))
                    .click();

            // Verify Lead page
            String pageTitle = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.id("sectionHeaderTitle_leads")))
                    .getAttribute("value");

            System.out.println("Page title: " + pageTitle);

            Assert.assertTrue(
                    driver.getPageSource().contains("View Lead"),
                    "Lead creation page was not displayed"
            );

            System.out.println("Lead created successfully");

        } finally {

            // Close browser completely
            driver.quit();
        }
    }
}