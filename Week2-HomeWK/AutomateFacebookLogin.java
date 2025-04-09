package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookLogin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ChromeDriver chdrv = new ChromeDriver();
		chdrv.get("https://www.facebook.com/");
		chdrv.manage().window().maximize();
		chdrv.findElement(By.xpath("(//span[text() ='Allow all cookies'])[2]")).click();
		chdrv.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		chdrv.findElement(By.id("pass")).sendKeys("Tuna@321");
		chdrv.findElement(By.xpath("//button[@value='1' and @data-testid='royal-login-button']")).click();
		chdrv.findElement(By.xpath("//a[contains(text(), 'Find your')]")).click();
		WebElement element = chdrv.findElement(By.xpath("(//h2[contains(text(), 'Find Your Account')])[2]"));
		
		if (element.getText().contains("Find Your Account"))
		{
			System.out.println("Verified Successfully");
		}
		else
		{
			System.out.println("Not Verified Successfully");
			
		}	
		}

}
