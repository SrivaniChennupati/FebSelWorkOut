package Basic_Selenium_code;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC010_Justdail {

	public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		
		cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
		
		ChromeDriver driver = new ChromeDriver(options);
		

		driver.get("https://www.justdial.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		//Set the Location as Chennai
	
		driver.findElementById("city").clear();
		
		driver.findElementById("city").sendKeys("chennai");
		
		driver.findElementById("Chennai").click();
		
		//Click Auto Care in the left menu
		
		driver.findElementById("hotkeys_text_6").click();
		
		//Click Car Repair
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//span[text()='Car Repair']")));
		
		driver.findElementByXPath("//span[text()='Car Repair']").click();
		
		//Click Car Brand as Hyundai
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("(//span[text()='Hyundai'])[1]")));
		
		driver.findElementByXPath("(//span[text()='Hyundai'])[1]").click();
		
		//Click Make as Hyundai Xcent
		
		
		  wait.until(ExpectedConditions.visibilityOf(driver.
		  findElementByXPath("//span[@class='redstr']/following-sibling::span[text()='Hyundai Xcent']"
		  )));
		  
		  driver.
		  findElementByXPath("//span[@class='redstr']/following-sibling::span[text()='Hyundai Xcent']"
		  ).click();
		 
		
		//Click on Location and Enter Porur
		
		
		
		
		
		/*
		 * wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath(
		 * "//section[@id='best_deal_div']//span[text()='X']")));
		 * 
		 * driver.findElementByXPath("//section[@id='best_deal_div']//span[text()='X']")
		 * .click();
		 */
		 
		
		
		//Select Porur from the dropdown list
		
		
		/*
		 * driver.findElementById("location").click();
		 * 
		 * driver.findElementById("sortbydist").sendKeys("porur" , Keys.ENTER);
		 * 
		 * driver.findElementById("sortbydistbtn").click();
		 */
		
		//Select Distance starting from 1 km
		
		/*
		 * driver.findElementByXPath("//span[text()='Distance ']").click();
		 * 
		 * driver.findElementById("dst1").click();
		 */
		
		// Identify all the Service Center having Ratings >=4.5 and Votes >=50
		
		
		Map<String,String > map = new LinkedHashMap<String,String>();
		
		
		List<WebElement> list = driver.findElementsByXPath("//p[@class='newrtings ']//span[@class='green-box']");
		
		for (int i=0;i<=list.size()-1;i++)
			
		{
			
			
			String text = list.get(i).getText();
			
			System.out.println(text);
			
			double d = Double.parseDouble(text);
			
			
			String text2 = driver.findElementByXPath("//span[text()='"+text+"']/following-sibling::span[2]").getText();
			
			
			String text3 = text2.replaceAll("\\D","");
			
			System.out.println(text3);
			
			int carname = Integer.parseInt(text3);
			
			if (d>=4.5 & carname>=50)
				
			{
				
				{ String text4 = driver.findElementByXPath("//span[text()='"+text+"']/ancestor::div[1]/h2[@class='store-name']/span//span").getText();
						  
						  System.out.println(text4);
						  
						 }
			}
			
			
			
		
			
		}
		
		 
		
				
		
			
			
		   
			
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
