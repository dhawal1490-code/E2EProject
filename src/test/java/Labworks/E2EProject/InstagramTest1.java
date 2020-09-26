package Labworks.E2EProject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pajeobjects.LandingPage;
import pajeobjects.LoginPage;

public class InstagramTest1 extends base{
	
		
	//@Test(dataProvider = "getData")
	@Test
	public void getscribblestoriesdata() throws IOException, InterruptedException{
		
		LandingPage lp= new LandingPage(driver,wait);
		//lp.searchtext().sendKeys("gulzar.ki.shayari");
		lp.searchtext().sendKeys("thescribbledstories");
		lp.searchElementScribbledStories().click();
		List<WebElement> articles = lp.getArticles();
		System.out.print(articles.size());
		articles.get(0).click();
		String imgvalue = "https://instagram.fpnq3-1.fna.fbcdn.net/v/t51.2885-19/s150x150/22638651_154564318478119_6512702289541595136_n.jpg?_nc_ht=instagram.fpnq3-1.fna.fbcdn.net&_nc_ohc=yqkltsyNwG0AX_3iZns&oh=cfe88cf48e6089b8cb2d72218a1a3cd5&oe=5F989841";
		for(int i = 0;i<2;i++){
			lp.clickNext().click();
			try{
				String tmpimagevalue = driver.findElement(By.xpath("//section[@class='EDfFK ygqzn']//img")).getCssValue("src");
					System.out.println(driver.getCurrentUrl());
			}
			catch(Exception e){
			}
		}
		lp.closeDialog().click();
		lp.menuicon().click();
		lp.logout().click();
	}	
	
}
