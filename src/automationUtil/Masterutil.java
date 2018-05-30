package automationUtil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Masterutil {

	private static WebDriver driver;
	
	/*//******
	public void driver(String odr)
	{
		String driver = odr; 
	}
	//*******
*/	
	public static void launchapp ()
	{	
		//start the browser
		driver = new FirefoxDriver();
		
		//launch the link
		driver.get("http:/amazon.in");
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	}
	
	//close the link
	public static void getbasicinfo(){
		
		System.out.println("URL is :: "+ driver.getCurrentUrl());
		System.out.println("Page Title is ::"+ driver.getTitle());
	}
	
	//get the info about the link
	public static void logout() {

		driver.close();
	}
	public static String search(String sProduct) {
		
		
		WebElement searchtext = driver.findElement(By.id("twotabsearchtextbox"));
		searchtext.sendKeys(sProduct);
		searchtext.sendKeys(Keys.RETURN);
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		driver.findElement(By.cssSelector("span.nav-line-1"));
		String stitle = driver.getTitle();
		return stitle  ; 

	}
}