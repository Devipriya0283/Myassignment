package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookRegistration {

	public static void main(String[] args) 
	{
		 
		ChromeDriver chrdriv = new ChromeDriver();
		chrdriv.get("https://en-gb.facebook.com/");
		chrdriv.manage().window().maximize();
		chrdriv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chrdriv.findElement(By.xpath("(//span[contains(text(),'Allow all cookies')])[2]")).click();
		chrdriv.findElement(By.xpath("//a[@role ='button' and @data-testid='open-registration-form-button']")).click();
		//chrdriv.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]")).click();
		chrdriv.findElement(By.xpath("(//span[contains(text(),'Allow all cookies')])[2]")).click();
		chrdriv.findElement(By.name("firstname")).sendKeys("Test");
		chrdriv.findElement(By.name("lastname")).sendKeys("TestData");
		//select day, month and year
		WebElement dayelm = chrdriv.findElement(By.id("day"));
		Select selday = new Select(dayelm);
		selday.selectByIndex(7);
		WebElement monelm = chrdriv.findElement(By.id("month"));
		Select selmon = new Select(monelm);
		selmon.selectByIndex(1);
		WebElement yrelm = chrdriv.findElement(By.id("year"));
		Select selyr = new Select(yrelm);
		selyr.selectByIndex(10);	
		chrdriv.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
		chrdriv.findElement(By.name("reg_email__")).sendKeys("Test102@gmail.com");
		chrdriv.findElement(By.name("reg_passwd__")).sendKeys("TestData@102");
		chrdriv.findElement(By.name("websubmit")).click();
		chrdriv.close();
	

	}

}
