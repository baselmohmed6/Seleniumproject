package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utility.helper;

public class TestBase  extends AbstractTestNGCucumberTests {


	public static WebDriver driver;
	
	@BeforeTest
	
	public void startdriver()
	
	{   
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	}


	@AfterMethod
	public void takescreeenshotonfailure(ITestResult RESULT)
	{
		if (RESULT.getStatus()==ITestResult.FAILURE) {
			
			System.out.println("Failed");
			System.out.println("Taking screenshot.....");
			helper.capturescreenshot(driver, RESULT.getName());
		}
	}
	
	@AfterTest	
	public void  quitdriver()
	{
		driver.quit();
	}
}
