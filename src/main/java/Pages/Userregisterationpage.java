package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Userregisterationpage  extends PageBase{

	

	


	public Userregisterationpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(name = "Gender")
	WebElement genderrdbtn;
	@FindBy(id = "FirstName")
	WebElement firstname;
	@FindBy(id="LastName")
	WebElement lastname;
	@FindBy(id = "Email")
	WebElement email;
	@FindBy(id ="Company")
	WebElement company;
	@FindBy(id = "Password")
	WebElement password;
	@FindBy(id ="ConfirmPassword")
	WebElement confirmpassword;
	@FindBy(id="register-button")
	WebElement register;
	@FindBy(className = "result")
	public WebElement successmessage;
	@FindBy(xpath =   "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement logout;
	@FindBy(id = "Email")
	WebElement Emailtxt;
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement login;
	@FindBy (id = "Password")
	WebElement passtxt;
	@FindBy(id = "RememberMe")
	WebElement rememberme;
	@FindBy (linkText = "Log in")
	WebElement btnsumbit;
	
	
	@FindBy(linkText = "My account")
	WebElement  myacclink;
	public void userregisteration(String fnames ,String lname,String emails,String pass)
	{   clickbtn(genderrdbtn);
		firstname.sendKeys(fnames);
		lastname.sendKeys(lname);
		email.sendKeys(emails);
		company.sendKeys("airr");
		password.sendKeys(pass);
		confirmpassword.sendKeys(pass);
		clickbtn(register);
		//clickbtn(logout);
	}

 public void openMyAccountPage()
 {
	 clickbtn(myacclink);
 }
	/*
	 * public void openloginpage(String email,String pass) {
	 * Emailtxt.sendKeys(email); passtxt.sendKeys(pass); clickbtn(rememberme);
	 * clickbtn(btnsumbit); }
	 */
 public void logout()
 {
	 logout.click();
 }

public void openloginpage(String string, String string2) {
  
	login.click();
}
}
