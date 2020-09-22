package pajeobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rahulShettyPage {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public rahulShettyPage(WebDriver driver, WebDriverWait wait){
		this.driver = driver;
		this.wait = wait;
	}
	By radiobutton;
	
	public WebElement clickRadiobutton(String radio_id){
		By radiobutton = By.cssSelector("input[value='"+radio_id+"']");
		return driver.findElement(radiobutton);		 
	}
}
