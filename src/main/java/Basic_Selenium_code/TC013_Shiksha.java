package Basic_Selenium_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
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

public class TC013_Shiksha {

	public static void main(String[] args) throws InterruptedException {
		

	       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--disable-notifications");
			
			
			DesiredCapabilities cap = new DesiredCapabilities();
			
			
			cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
			
			ChromeDriver driver = new ChromeDriver(options);
			

			driver.get("https://studyabroad.shiksha.com/ ");

			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			WebDriverWait wait = new WebDriverWait(driver,30);
			
			// Mouse over on Colleges and click MS in Computer Science &Engg under MS Colleges
			
			WebElement element = driver.findElementByXPath("//div[@id='mypanel']/div/ul/li[3]/label[text()='Colleges ']");
			
			Actions builder = new Actions(driver);
			
			builder.moveToElement(element).perform();
			
			driver.findElementByXPath("//div[@class='drpdwn-Rgt']//li/label[@class='menuTab-div mesublabel']/following-sibling::ul[@class='sub-sub-menu mesubdiv']//li/a[text()='MS in Computer Science &Engg']").click();
		
		    //Select GRE under Exam Accepted and Score 300 & Below 
			
			
			
			WebElement element4 = driver.findElementByXPath("//div[@class='overview']/ul/li/label/p[text()='GRE']");
			
            JavascriptExecutor executor = (JavascriptExecutor)driver;
			
			executor.executeScript("arguments[0].click();", element4);
			
			driver.findElementByXPath("//div[@class='cokkie-box']/div/a[text()='OK']").click();
			
			
		   WebElement element2 = driver.findElementByXPath("//div[@class='filter-dropdown flLt']/select[@name='examsScore[]']");
			
		   JavascriptExecutor executor2 = (JavascriptExecutor)driver;
			
			executor2.executeScript("arguments[0].click();", element2);
		   
		   
			Select se = new Select(element2);
			
			se.selectByVisibleText("300 & below");
			
			//Max 10 Lakhs under 1st year Total fees, USA under countries
			
			
			wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//div[@class='overview']/ul/li/label//span/following-sibling::p[text()='Max 10 Lakhs']")));
			
			
			WebElement element6 = driver.findElementByXPath("//div[@class='overview']/ul/li/label//span/following-sibling::p[text()='Max 10 Lakhs']");
			
             JavascriptExecutor executor3 = (JavascriptExecutor)driver;
			
			executor3.executeScript("arguments[0].click();", element6);
			
			
			WebElement element5 = driver.findElementByXPath("//ul[@class='refine-list']//input[@id='country-3']/following::label//p/a[text()='USA']/ancestor::label/span");			
			 JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				
			executor1.executeScript("arguments[0].click();", element5);
			
			
			
			// Select Sort By: Low to high 1st year total fees 
			
		
			
		
		
		  wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById(
		  "categorySorter")));
		  
		  WebElement element3 = driver.findElementById("categorySorter");
		  
		  
		  Thread.sleep(7000);
		  
		  
		  Select se1 = new Select(element3);
		  
		  se1.selectByVisibleText("Low to high 1st year total fees");
		 
		 
		 
		 
			
		//Click Add to compare of the College having least fees with Public University, Scholarship and Accomadation
		   
		
			
			
			 List<WebElement> list =  driver.findElementsByXPath("//div[contains(@class,'univ-tab-details')]//div[contains(@id,'categoryPageListing')]//p/following::span[@class='font-11']/preceding-sibling::a");
			 
			 System.out.println(list.size());
			 
			 List<Double> list1 = new ArrayList<Double>();
			
			for (int i=0 ;i<list.size();i++)
				
			{
				
			  String text = list.get(i).getText();
		       
		       
		   List<WebElement> list2 = driver.findElementsByXPath("//div[contains(@id,'categoryPageListing')]//p/following::p/a[text()='"+text+"']/following::div[@class='detail-col flLt'][3]/p/span[@class='tick-mark']");
			
		   int size = list2.size();
		   
		   if (size==3)
			   
		   {
			  
			   
			String text2 = driver.findElementByXPath("//div[contains(@id,'categoryPageListing')]//p/following::p/a[text()='"+text+"']/following::div[3]/div/strong[text()=' 1st Year Total Fees']/following-sibling::p").getText();
			   
			 System.out.println(text2);
			 
			 String text3 = text2.replaceAll("[^0-9.]","");
			 
			 System.out.println(text3);
			 
			 double d = Double.parseDouble(text3);
			 
			 list1.add(d);
		   
		   
		   }
		   
		   Collections.sort(list1);
		   
		   Double double1 = list1.get(0);
		   
		
			//7) Select the first college under Compare with similar colleges 
		   
			Thread.sleep(5000);
			driver.findElementByXPath("//ul[@class=\"sticky-suggestion-list\"]/li[1]").click();
			
			//8) Click on Compare College>
			driver.findElementByXPath("//strong[text()='Compare Colleges >']").click();
			
			//9) Select When to Study as 2021
			boolean selected = driver.findElementByXPath("//strong[text()=\"2021\"]/parent::p//parent::label/span").isSelected();
			if (selected == false) {
				driver.findElementByXPath("//strong[text()=\"2021\"]/parent::p//parent::label/span").click();
			}
			
			//10) Select Preferred Countries as USA
			action.moveToElement(driver.findElementByXPath("//div[@class=\"sp-frm selectCountryField signup-fld invalid \"]")).click().perform();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//label[text()[normalize-space()='USA']]/span")));
			driver.findElementByXPath("//label[text()[normalize-space()='USA']]/span").click();
			driver.findElementByXPath("//a[text()=\"ok\"]").click();
			
			//11) Select Level of Study as Masters
			driver.findElementByXPath("//strong[text()=\"Masters\"]/parent::p//parent::label/span").click();
			
			//12) Select Preferred Course as MS
			action.moveToElement(driver.findElementByXPath("//div[text()=\"Preferred Course\"]/parent::div")).click().perform();
			driver.findElementByXPath("//li[text()=\"MS\"]").click();
			
			//13) Select Specialization as "Computer Science & Engineering"
			Thread.sleep(5000);
			action.moveToElement(driver.findElementByXPath("//div[@class=\"sp-frm selectField signup-fld invalid  filled\"]")).click().perform();
			driver.findElementByXPath("//li[text()=\"Computer Science & Engineering\"]").click();
			
			//14) Click on Sign Up
			js.executeScript("window.scrollBy(0,600)");
			driver.findElementById("signup").click();
			
			//15) Print all the warning messages displayed on the screen for missed mandatory fields
			List<WebElement> ele = driver.findElementsByXPath("//div[@class=\"helper-text\"][contains(text(),'Please')]");
			for (int i = 1; i <=ele.size(); i++) {
				String text = driver.findElementByXPath("(//div[@class=\"helper-text\"][contains(text(),'Please')])["+i+"]").getText();
				if (text.length() > 0) {
					System.out.println(text);
				}
			}
		}

	}
			
			
			
			
			
			}
			
			
	}
}
	
		  
		   
	   
			 
			
			
