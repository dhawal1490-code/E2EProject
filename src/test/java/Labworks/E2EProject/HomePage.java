package Labworks.E2EProject;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pajeobjects.LandingPage;
import pajeobjects.LoginPage;

public class HomePage extends base{
	private static Logger log = LogManager.getLogger(base.class.getName());
	
	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException{
		log.info("Test Case Started");
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	//@Test(dataProvider = "getData")
	@Test
	public void basePageNavigation() throws IOException{

		WebDriverWait wait = new WebDriverWait(driver, 15);

		LandingPage l= new LandingPage(driver,wait);
		//l.getLogin().click();
		Assert.assertEquals(l.getTitle(),"QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
	}
	
	@AfterTest
	public void tearDown(){
		log.info("Test Case Ended");
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[2][3];
		data[0][0]="abc@gmail.com";
		data[0][1]="abc";
		data[1][2]="non restricted user";
		
		data[1][0]="xyz.gmai.com";
		data[1][1]="xyz";
		data[1][2]="non restricted user";
		
		data[0][0]="abc@gmail.com";
		data[0][1]="abc";
		data[1][2]="non restricted user";
		
		data[1][0]="xyz.gmai.com";
		data[1][1]="xyz";
		data[1][2]="non restricted user";
		
		data[0][0]="abc@gmail.com";
		data[0][1]="abc";
		data[1][2]="non restricted user";
		
		data[1][0]="xyz.gmai.com";
		data[1][1]="xyz";
		data[1][2]="non restricted user";
		
		data[0][0]="abc@gmail.com";
		data[0][1]="abc";
		data[1][2]="non restricted user";
		
		data[1][0]="xyz.gmai.com";
		data[1][1]="xyz";
		data[1][2]="non restricted user";
		
		data[0][0]="abc@gmail.com";
		data[0][1]="abc";
		data[1][2]="non restricted user";
		
		data[1][0]="xyz.gmai.com";
		data[1][1]="xyz";
		data[1][2]="non restricted user";
		
		data[0][0]="abc@gmail.com";
		data[0][1]="abc";
		data[1][2]="non restricted user";
		
		data[1][0]="xyz.gmai.com";
		data[1][1]="xyz";
		data[1][2]="non restricted user";
		
		data[0][0]="abc@gmail.com";
		data[0][1]="abc";
		data[1][2]="non restricted user";
		
		data[1][0]="xyz.gmai.com";
		data[1][1]="xyz";
		data[1][2]="non restricted user";
		
		data[0][0]="abc@gmail.com";
		data[0][1]="abc";
		data[1][2]="non restricted user";
		
		data[1][0]="xyz.gmai.com";
		data[1][1]="xyz";
		data[1][2]="non restricted user";
		
		
		return data;
	}
}
