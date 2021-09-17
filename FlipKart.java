package assesment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
					
					ChromeDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					
					driver.get("https://www.flipkart.com/");
					
					Thread.sleep(3000);
					
				driver.findElementByXPath("(//button)[2]").click();
				
				WebElement Fashion = driver.findElementByXPath("//div[text()='Fashion']");
				
				Actions ac=new Actions(driver);
				ac.moveToElement(Fashion).perform();
				
				driver.findElementByXPath("//a[contains(text(),'s Bottom Wear')]").click();
				Thread.sleep(2000);
				
				driver.executeScript("window.scrollBy(0,400)");
				
				Thread.sleep(3000);
				
				WebElement startPricefrom=driver.findElementByXPath("(//div[@class='_15GU70']//div)[1]");
				
			//	WebElement startPriceto=driver.findElementByXPath("(//div[@class='_15GU70']//div)[4]");
				
			//	ac.dragAndDrop(startPricefrom, startPriceto).perform();
				ac.dragAndDropBy(startPricefrom, 0, 1).perform();
				
				System.out.println("Success");
				
				
	}
	
}
