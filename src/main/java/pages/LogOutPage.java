package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {

	@FindBy (xpath = "//button[@class='block self-end p-1']")
	private WebElement userFaceIcon;
	
	@FindBy (xpath = "//span[text()='Log out']")
	private WebElement logOutbutton;

	public LogOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickUserIcon()
	{
		userFaceIcon.click();
	}
	public void logOut() 
	{
		logOutbutton.click();
	}
	
}
