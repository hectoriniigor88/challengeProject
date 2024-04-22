package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

	public class WebDriverSetup {
		
		public WebDriver driver;

	    @BeforeTest
	    public void setUp(){
	        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://localhost:3000/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	    }

	    @AfterTest
	    public void close(){
	        driver.close();
	    }
	}