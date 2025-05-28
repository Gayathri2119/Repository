package Nationalities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Nationalities {
	
	WebDriver driver;
	
	
	@Given("user enter launch the browser")
	public void user_enter_launch_the_browser() {
		
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	@Then("user enter Url as {string}")
	public void user_enter_url_as(String URL) {
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}
	@Then("user enters username as")
	public void user_enters_username_as(io.cucumber.datatable.DataTable dataTable) {
		
		String username = dataTable.cell(0, 0);
		String password = dataTable.cell(0, 1);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	    
	    
	}
	@When("go to Nationalities page")
	public void go_to_nationalities_page() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")).click();
	    
	}
	@Then("Create Nationalities Record")
	public void create_nationalities_record(io.cucumber.datatable.DataTable dataTable) {
		
		List<List<String>>NationalitiesRecord= dataTable.cells();
		for (int i=0; i<NationalitiesRecord.size(); i++) {
			
			String  NationalitieName = NationalitiesRecord.get(i).get(0);
			
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("NationalitieName");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
			
		}
	}
	@Then("user clicks logout button")
	public void user_clicks_logout_button() {
	    
	}
	@Then("close the browser")
	public void close_the_browser() {
	   
	}

}
