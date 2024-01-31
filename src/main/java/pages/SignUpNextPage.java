package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpNextPage {
		//Sign up page by New User
	WebDriver driver ;
		//Create Account Page - Next page
			//For Enter Email id
		@FindBy (xpath = "//input[@id='username']")
		private WebElement newUsernameEmail;
		
		//For Enter password
		@FindBy (xpath = "//input[@id='password']")
		private WebElement newUserPassword;
	
		//For back link
		@FindBy (xpath = "//button[@class='button textLink undefined']")
		private WebElement backButton;
	
		//For toggle button near Terms and Conditions
		@FindBy (xpath = "//input[@type='checkbox']")
		private WebElement toggleButton;
		
		@FindBy (xpath = "//input[@id='regverify']")
		private WebElement insertCode;
		
		
		
		//For SignUp button
		@FindBy (xpath = "//button[@type='submit']")
		private WebElement signUpButton;

		public SignUpNextPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
						
		}
		public void newEmail()
		{
			newUsernameEmail.sendKeys("sqqdsd@yopmail.com");
		}
		public void newPassword()
		{
			newUserPassword.sendKeys("Test@1234");
		}
		public void clickToggleButton()
		{
			toggleButton.click();
		}
		public void insertCodeFromEmail()
		{
			insertCode.sendKeys("1233");
		}
		public void clickBackButton()
		{
			backButton.click();
		}
		public void clickSignButton()
		{
			signUpButton.click();
		}
		
			
}

