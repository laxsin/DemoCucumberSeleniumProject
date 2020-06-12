package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class launchwebsiteStep {

	WebDriver driver ;
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AT_workspace\\DemoProject\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://www.google.com");
		
		System.out.println("Launch google");
		
	}
	
	@Given("^I launch Google website$")
	public void launchGoogle() throws InterruptedException {
		launch();
		System.out.println("Launch google");
	}
	
	@Then("^I verify title$")
	public void verifyTitle() {
		System.out.println("Verify title");
	}
	
	@Then("^I close the browser$")
	public void closeBrowser() {
		
		driver.quit();
	}
}
