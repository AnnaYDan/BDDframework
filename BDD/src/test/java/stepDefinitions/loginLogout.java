package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginLogout {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("^I am on the travel portal \"(.*?)\"$")
	public void i_am_on_the_travel_portal(String url) throws Throwable {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("^I type login = \"(.*?)\" and password = \"(.*?)\"$")
	public void i_type_login_and_password(String userName, String password) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("^I click sing-in button$")
	public void i_click_sing_in_button() throws Throwable {
		driver.findElement(By.name("login")).click();
	}

	@Then("^I shoud get \"(.*?)\" link$")
	public void i_shoud_get_link(String link) throws Throwable {
		//Assert.assertTrue(driver.findElement(By.linkText(link)).isDisplayed());
		boolean check = driver.findElement(By.linkText(link)).isDisplayed();
		Assert.assertTrue(check);
		driver.quit();
	}
}
