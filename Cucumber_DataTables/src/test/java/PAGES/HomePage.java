package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public void HomePageDriver(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		
	}
	
	public void Logout() {

	}
	
	public void Close() {

	}

}


