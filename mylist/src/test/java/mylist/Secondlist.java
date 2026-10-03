package mylist;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Secondlist {
	@Test

	public void secondlist()throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']"))
		.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']"))
		.click();
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		 wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//*[self::a or self::button][normalize-space()='Leads']")
	            )).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[self::a or self::button][normalize-space()='Create Lead']")
            )).click();
	Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("wipro");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("vasanthi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("karthik");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("saranya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("data analyst");
		Thread.sleep(2000);
		
	
		driver.findElement(By.cssSelector("textarea#creatLeadForm_description.inputbox")).sendKeys("keep doing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("meetsvasanthi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("Input#ext-gen612.smallsubmit"))
		.click();
		driver.findElement(By.xpath("//input[@id='sectionHeaderTitle_leads']")).getAttribute("value");
		driver.close();
		

	
	}
}

			
			
		
		


