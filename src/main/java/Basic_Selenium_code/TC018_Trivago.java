package Basic_Selenium_code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC018_Trivago {

	public static void main(String[] args) throws InterruptedException {
		
		

        System.setProperty("webdriver.chrome.driver", "./drivers2/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		
		cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
		
		ChromeDriver driver = new ChromeDriver(options);
		

		driver.get("https://www.trivago.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Type Agra in Destination and select Agra, Uttar Pradesh.
		
		driver.findElementByXPath("//div[@class='dealform__query-wrapper']//input[@type='search']").sendKeys("Agra");
		
		driver.findElementByXPath("//ul[@id='ssg-suggestions']/li[1]").click();
		
		    WebDriverWait wait = new WebDriverWait(driver,30);
		  
		  wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//div[@id='onetrust-button-group']/button[text()='OK']")));
		  
		  driver.findElementByXPath("//div[@id='onetrust-button-group']/button[text()='OK']").click();
		
		//Choose May 15 as check in and June 30 as check out
		
		WebElement table = driver.findElementByXPath("//div//table[@class='cal-month']");
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		
			WebElement rows1= rows.get(4);
			
			List<WebElement> columns = rows1.findElements(By.tagName("td"));
			
			columns.get(1).click();
			
			
			driver.findElementByXPath("//div[@class='df_container_calendar']/button[@type='button']/span").click();
			
			
			Thread.sleep(2000);
			
			
			WebElement table1 = driver.findElementByXPath("//div//table[@class='cal-month']");
			
			List<WebElement> rows2 = table1.findElements(By.tagName("tr"));
			
			
				WebElement rows3= rows2.get(6);
				
				List<WebElement> columns1 = rows3.findElements(By.tagName("td"));
				
				columns1.get(4).click();
				
				
	// Select Room as Family Room
				
				driver.findElementByXPath("//ul[@class='df_container_roomtype_selector df_dropdown']/li[3]/button/div/span[text()='Family rooms']").click();
				
	//Choose Number of Adults 2, Childern 1 and set Child's Age as 4
				
				WebElement AdultDropdown = driver.findElementById("select-num-adults-2");
				
				Select se = new Select(AdultDropdown);
				
				se.selectByVisibleText("2");
				
				WebElement Childrendropdown = driver.findElementById("select-num-children-2");
				
				Select se1 = new Select(Childrendropdown);
			
			   se1.selectByVisibleText("1");
			
			    Thread.sleep(2000);
			    
			    WebElement childage = driver.findElementById("select-ages-children-2-3");

				Select se2 = new Select(childage);
				
				se2.selectByVisibleText("4");
				
				//Click Confirm button and click Search
				
				driver.findElementByXPath("//div[@class='kids_group_detail_roominfo kids_group_action group']/button[2]").click();
				
				driver.findElementByXPath("//button[@class='btn btn--primary btn--regular search-button js-search-button']/span[text()='Search']").click();
			    
			    
			    //Select Accommodation type as Hotels only and choose 4 stars
				
				Thread.sleep(5000);
				
				WebElement accomdation = driver.findElementByXPath("//ul[@class='toolbar-list']/li[@data-qa='stars-filter']");
				
				Actions builder = new Actions(driver);
				
				builder.moveToElement(accomdation).perform();
				
				driver.findElementByXPath("//div[@class='refinement-row__content']/div/ul/li[2]/input[@id='acc-type-filter-1']").click();
				
				driver.findElementByXPath("//div[contains(@class,'filter-components__starBtnWrapper')]/button[4]/span").click();
				
				driver.findElementByXPath("//footer[@class='refinement-row__actions']/button[text()='Done']").click();
				
				//Select Guest rating as Very Good
				
				
			    WebElement stars = driver.findElementByXPath("//ul[@class='toolbar-list']/li[@data-qa='rating-filter']");
			    
               Actions builder1 = new Actions(driver);
				
				builder1.moveToElement(stars).perform();
				
				driver.findElementByXPath("//ul[@class='range']/li[2]//span/following-sibling::span[text()='Very good']").click();
				
				//Set Hotel Location as Agra Fort and click Done
				
				
			    WebElement location = driver.findElementByXPath("//ul[@class='toolbar-list']/li[@data-qa='location-filter']");
		  
              Actions builder2 = new Actions(driver);
				
				builder2.moveToElement(location).perform();
				
				WebElement loc = driver.findElementById("pois");
				
				Select se4 = new Select(loc);
				
		   se4.selectByVisibleText("Agra Fort");
		   
		   //In more Filters, select Air conditioning, Restaurant and WiFi and click Done
		   
		   WebElement more = driver.findElementByXPath("//ul[@class='toolbar-list']/li[@data-qa='more-filter']");
		   
		   Actions builder3 = new Actions(driver);
			
			builder3.moveToElement(more).perform();
			
			driver.findElementByXPath("//ul[contains(@class,'details__content filter-components__detailsContent')]/li[2]/label[text()='WiFi']").click();
		   
		    driver.findElementByXPath("//ul[contains(@class,'details__content filter-components__detailsContent')]/li[4]/label[text()='Air conditioning']").click();
			
			Thread.sleep(3000);
			
			driver.findElementByXPath("//ul[contains(@class,'details__content filter-components__detailsContent')]/following::details[3]/ul/following-sibling::button[text()='Show more']").click();
		
		    driver.findElementByXPath("//ul[contains(@class,'details__content filter-components__detailsContent')]/following::details[3]/ul/li[15]").click();
		    
		    driver.findElementByXPath("//footer[@class='refinement-row__actions']/div/following-sibling::button[@id='filter-popover-done-button']").click();
		    
		    //Sort the result as Rating & Recommended
		    
		    WebElement sort = driver.findElementById("mf-select-sortby");
		    
		    Select se5 = new Select(sort);
		    
		    se5.selectByVisibleText("Rating & Recommended");
		    
		    //Print the Hotel name, Rating, Number of Reviews and Click View Deal
		    
		    String text = driver.findElementByXPath("//li[@class='hotel-item item-order__list-item js_co_item']//div/div/h3/span[text()='Studio Apartment 3 Bed Room With Ensuite & Kitchen']").getText();
		    
		    System.out.println(text);
		    
		    String text2 = driver.findElementByXPath("//div[@class='item__details item__details--layout']/div/button/span/span[2]/strong").getText();
		
		    System.out.println(text2);
		    
		    driver.findElementByXPath("//div[contains(@class,'accommodation-list__dealInfo--93f19 accommodation-list__offset')]/button/span/span[text()='View Deal']").click();
		    
		    //Print the URL of the Page
		    
		    Set<String> set = driver.getWindowHandles();
		    
		    List<String> list = new ArrayList<String>();
		    
		  list.addAll(set);
		  
		  driver.switchTo().window(list.get(1));
		  
		  String currentUrl = driver.getCurrentUrl();
		  
		  System.out.println(currentUrl);
		  
		  //Print the Price of the Room and click Choose Your Room
		  
		  
		

	}

}
