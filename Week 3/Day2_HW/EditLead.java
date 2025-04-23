package week3.day2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		EdgeDriver edgdrv = new EdgeDriver();
		edgdrv.get("http://leaftaps.com/opentaps/");
		edgdrv.manage().window().maximize();
		edgdrv.findElement(By.id("username")).sendKeys("Demosalesmanager");
		edgdrv.findElement(By.id("password")).sendKeys("crmsfa");
		edgdrv.findElement(By.className("decorativeSubmit")).click();
		edgdrv.findElement(By.linkText("CRM/SFA")).click();
		edgdrv.findElement(By.linkText("Leads")).click();
		edgdrv.findElement(By.linkText("Create Lead")).click();
		edgdrv.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("XYZ");
		edgdrv.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("ABC");
		edgdrv.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("LKJ");
		edgdrv.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("XYZ_Local");
		edgdrv.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("TestData_DapartmentName");
		edgdrv.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("TestData_Description");
		edgdrv.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("TestData_PrimaryEmail@gmail.com");
		WebElement element = edgdrv.findElement(By.name("generalStateProvinceGeoId"));
		Select selstate = new Select(element);
		selstate.selectByVisibleText("New York");
		edgdrv.findElement(By.xpath("//input[@name='submitButton']")).click();
		edgdrv.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		edgdrv.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Sample Data");
	    edgdrv.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = edgdrv.getTitle();
		System.out.println(title);
		edgdrv.quit();
		
		

	}

}
