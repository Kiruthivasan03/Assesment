package assesment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableAssesment {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		  List<WebElement> table = driver.findElementsByXPath("//table[@id='customers']");
		  
		  List<WebElement> tableRows=driver.findElementsByXPath("//table[@id='customers']//tr");
		  
		//  System.out.println(tableRows.size());
		  
		  
		  List<WebElement> tableHeaders=driver.findElementsByXPath("//table[@id='customers']//tr/th");
		  
		  for(int i=0; i<tableHeaders.size();i++) {
				WebElement data = tableHeaders.get(i);				
				String th = data.getText();
				System.out.println(th);
				
		  }
				
				List<WebElement> tabcol = driver.findElementsByXPath("//table[@id='customers']//tr/td");
				for(int j=0; j<tabcol.size();j++) {
					
					WebElement tdata = tabcol.get(j);				
					String td = tdata.getText();
					System.out.println(td);
									
							
				
				
				}
		  
		

	}

}
