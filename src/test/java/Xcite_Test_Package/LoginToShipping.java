package Xcite_Test_Package;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogOutPage;
import pages.LoginPage;
import pages.SearchProductPage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToShipping {

	public WebDriver driver;
	public void launchBrowser() {
	    loginPage = new LoginPage(driver);
		//	WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		//Add chrome switch to disable notification - "**--disable-notifications**"
		options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		}
	
	LoginPage loginPage;
	SearchProductPage searchProductPage ;
	LogOutPage logOutPage;
	@BeforeClass
		
		
		public void openLoginPage() throws InterruptedException {
			launchBrowser(); //call the method to initialize the browser
			driver.get("https://www.xcite.com");
			driver.manage().window().maximize();
			new WebDriverWait(driver,Duration.ofSeconds(6));
			}
		@Test
			public void loginPageTest() throws InterruptedException 
			{
			new WebDriverWait(driver, Duration.ofSeconds(5));
			
			loginPage = new LoginPage(driver);
			searchProductPage = new SearchProductPage(driver);
			logOutPage = new LogOutPage(driver);
			new WebDriverWait(driver,Duration.ofSeconds(10));
			loginPage.clickUserIcon();
			loginPage.sendUserName();
			loginPage.clickOnLoginButton();
			new WebDriverWait(driver, Duration.ofSeconds(2));
			loginPage.sendPassword();
			loginPage.clickOnLoginButton();
			new WebDriverWait(driver, Duration.ofSeconds(10));
			searchProductPage= new SearchProductPage(driver);
			searchProductPage.SearchTab();
			searchProductPage.itemPro();
			searchProductPage.dismiss();
		
			searchProductPage.addtoCart();
			new WebDriverWait(driver, Duration.ofSeconds(2));
			
			searchProductPage.clickCart();
		
			searchProductPage.addmoreQuantity();
			searchProductPage.checkout();
			new WebDriverWait(driver, Duration.ofSeconds(2));
			
		searchProductPage.userNameContinueLink();
		searchProductPage.continueButton();
		searchProductPage.userpasswordContinueLink();
		searchProductPage.continueButton();
		searchProductPage.check();
		searchProductPage.enterAddress();
		searchProductPage.listboxAddressSelect();
		searchProductPage.confirmLocation();
		searchProductPage.addToBuildingLink();
		searchProductPage.modeOfCommunicationDropDown();
		searchProductPage.confirmShippingAddressButton();
		logOutPage.clickUserIcon();
		logOutPage.logOut();
		}
		
			@AfterMethod
		public void afterMethod() {
			
				System.out.println("After Method");
		}
		
		@AfterClass
		public void afterClass() {
			System.out.println("After Class");
			driver.close();
		}

	}
		
			

