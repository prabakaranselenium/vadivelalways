package autoExt;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import automationUtil.Masterutil;;
public class MasterExt  {
private static WebDriver driver;
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