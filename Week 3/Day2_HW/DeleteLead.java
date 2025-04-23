package week3.day2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException 
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
		edgdrv.findElement(By.linkText("Find Leads")).click();
		edgdrv.findElement(By.xpath("//span[contains(text(), 'Phone')]")).click();
		edgdrv.findElement(By.name("phoneNumber")).sendKeys("90");
		edgdrv.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		Thread.sleep(1000);
		String firstlead = edgdrv.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(firstlead);
		edgdrv.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		edgdrv.findElement(By.xpath("//a[@class ='subMenuButtonDangerous']")).click();
		edgdrv.findElement(By.xpath("//a[contains(text(), 'Find Leads')]")).click();
		edgdrv.findElement(By.xpath("//input[@name='id']")).sendKeys(firstlead);
		edgdrv.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		Thread.sleep(1000);
		String text = edgdrv.findElement(By.xpath("(//div[@class='x-paging-info'])")).getText();
  
		if (text.equals("No records to display"));
		{
			System.out.println("Record has been deleted successfully");
		}
		edgdrv.quit();

	}

}
