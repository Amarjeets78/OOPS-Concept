package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
                "F:\\Selenium Testing\\OOPS Concept\\driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.toolsqa.com/automation-practice-switch-windows/";
  		driver.get(baseUrl);
  		driver.manage().window().maximize();
  		Thread.sleep(2000);
  		driver.close();
	}

}
