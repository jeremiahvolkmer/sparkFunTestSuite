package stepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
public class Login 
{
	private WebDriver driver; 
	
	
	@Before 
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver", "/home/bluedog/Program/spark_fun_test_suite/sparkFun/src/test/resources/geckodriver");
		this.driver = new FirefoxDriver(); 
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		System.out.println("hello gerkin!");
	}
	
	@After
	public void tearDown()
	{
		this.driver.manage().deleteAllCookies();
	//  this.driver.quit();
	//  this.driver = null; 
	}
	
	@Given("^User navigates to stackoverflow website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actionsAk
		System.out.println("this is method one");
	}
	
	@And("^User clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is method two");
	   
	}

	@Then("^User should be taken to the login window$")
	public void user_should_be_taken_to_the_login_window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is method three");
	  
	}
	
}
