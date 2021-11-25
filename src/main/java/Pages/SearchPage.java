package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{

	public SearchPage(WebDriver driver) {
		super(driver);
	   
	}
	
	@FindBy(id = "small-searchterms")
	WebElement seacrhtxtbox;
	@FindBy(xpath ="//*[@id=\"small-search-box-form\"]/button")
	WebElement searchbtn;
	@FindBy(id = "ui-id-2")
 List<WebElement>autosuggest;
	
	public void search(String prodname)
	{
	   seacrhtxtbox.sendKeys(prodname);	
	   searchbtn.click();
	}
	public void productsearchusingautosuggest(String srchtxt) throws InterruptedException
	{  seacrhtxtbox.sendKeys(srchtxt);
	  Thread.sleep(3000);
	autosuggest.get(0).click();
		
	} 
	
}
