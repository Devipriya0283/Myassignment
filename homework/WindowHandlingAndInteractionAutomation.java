package week4.day2.homework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
 

public class WindowHandlingAndInteractionAutomation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		

		EdgeDriver edgdrv = new EdgeDriver();
		edgdrv.get("http://leaftaps.com/opentaps/control/login");
		edgdrv.manage().window().maximize();
		edgdrv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		edgdrv.findElement(By.id("username")).sendKeys("Demosalesmanager");
		edgdrv.findElement(By.id("password")).sendKeys("crmsfa");
		edgdrv.findElement(By.className("decorativeSubmit")).click();
		edgdrv.findElement(By.linkText("CRM/SFA")).click();
		edgdrv.findElement(By.xpath("//a[text()='Create Contact']")).click();
		edgdrv.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		edgdrv.findElement(By.xpath(("(//img[@src='/images/fieldlookup.gif'])[1]"))).click();
		
		//getWindowHandle
		String parentAddress = edgdrv.getWindowHandle();
		//System.out.println("Parent address is: "+parentAddress);
		
		//getWindowHandles
		Set<String> allWindows = edgdrv.getWindowHandles();
		//System.out.println("All windows address is: "+allWindows);
		
		
		//Convert Set into List
		List<String> allAddress=new ArrayList<String>(allWindows);
		edgdrv.switchTo().window(allAddress.get(1));
		edgdrv.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
	    edgdrv.switchTo().window(allAddress.get(0)); 
	     

		
		/*Details: 
			 
		Automate interactions with a webpage, 
		focusing on window handling, using Selenium WebDriver. 
			 
		Precondition: 
		-Initialize ChromeDriver - 
		Load the URL (http://leaftaps.com/opentaps/control/login) - Maximize the browser window - Add an implicit wait to ensure the webpage elements are fully loaded 
	 
		Requirements: 
			 
			 - Enter the username and password. 
			 - Click on the Login button. 
			 - Click on the CRM/SFA link. 
			 - Click on the Contacts button. 
			 - Click on Merge Contacts. 
			 - Click on the widget of the "From Contact". 
			 - Click on the first resulting contact. 
			 - Click on the widget of the "To Contact". 
			 - Click on the second resulting contact. 
			 - Click on the Merge button. 
			 - Accept the alert. 
			 - Verify the title of the page. 
			 
Hints to Solve: 
			 - Use Selenium methods such as `get()`, `findElement()`, `sendKeys()`,
			  `click()`, and `switchTo().alert()` to perform the 
			required actions. - Use appropriate locators and techniques to interact 
			with web elements. - To switch between windows, use `getWindowHandles()`
			 and `switchTo().window()`.. */
		

	}

}
