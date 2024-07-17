package testNGBasic;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XmlExample {
	
	WebDriver driver;

    @Test  
    public void TC_openUrl() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();  // Initialize the class-level driver instance
        driver.get("https://google.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void TC_verifyTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();  // Initialize the class-level driver instance
        driver.get("https://google.com/");
        driver.manage().window().maximize();
        
        String title = driver.getTitle();
        System.out.println(title);
    }
    

}
