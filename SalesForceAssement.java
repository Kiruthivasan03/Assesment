package assesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceAssement {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("earth@testleaf.com");
		driver.findElementById("password").sendKeys("Bootcamp$123");
		driver.findElementById("Login").click();

		Thread.sleep(4000);
		driver.findElementByXPath("//div[@class='slds-icon-waffle']").click();
		driver.findElementByXPath("//button[text()='View All']").click();
		
		WebElement app = driver.findElementByXPath("//p[text()='Contracts']");
		driver.executeScript("arguments[0].click();", app);
		Thread.sleep(4000);
		driver.findElementByXPath("//a[contains(@class,'slds-button')]//*[@data-key='chevrondown']").click();
		Thread.sleep(5000);
		WebElement clickNewContarct = driver.findElementByXPath("//span[text()='New Contract']");
		driver.executeScript("arguments[0].click();", clickNewContarct);
		
		WebElement clickAcc = driver.findElementByXPath("//div[contains(@class,'autocompleteWrapper')]/input[@title='Search Accounts']");
		driver.executeScript("arguments[0].click();", clickAcc);
		
		WebElement clickAccoption = driver.findElementByXPath("//div[@title='testcom']");
		driver.executeScript("arguments[0].click();", clickAccoption);
		Thread.sleep(5000);
		
		WebElement clickDate = driver.findElementByXPath("(//div[@class='form-element'])[3]");
		driver.executeScript("arguments[0].click();", clickDate);
		
		Thread.sleep(5000);
		WebElement selectDate = driver.findElementByXPath("//table[@class='calGrid']/tbody[1]/tr[2]/td[4]/span[1]");
		driver.executeScript("arguments[0].click();", selectDate);
		
		
		
		Thread.sleep(5000);
		WebElement entermonth = driver.findElementByXPath("//input[@class='input uiInputSmartNumber']");
		driver.executeScript("arguments[0].click();", entermonth);
		entermonth.sendKeys("6");
		
		WebElement save = driver.findElementByXPath("(//span[text()='Save'])[2]");
		driver.executeScript("arguments[0].click();", save);
		
		WebElement getCintarctID = driver.findElementByXPath("//(//div[contains(@class,'slds-page-header__title slds-m-right--small')])[3]");
		String id = getCintarctID.getText();
		
		System.out.println(id);
		
		
		
		
	}

}
