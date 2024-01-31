package pages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
	{
		WebDriver driver;
	
		//Login Page
		//UserIcon
		@FindBy (xpath = "//button[@class='block self-end p-1']")
		private WebElement userFaceIcon;
	
		@FindBy (xpath = "//span[text()='Dismiss']") //dismiss pop up
		private WebElement dismissButton;
		
		//Enter email id
		@FindBy (xpath = "//input[@id='username']")
		private WebElement userName;
	
		//enter password
		@FindBy (xpath = "//input[@id='password']")
		private WebElement password;
	
		// Login button
		@FindBy (xpath = "//button[@type='submit']")
		private WebElement loginButton;
	
		public void disMiss()
		{
			dismissButton.click();
		}	
		
		public LoginPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void clickUserIcon()
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			userFaceIcon.click();
		}
		public void sendUserName() 
		{
			userName.sendKeys("ssd.dhengre@gmail.com");
			
		}
		public void sendPassword()
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			WebElement passwordElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
			passwordElement.sendKeys("Test@1234");
			password.sendKeys("Test@1234");
		}
		public void clickOnLoginButton() 
		{
			loginButton.click();
		}
	}
