package Step;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class TC001_Carewale {
	
	public static ChromeDriver driver;
	
	@Given ("User Opens the Chrome Browser")
	public void openBrowser()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers2/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable notifications");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
		
		 driver = new ChromeDriver();
	}
	
	@And("User Loads the Carewale URL")
	public void loadCarewaleURL()
	
	{
		 
		 driver.get("https://www.carwale.com/");
		
	}
	
	@And("User Maximize the Browser")
	
	public void maximizeBrowser()
	
	{
		
		driver.manage().window().maximize();
	}
	
	@And("User set the default Implicit wait")
	
	
	public void setTime()
	
	{
		WebDriverWait  wait = new  WebDriverWait(driver,20);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}
	
	
	@And("User clicks on used")
	public void clickUsed() throws InterruptedException
	
	{
		
		driver.findElementByXPath("//ul[@id='newUsedSearchOption']/li[2]").click();
		
		Thread.sleep(2000);
	}
	
	
	
	@And("User Select the City as Chennai")
	public void selectCity()
	{
		
		driver.findElementByXPath("//div[@class='used-cars-search']/input[@id='usedCarsList']").sendKeys("chennai");
		
		
	}
	
	
	

	
}
