package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount 
{

	public static void main(String[] args) 
	{
			
		EdgeDriver edgeDrv = new EdgeDriver();
		edgeDrv.get("http://leaftaps.com/opentaps/");
		edgeDrv.manage().window().maximize();
		edgeDrv.findElement(By.id("username")).sendKeys("Demosalesmanager");
		edgeDrv.findElement(By.id("password")).sendKeys("crmsfa");
		edgeDrv.findElement(By.className("decorativeSubmit")).click();
		edgeDrv.findElement(By.linkText("CRM/SFA")).click();
		edgeDrv.findElement(By.linkText("Accounts")).click();
		edgeDrv.findElement(By.linkText("Create Account")).click();
		edgeDrv.findElement(By.id("accountName")).sendKeys("TestData10");
		edgeDrv.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		WebElement induselement = edgeDrv.findElement(By.name("industryEnumId")); // find the dropdown element
		Select inddrpdwn = new Select(induselement); // initialise the object 
		inddrpdwn.selectByIndex(4); // select the industry value
		WebElement ownerelement = edgeDrv.findElement(By.name("ownershipEnumId"));
		Select ownerdrpdwn = new Select(ownerelement); // select the ownerelement
		ownerdrpdwn.selectByVisibleText("S-Corporation");
		WebElement marketelement = edgeDrv.findElement(By.id("marketingCampaignId"));
		Select mrkdrpdwn = new Select(marketelement); // initialise the object 
		mrkdrpdwn.selectByIndex(6); // select the industry value
		WebElement stateelement = edgeDrv.findElement(By.id("generalStateProvinceGeoId"));
		Select statedrpdwn = new Select(stateelement);
		statedrpdwn.selectByValue("TX");
		edgeDrv.findElement(By.xpath("//input[@type ='submit' and @value='Create Account']")).click();
		String accText = edgeDrv.findElement(By.xpath("(//span[@class ='tabletext'])[3]")).getText();
		if (accText.contains("TestData10"))
		{
			System.out.println("Verified Successfully");
		}
		else
		{
			System.out.println("Not Verified Successfully");
		}
		
		edgeDrv.quit();
		
	}
		
						
	}


