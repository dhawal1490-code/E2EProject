package Labworks.E2EProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pajeobjects.LoginPage;

public class base {

	public WebDriver driver;
	public Properties prop;
	public WebDriverWait wait;	

	@BeforeTest
	public void initialize() throws IOException{
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 15);

		LoginPage l= new LoginPage(driver,wait);
		l.emailID().sendKeys("dhawal.mokashi");
		l.password().sendKeys("gunman14");
		l.login().click();

	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

	public WebDriver initializeDriver() throws IOException{
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Automation1\\E2EProject\\src\\main\\java\\resources\\data.properties");
	
		prop.load(fis);
		String browserName =prop.getProperty("browser");
	
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\CrDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("mozila")) {
			System.setProperty("webDriver.gecko.driver","D:\\SeleniumDrivers\\MDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void takeScreenshot(){
		//File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	}
	
}
