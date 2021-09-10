package helloworld_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestHelloWorld {
	
	
	@Test
	public void testHelloWorld() throws InterruptedException
	
	{
		System.out.println("...Hello World..!");
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.com.au/");
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
	}

}
