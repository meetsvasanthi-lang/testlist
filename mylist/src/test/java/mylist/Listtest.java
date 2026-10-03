package mylist;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Listtest {
	@Test
public  void  listtest() throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://leaftaps.com/opentaps/control/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']"))
		.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']"))
		.click();
		driver.findElement(By.cssSelector("Leads"))
		.click();
		driver.findElement(By.cssSelector("Create Lead"))
		.click();
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
		driver.findElement(By.xpath("//input[@id='createLeadForm_description']")).sendKeys("keep doing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("meetsvasanthi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("Input#ext-gen612.smallsubmit"))
		.click();
		driver.findElement(By.xpath("//input[@id='sectionHeaderTitle_leads']")).getAttribute("value");
		driver.close();
		

	}

}
