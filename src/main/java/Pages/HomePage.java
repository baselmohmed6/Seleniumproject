package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
         jse= (JavascriptExecutor)driver;
         action=new Actions(driver);
	}


	
	
    @FindBy(linkText = "Register")
	WebElement registerlink;
    public void openregisterlink()
	{
		registerlink.click();

	}
    @FindBy(linkText = "Log in")
	WebElement loginlink;
	public void openloginlink()

	{
		loginlink.click();
	}
	
	public void scrollpage()
	{
		scrollbutton();
	}
	
	@FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[1]/ul/li[6]/a")
	WebElement clickcontactus;
	public void opencontactus()
	{
		clickcontactus.click();
	}
	
	@FindBy(id = "customerCurrency")
	public WebElement changecurruncy;
	
	@FindBy (linkText = "Computers")
	WebElement computermenu;
	@FindBy(linkText =  "Notebooks")
	WebElement notebooksmenu;
	public void changecurrunc()
	{
		changecurruncy.click();
		Select sd=new Select(changecurruncy);
		sd.selectByIndex(1);
		
	}
	public void hovermenu()
	{
		action.moveToElement(computermenu).moveToElement(notebooksmenu).click().build().perform();
	}
	
	
}
