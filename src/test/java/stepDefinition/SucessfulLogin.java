package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SucessfulLogin {

	public WebDriver driver;

	@Given("User should hv launched application")
	public void user_should_hv_launched_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
	}

	@When("valid userid and password entered")
	public void valid_userid_and_password_entered() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("manipal822@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("manipal123");
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@type= 'submit' and @value='Log in']")).click();
	}

	@Then("homescreen should be displayed on sucessful login")
	public void homescreen_should_be_displayed_on_sucessful_login() {
		String pageTitle1 = driver.getTitle();
		System.out.println(pageTitle1);
	}
}
