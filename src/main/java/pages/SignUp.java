package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {

	//Sign up page by New User
		//Click on Human or User icon 
		@FindBy (xpath = "//button[@class='block self-end p-1']")
		private WebElement userFaceIcon;
		
		//Click on link "Create new account in less than 1 minute" link for new sign-up users
		@FindBy (xpath = "//button[@class='button textLink ']")
		 private WebElement createNewAccountLink;

		WebDriver driver;
		
		
		public SignUp(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}

		public void clickOnUserIcon() throws InterruptedException
		{
			Thread.sleep(1000);
			userFaceIcon.click();
			
		}
		public void createNewSignLink()
		{
			createNewAccountLink.click();
			
		}
}