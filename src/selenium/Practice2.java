
//Navigation command practice
package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Selenium Testing\\OOPS Concept\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://shop.demoqa.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
		
		String Url = "https://www.DemoQA.com";
		driver.navigate().to(Url);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.navigate().refresh();
		
		driver.navigate().back();
		driver.close();		
	}

}
