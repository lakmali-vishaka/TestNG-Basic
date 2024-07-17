package testNGBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SoftDependency {
WebDriver driver;
	
	/* // soft dependency depend on one method 
	
	@Test(priority = 1)
	public void TC1_openUrl() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
	        driver = new ChromeDriver();  // Initialize the class-level driver instance
	        driver.get("https://google.com/");
	        
		
	}
	
	
	
	@Test(priority = 2)
	public void TC2_Maximize() {
		  
	        driver.manage().window().maximize();
		
	}
	
	
	
	@Test(dependsOnMethods="TC1_openUrl",alwaysRun=true)
	
     public void TC3_verifyingTitle() {
    	 
    	 String title = driver.getTitle();
    	 System.out.println(title);
    	
    	 
    	 Assert.assertEquals(title,"Google");
    	 
		
	}
	
	

	//soft dependency depend on two methods
	@Test(dependsOnMethods={"TC1_openUrl","TC2_Maximize"},alwaysRun=true)
	
     public void TC4_verifyingTitle2() {
    	 
    	 String title = driver.getTitle();
    	 System.out.println(title);
    	
    	 
    	 Assert.assertEquals(title,"Google");
    	 
	}
	*/

//soft dependency depend on groups

	@Test(groups= {"login"})
	public void TC1_openUrl() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
	        driver = new ChromeDriver();  // Initialize the class-level driver instance
	        driver.get("https://google.com/");
	        
		
	}
	
	
	
	@Test(groups= {"Home"})
	public void TC2_Maximize() {
		  
	        driver.manage().window().maximize();
		
	}
	
	
	//can define list of groups also
	@Test(dependsOnGroups="Login",alwaysRun=true)
	
  public void TC3_verifyingTitle() {
 	 
 	 String title = driver.getTitle();
 	 System.out.println(title);
 	
 	 
 	 Assert.assertEquals(title,"Google");
 	 
		
	}
	
	

	//soft dependency depend on two methods
	@Test(dependsOnMethods={"Loginl","Home"},alwaysRun=true)
	
  public void TC4_verifyingTitle2() {
 	 
 	 String title = driver.getTitle();
 	 System.out.println(title);
 	
 	 
 	 Assert.assertEquals(title,"Google");
 	 
	}
	



}
