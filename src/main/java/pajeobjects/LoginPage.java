package pajeobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public WebDriver driver;
	public WebDriverWait wait;
	
	public LoginPage(WebDriver driver, WebDriverWait wait){
		this.driver = driver;
		this.wait = wait;
	}
	
	By emailid = By.id("user_email");
	By password = By.id("user_password");
	By login = By.cssSelector("input[value='Log In']");
	By title = By.xpath("/html/body/div/header/nav/div/ul/li/a/span");
	
	
	public WebElement emailID(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailid));
		return driver.findElement(emailid);
	}
	
	public WebElement password(){
		return driver.findElement(password);
	}

	public WebElement login(){
		return driver.findElement(login);
	}

	public String getTitle(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(title));
		return driver.findElement(title).getText();
	}

}
