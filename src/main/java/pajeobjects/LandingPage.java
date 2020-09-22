package pajeobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

	public WebDriver driver;
	public WebDriverWait wait;
	
	public LandingPage(WebDriver driver, WebDriverWait wait){
		this.driver = driver;
		this.wait = wait;
	}
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By popupclose= By.className("sumome-react-wysiwyg-close-button");
	
	@FindBy(name="test")WebElement username;
	
	public WebElement usename(){
		return username;		 
	}
	
	public WebElement getLogin(){
		return driver.findElement(signin);		 
	}
	
	public WebElement closePopup(){
		wait.until(ExpectedConditions.invisibilityOfElementLocated(popupclose));
		return driver.findElement(popupclose);
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	
	
}
