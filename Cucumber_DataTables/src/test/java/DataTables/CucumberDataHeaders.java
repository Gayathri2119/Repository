package DataTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAGES.HomePage;
import PAGES.LoginPage;
import PAGES.SkillsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberDataHeaders {
	
	WebDriver driver;
	
	LoginPage LP;
	SkillsPage SP;
	HomePage HP;
	
	
	@Given("user enter launch the browser")
	public void user_enter_launch_the_browser() {
		
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}
	@Then("user enter Url as {string}")
	public void user_enter_url_as(String URL) {
		
		LP = new LoginPage();
		LP.LoginPageDriver(driver);
	    LP.OpenURL(URL);
		
		 }
	@Then("user enters username as")
	public void user_enters_username_as(io.cucumber.datatable.DataTable dataTable) {
		
		String username = dataTable.cell(0, 0);
		String password = dataTable.cell(0, 1);
		LP.LoginPageDriver(driver);
		LP.Login(dataTable);
		
	}
	@When("go to skills page")
	public void go_to_skills_page() throws Throwable {
		
		SP = new SkillsPage();
		SP.SkillsPageDriver(driver);
		SP.Skills();

		
	    
	}
	@Then("Create skills Record")
	public void create_skills_record(io.cucumber.datatable.DataTable dataTable) throws Throwable {
		
			
			SP.SkillsPageDriver(driver);
			SP.SkillsRecord(dataTable);
			
		}
		
	   
 
	
	
	
	@Then("user clicks logout button")
	public void user_clicks_logout_button() {
	    
		HP= new  HomePage();
		HP.HomePageDriver(driver);
		HP.Logout();
	
	}
	@Then("close the browser")
	public void close_the_browser() {
		
		HP.HomePageDriver(driver);
		HP.Close();
	    
		
	}
}
