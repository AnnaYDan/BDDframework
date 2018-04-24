package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginLogoutPassingValues {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("^I am on at newtours homepage \"(.*?)\"$")
	public void i_am_on_at_newtours_homepage(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("^I insert username = \"(.*?)\" and password =\"(.*?)\"$")
	public void i_insert_username_and_password(String name, String pass) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();//
		driver.findElement(By.name("userName")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(pass);
	}

	@When("^click login button$")
	public void click_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.name("login")).click();
	}

	@Then("^\"(.*?)\" link should be displayed$")
	public void link_should_be_displayed(String link) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertTrue(driver.findElement(By.linkText(link)).isDisplayed());
		
		driver.close();
	}


}
