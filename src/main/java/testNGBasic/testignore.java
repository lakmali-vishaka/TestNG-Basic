package testNGBasic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;




public class testignore {
	
	WebDriver driver;
	
	/* first method
	
	@Test(enabled=false)
	public void TC_openUrl() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
	        driver = new ChromeDriver();  
	        driver.get("https://google.com/");
	        
	        driver.manage().window().maximize();
	        
		
	}
	
	

	@Test()
	public void TC_Verifytitle() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
	        driver = new ChromeDriver();  
	        driver.get("https://google.com/");
	        
	        driver.manage().window().maximize();
	        String title=driver.getTitle();
	        System.out.println(title);
	        Assert.assertEquals(title,"Google");
	        
	        
		
	}
	
	*/
	
	// Second method
	
	@Ignore

	@Test()
	public void TC_openUrl() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
	        driver = new ChromeDriver();  
	        driver.get("https://google.com/");
	        
	        driver.manage().window().maximize();
	        
		
	}
	
	

	@Test()
	public void TC_Verifytitle() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
	        driver = new ChromeDriver();  
	        driver.get("https://google.com/");
	        
	        driver.manage().window().maximize();
	        String title=driver.getTitle();
	        System.out.println(title);
	        Assert.assertEquals(title,"Google");
	        
	        
		
	}
}
