package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    JavascriptExecutor jse;
     Actions action;
	protected WebDriver driver;
	//create constructor
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public  void clickbtn(WebElement webelmnt)
	{
		webelmnt.click();
	}
	
	public void scrollbutton()
	{
	  jse.executeScript("scrollBy(0,2500)"); 
	}
	
}

