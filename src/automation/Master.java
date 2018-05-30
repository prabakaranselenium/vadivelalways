package automation;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import automationUtil.*;
import autoExt.*;

public class Master {
	
	public static void main (String[] args){
	
		Masterutil.launchapp();
		Masterutil.getbasicinfo();

		/*doubt
		String sSearchProduct = MasterExt.search("Biba");
		MasterExt.search("Biba");
		doubt*/
		
		//String ext = Masterutil.search("Biba");
		String ext = MasterExt.search("Biba");
		
		System.out.println("Result ::"+ext);
	}
}