package snippet;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;
import java.util.List;

import java.util.concurrent.TimeUnit;
		import org.testng.annotations.*;

	
public class TestPriority {
	@Test(dataProvider = "loginTestData") 
	
	public void TestLogin(String Username  ,String Password) throws Exception
	{
		
			
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\radha\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys(Password);
			Thread.sleep(5000);
			driver.findElement(By.id("btnLogin")).click();
			driver.get("https://www.mycontactform.com/samples.php");
			driver.findElement(By.id("user")).sendKeys(Username);
			driver.findElement(By.cssSelector("#pass")).sendKeys(Password);
			//driver.findElement(By.name("btnSubmit")).submit();
			Thread.sleep(5000);
			//driver.quit();
}
	@DataProvider(name="loginTestData")
	public Object[][] getData() throws InterruptedException
	{
		Object[][] data = new Object[2][2];

		// 1st row
		data[0][0] ="Admin";
		data[0][1] = "admin123";
		Thread.sleep(5000);
		// 2nd row
		data[1][0] ="Admin";
		data[1][1] = "admin123";
		
		
		return data;
		
	}
	}
		
