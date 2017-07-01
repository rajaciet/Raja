package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_steps {
	
	
	
	public static WebDriver driver=null;
	
	
	
	@Given("^when user in homepage$")
	public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Automation\\geckodriver.exe");
		 driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.priorityplumbing.co.uk");
		}

	@When("^user click on signin link$")
	
	public void user_click_signin() throws Throwable {
		 driver.findElement(By.xpath("html/body/main/header/div[2]/div[1]/div[2]/ul/li[2]/a")).click();
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  Thread.sleep(10000);
		  
	}
	
	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	
	public void usernamepassword(String username, String password) throws InterruptedException
	
	{
	driver.findElement(By.id("j_username")).sendKeys(username);
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  Thread.sleep(10000);
		  driver.findElement(By.id("j_password")).sendKeys(password);
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  Thread.sleep(10000);
		  driver.findElement(By.xpath(".//*[@id='loginForm']/div[3]/div[3]/button")).click();
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  Thread.sleep(10000);
	}
	
	@Then("^message displayed login successfully$")
	
	public void message() throws Throwable
	
	{
		
		System.out.println("Login successfully");
	}
}
