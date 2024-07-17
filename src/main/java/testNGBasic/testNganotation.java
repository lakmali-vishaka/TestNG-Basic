package testNGBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNganotation {
public void BeforSuite() {
		
		System.out.println("generate report logic-1 BeforeSuite will execute only once  ");
		
	}
	
	 @BeforeTest
	public void BeforTest() {
		
		System.out.println("reading excel sheet data logic-2  BeforeTest will execute only once");
		
	}
	
	 @BeforeGroups  
	public void BeforeGroups() {
		
		System.out.println("creating a group data logic");
		
	}
	 
	 @BeforeClass
	public void BeforeClass() {
		
		System.out.println("Create different class objects-3  BeforeClass will execute only once");
		
	}
	
	 @BeforeMethod 
	public void BeforeMethod() {
		
		System.out.println("Open a URL-4  BeforeMethod will execute with every testcase");
		
	}
	
	
	
	 @Test
	
    public void Test1() {
		
		System.out.println("Teat1-5");
		
	}
	 
	 @Test
		
	    public void Test2() {
			
			System.out.println("Teat1-5-2");
			
		}
	
	@AfterMethod 
	public void AfterMethod() {
		
		System.out.println("close a browser- 6 AfterMethod will execute with every testcase");
		
	}
	
	 @AfterClass 
	public void AfterClass() {
		
		System.out.println("quit browser-7 AfterClass will execute only once");
		
	}
	
	@AfterGroups  
	public void AfterGroups() {
		
		System.out.println("Flushina a reportr");
		
	}
	
	 @AfterTest  
	public void AfterTest() {
		
		System.out.println("AfterTest-8");
		
	}
	
	 @AfterSuite  
	public void AfterSuite() {
		
		System.out.println("AfterSuite- 9 AfterSuite will execute only once");
		
	}


}
