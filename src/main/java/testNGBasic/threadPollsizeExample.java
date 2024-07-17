package testNGBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class threadPollsizeExample {
	WebDriver driver;

    @Test  (invocationCount=5,threadPoolSize=3) 
    public void TC_openUrl() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();  // Initialize the class-level driver instance
        driver.get("https://google.com/");
        driver.manage().window().maximize();
    }

}
