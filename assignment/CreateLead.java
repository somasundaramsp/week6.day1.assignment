package week6.day1.assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass {
	@Test
	public  void runCreateLead(){
		System.out.println("Create Lead");
		System.out.println("runCreateLead : "+driver);
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		
}
}
