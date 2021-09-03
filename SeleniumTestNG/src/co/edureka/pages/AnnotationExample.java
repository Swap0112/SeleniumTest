package co.edureka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample {
	public String baseUrl = "https://www.edureka.co/";
	String drivePath = "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe";
	public WebDriver driver ;
	
	@BeforeTest
	 public void launchBrowser() {
		System.out.println("launching Chrome Browser");
		System.setProperty("webdriver.chrome.driver", drivePath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	@Test
	public void verifyHomepageTitle() {
		String expectedTitle = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@AfterTest
	public void terminateBrowser() {
		driver.close();
		
		
	}
	  
}
