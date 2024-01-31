package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpLastPage {
WebDriver driver;
	//Sign up page by New User
	
		//Click on SignUp button
		//Enter email id and then enter Code
	
	
		@FindBy (xpath = "//input[@placeholder='Insert Code']")
		private WebElement insertCode;
		
	//	Verify button
			
		@FindBy (xpath = "//button[@type='submit']")
		private WebElement verifyButton;

		//public void enterDetailsForLastPage() {
			// TODO Auto-generated method stub
		public SignUpLastPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void enterCode(String enterCode)
		{
			insertCode.sendKeys(enterCode);
			
		}
		public void clickVerifyButton()
		{
			verifyButton.click();
		}
		}	

	