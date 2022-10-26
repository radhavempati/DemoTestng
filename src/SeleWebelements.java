

import org.openqa.selenium.WebDriver;


import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;




import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




import org.apache.poi.*;
import org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;
import java.util.List;

import java.util.concurrent.TimeUnit;
		import org.testng.annotations.*;
@Test



public class SeleWebelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FindElements element = new FindElements();
		//element.Amazon();
      
      // element.switchelment();
       
      // element.FindWebelements();
		//element.MouseOver();
		//element.FileUpload();
		//element.SelectedComnd();
		//element.FindWebelements();
		//element.getTitleCheck();//get title
		element.RadioNutnFindElement();// and find number of elements
		
	}
	
	}
@Test
class FindElements
{  
	private static final String FileInputStrem = null;

	@Test (priority=1)		
	public static void AmazonLinkTest() 
	{
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.findElement(By.linkText("Today's Deals")).getText());
		//driver.findElement(By.partialLinkText("Customer")).click();
		//driver.quit();
		
		
	}
	@Test(dataProvider="getData")
	public void setData(String username, String password)
	{
		System.out.println("you have provided username as::"+username);
		System.out.println("you have provided password as::"+password);
	}

	@DataProvider
	public Object[][] getData()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	Object[][] data = new Object[3][2];

	// 1st row
	data[0][0] ="sampleuser1";
	data[0][1] = "abcdef";

	// 2nd row
	data[1][0] ="testuser2";
	data[1][1] = "zxcvb";
	
	// 3rd row
	data[2][0] ="guestuser3";
	data[2][1] = "pass123";

	return data;
	}
	@BeforeClass
	public void beforeClass() {
	System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass() {
	System.out.println("After Class");
	}
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("Before Suite");
	}
	@AfterSuite
	public void afterSuite() {
	System.out.println("After Suite");
	}
	

		public void RadioNutnFindElement()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\radha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		    driver.get("http://demo.guru99.com/test/ajax.html");
		    List<WebElement> elements = driver.findElements(By.name("name"));
		    driver.findElement(By.id("buttoncheck")).click();
		  //  List<WebElement> elements = driver.findElement(By.id("buttoncheck")).click();
		    System.out.println("Number of elements:" +elements.size());

		    for (int i=0; i<elements.size();i++){
		      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	}
		    }
		 
	
}
	
	

	
	
	
	   