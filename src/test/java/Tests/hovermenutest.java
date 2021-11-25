package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.HomePage;

public class hovermenutest extends TestBase
{
  HomePage home;
  
  
  
  @Test
  public void usercanselectcategoryfrommainmenu()
  {
	  home=new HomePage(driver);
	  home.hovermenu();
	  assertTrue(driver.getCurrentUrl().contains("notebooks"));
  }
}
