package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
                "F:\\Selenium Testing\\OOPS Concept\\driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://shop.demoqa.com/";
  		driver.get(baseUrl);
  		driver.manage().window().maximize();
  		Thread.sleep(2000);
  		
  		String title = driver.getTitle();
  		int titleLength = driver.getTitle().length();
  		System.out.println(title);
  		System.out.println(titleLength);
  		
  		String CurrentUrl = driver.getCurrentUrl();
  		System.out.println(CurrentUrl);
  		
  		if(CurrentUrl.equals(baseUrl)){
  			System.out.println("Verification Successful");
  		}
  		else {
  			System.out.println("Verification Failed You have opened incorrect url:"+baseUrl);
  			
  		}
  		
  		driver.quit();
	}

}
