package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

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
		edgdrv.findElement(By.id("createLeadForm_companyName")).sendKeys("DeviCompany2");
		edgdrv.findElement(By.id("createLeadForm_firstName")).sendKeys("DP");
		edgdrv.findElement(By.id("createLeadForm_lastName")).sendKeys("AK");
		edgdrv.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Auditor");
		edgdrv.findElement(By.xpath("//input[@type='submit' and @value='Create Lead']")).click();
		WebElement element = edgdrv.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		if (element.getText().contains("DeviCompany2"))
		{
			System.out.println("Verified Successfully");
		}
		else
		{
			System.out.println("Not Verified Successfully");
			
		}	
		edgdrv.close();
		
	}

}
