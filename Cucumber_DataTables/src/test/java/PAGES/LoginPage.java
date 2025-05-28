package PAGES;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement USERNAME;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement PASSWORD;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LOGINBTN;
	
	
	public void LoginPageDriver(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	
public void OpenURL(String URL) {
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	   }
@Then("user enters username as")
public void Login(io.cucumber.datatable.DataTable dataTable) {
	
	String username = dataTable.cell(0, 0);
	String password = dataTable.cell(0, 1);
	USERNAME.sendKeys(username);
	PASSWORD.sendKeys(password);
	LOGINBTN.click();
	
}
}









