package pages;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchProductPage {

	public static WebDriver driver;
	//Search product on search tab
	@FindBy (xpath = "//input[@id='search']")
	private WebElement searchTab;
		
	@FindBy (xpath = "//div[@data-insights-position='2']")
	private WebElement item;
		
	@FindBy (xpath = "//span[text()='Dismiss']")
	private WebElement dismissButton;
	
	@FindBy (xpath = "//span[text()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy (xpath = "//a[@class='block p-1 relative z-50']")
	private WebElement clickCart;
	
	@FindBy (xpath = "//button[@aria-label='increase quantity']")
	private WebElement addQuantity;
	
	@FindBy (xpath = "//span[text()='Checkout']")
	private WebElement checkoutButton;
	
	@FindBy (xpath = "//input[@id='username']")
	private WebElement usernameContinue;
	
	
	@FindBy (xpath = "//div[@class='sm:col-span-1']")
	private WebElement enterYourAddress;
	
	@FindBy (xpath = "//ul[@role='listbox']/li[2]")
	private WebElement listboxAddress;
		
	@FindBy (xpath = "//span[text()='Confirm location']")
	private WebElement confirmLocationButton;
	
	@FindBy (xpath = "//span[text()='Add building, floor, etc.']")
	private WebElement addBuildingLink;
	
	@FindBy (xpath = "//input[@id='firstName']")
	private WebElement firstName;
	
	@FindBy (xpath = "//input[@id='lastName']")
	private WebElement lastName;
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement continueButton;
	
	@FindBy (xpath = "//input[@id='password']")
	private WebElement password;
	

	@FindBy (xpath = "//button[@class='button primaryOnLight w-full']")
	private WebElement continueChecko;
	
	@FindBy (xpath = "//input[@id='primaryPhoneNumber']")
	private WebElement primaryPhoneNumber;
	
	
	@FindBy (xpath = "//select[@id='modeOfCommunication']")
	private WebElement modeOfCommunication;
	
	@FindBy (xpath = "//span[text()='Confirm shipping address']")
	private WebElement confirmShippingAddress;
	
	public SearchProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		public void SearchTab() throws InterruptedException
	{
		searchTab.click();
		searchTab.sendKeys("iphone");
		searchTab.sendKeys(Keys.ENTER);
		
	}	
		public void itemPro() throws InterruptedException
	{
			Thread.sleep(20000);
			item.click();
			try {
		        // Wait for the alert to be present (adjust timeout as needed)
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.alertIsPresent());

		        // Switch to the alert
		        Alert alert = driver.switchTo().alert();
		       alert.dismiss();

		        // Perform actions on the alert (e.g., accept, dismiss)
		        // alert.accept(); // or alert.dismiss();

		        // If you need to extract text from the alert
		        String alertText = alert.getText();
		        System.out.println("Alert Text: " + alertText);

		        // After handling the alert, switch back to the main window if needed
		         driver.switchTo().defaultContent();
				} catch (Exception e) {
		        // Handle exceptions, or log if no alert is present
		        System.out.println("No alert found: " + e.getMessage());

		    	}
				}
		public void dismiss()
		{
			dismissButton.click();
		}
		
		public void addtoCart()
		{
			WebElement addToCart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
			//we need to include JavascriptExcecuter 
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCart);
			addToCart.click();
			try {
	        // Wait for the alert to be present (adjust timeout as needed)
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.alertIsPresent());

	        // Switch to the alert
	        Alert alert = driver.switchTo().alert();
	        alert.dismiss();

	        // Perform actions on the alert (e.g., accept, dismiss)
	        // alert.accept(); // or alert.dismiss();

	        // If you need to extract text from the alert
	        String alertText = alert.getText();
	        System.out.println("Alert Text: " + alertText);

	        // After handling the alert, switch back to the main window if needed
	         driver.switchTo().defaultContent();
			} catch (Exception e) {
	        // Handle exceptions, or log if no alert is present
				System.out.println("No alert found: " + e.getMessage());

		}
	}
		public void clickCart()
			{
			WebElement clickCart = driver.findElement(By.xpath("//a[@class='block p-1 relative z-50']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickCart);
			clickCart.click();
				
			}
		public void addmoreQuantity() throws InterruptedException
			{
			
			try {
		        // Wait for the alert to be present (adjust timeout as needed)
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.alertIsPresent());

		        // Switch to the alert
		        Alert alert = driver.switchTo().alert();
		       alert.dismiss();

		        // Perform actions on the alert (e.g., accept, dismiss)
		        // alert.accept(); // or alert.dismiss();

		        // If you need to extract text from the alert
		        String alertText = alert.getText();
		        System.out.println("Alert Text: " + alertText);

		        // After handling the alert, switch back to the main window if needed
		         driver.switchTo().defaultContent();
				} catch (Exception e) {
		        // Handle exceptions, or log if no alert is present
		        System.out.println("No alert found: " + e.getMessage());

		    	}
				WebElement addmoreQuantity = driver.findElement(By.xpath("//button[@aria-label='increase quantity']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addmoreQuantity);
			
				addmoreQuantity.click();
				Thread.sleep(1000);
				}
			
				
		public void checkout()
		{

			try {
		        // Wait for the alert to be present (adjust timeout as needed)
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.alertIsPresent());

		        // Switch to the alert
		        Alert alert = driver.switchTo().alert();
		       alert.dismiss();

		        // Perform actions on the alert (e.g., accept, dismiss)
		        // alert.accept(); // or alert.dismiss();

		        // If you need to extract text from the alert
		        String alertText = alert.getText();
		        System.out.println("Alert Text: " + alertText);

		        // After handling the alert, switch back to the main window if needed
		         driver.switchTo().defaultContent();
				} catch (Exception e) {
		        // Handle exceptions, or log if no alert is present
		        System.out.println("No alert found: " + e.getMessage());

		    	}
			
				WebElement checkoutButton = driver.findElement(By.xpath("//span[text()='Checkout']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkoutButton);
				checkoutButton.click();
		}
		public void userNameContinueLink()
		{
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			  WebElement usernameContinue = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='username']")));
			   
			usernameContinue.sendKeys("ssd.dhengre@gmail.com");
			usernameContinue.sendKeys(Keys.TAB);
			
		}
				
		public void continueButton()
		{
			continueButton.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
		}
		public void userpasswordContinueLink()
		{
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    WebElement usernameContinue = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
			   
			    password.sendKeys("Test@1234");
			    password.sendKeys(Keys.TAB);

		
		} 
		public void check()
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement continueChecko = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='button primaryOnLight w-full']")));

	        performMouseAction(continueChecko);
	    }

	    private void performMouseAction(WebElement element) {
	        Actions actions = new Actions(driver);
	        actions.moveToElement(element).click().build().perform();
	        handleNewWindows();
	    }

	    private void handleNewWindows() {
	        Set<String> windowHandles = driver.getWindowHandles();
	        if (windowHandles.size() > 1) {
	            // Switch to the new window
	            for (String windowHandle : windowHandles) {
	                if (!windowHandle.equals(windowHandle)) {
	                    driver.switchTo().window(windowHandle);
	                    break;
	                }
	            }
	        }
	    }
	    
		public void enterAddress()
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		    WebElement enterYourAddress = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='sm:col-span-1']")));
		   
			enterYourAddress.click();
			enterYourAddress.sendKeys("salmiya");
			
		}
		public void listboxAddressSelect()
		{
			Select s = new Select(listboxAddress);
			//3 -types of select
			s.selectByIndex(2);  
		}
		public void confirmLocation()
		{
			confirmLocationButton.click();
		}
	public void addToBuildingLink()
	{
		addBuildingLink.click();
		firstName.sendKeys("FirstName");
		lastName.sendKeys("LastName");
		email.sendKeys("abcd@gmail.com");
		primaryPhoneNumber.sendKeys("+9659000000");
		
	}
	public void modeOfCommunicationDropDown()
	{
		modeOfCommunication.click();
		Select s = new Select(modeOfCommunication);
		//3 -types of select
		s.selectByIndex(2); 
		
	}
	public void confirmShippingAddressButton()
	{
		WebElement confirmShippingAddress = driver.findElement(By.xpath("//span[text()='Confirm shipping address']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirmShippingAddress);
        performMouseAction(confirmShippingAddress);
	}
}

