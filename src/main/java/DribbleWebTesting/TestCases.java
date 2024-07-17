package DribbleWebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {
	WebDriver driver;

    @BeforeMethod  
    public void oPenUrl() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();  // Initialize the class-level driver instance
        driver.get("https://dribbble.com/session/new");
        driver.manage().window().maximize();
    }

    @Test
    public void TC_signIn() throws InterruptedException {
        driver.findElement(By.id("login")).sendKeys("vishakalakasha"); 
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.xpath("//input[@data-cypress = 'submit-sign-in-btn']")).click();
        Thread.sleep(6000);
        
    }
    
    @Test
    public void TC_updateProfileName() throws InterruptedException {
    	
    	 driver.findElement(By.id("login")).sendKeys("vishakalakasha"); 
         driver.findElement(By.id("password")).sendKeys("12345678");
         driver.findElement(By.xpath("//input[@data-cypress = 'submit-sign-in-btn']")).click();
         Thread.sleep(6000);
    	
    	//click profile 
    	
    	driver.findElement(By.xpath("(//a[@data-nav-v2-avatar='true'])")).click();
    	
    	//click setting
    	driver.findElement(By.xpath("(//a[@data-nav-event-clicked=\"Settings\"='true'])")).click();
    	Thread.sleep(6000);
    	
    	//edit profile
        driver.findElement(By.xpath("(//a[text()='Edit Profile'])[1] ")).click(); 
    	Thread.sleep(6000);
    	
    	//clear name
    	driver.findElement(By.id("user_login")).clear();
    	Thread.sleep(6000);
    	//add new name
    	
    	driver.findElement(By.id("user_login")).sendKeys("VL");
    	Thread.sleep(6000);
    	//save name
    	 driver.findElement(By.xpath("//input[@value='Save Changes']")).click(); 

        
        
        
       
    }

    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}


