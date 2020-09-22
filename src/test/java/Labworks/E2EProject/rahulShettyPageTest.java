package Labworks.E2EProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pajeobjects.LandingPage;
import pajeobjects.rahulShettyPage;

public class rahulShettyPageTest extends base{
	
	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException{
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void testControls() throws IOException{

		WebDriverWait wait = new WebDriverWait(driver, 15);

		rahulShettyPage rs= new rahulShettyPage(driver,wait);
		System.out.println(rs.clickRadiobutton("radio1").isSelected());
		rs.clickRadiobutton("radio1").click();
		System.out.print(rs.clickRadiobutton("radio1").isSelected());
		//l.getLogin().click();
		//Assert.assertEquals(l.getTitle(),"QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
			
	}	
}
