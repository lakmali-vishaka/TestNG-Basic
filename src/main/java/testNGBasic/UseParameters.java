package testNGBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UseParameters {
	
	WebDriver driver;
	
	
    @Parameters({"url"})
	@Test
	public void TC_openUrl(String urlValue) throws InterruptedException {
		
		  System.out.println("TC_verifyTitle");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
	      driver = new ChromeDriver();  
	      
	      driver.get(urlValue);
	      driver.manage().window().maximize();
	      Thread.sleep(5000);
	      
	     
		
	}
	
}
