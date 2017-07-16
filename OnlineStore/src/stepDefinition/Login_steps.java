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
	
	@Given("^user is on home page1$")
	public void user_is_on_Home_Page1() throws Throwable {
		//System.setProperty("webdriver.gecko.driver", "C:\\\\Automation\\geckodriver.exe");
		 //driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://www.priorityplumbing.co.uk");
		System.out.println("Given works");
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
		Thread.sleep(10000);
	}
	
	@When("^user is on searchpage and click search$")
	
	 public void search() throws InterruptedException {
		 
		driver.findElement(By.xpath(".//*[@id='js-site-search-input']")).sendKeys("THJACT20");
		driver.findElement(By.xpath("html/body/main/header/div[2]/div[2]/div/div/div/form/div/span/button")).click();
		//System.out.println("Entering into PLP");
		Thread.sleep(10000);
		//driver.findElement(By.xpath("html/body/main/div[3]/div[1]/div[2]/div/ul/li[1]/a[3]")).click();
		//Thread.sleep(5000);
			 
		 }
	@Then("^search result displayed$")
	
	public void searchmessage() throws InterruptedException{
		
		System.out.println("search result displayed successfully");
		Thread.sleep(10000);
	}
	
	@When("^user is on PLP and PDP$")
	
	public void PLP() throws InterruptedException
	 
	 {
		 System.out.println("Entering into PLP");
		 driver.findElement(By.xpath("html/body/main/div[3]/div[1]/div[2]/div/ul/li[1]/a[3]")).click();
		Thread.sleep(5000);
		
		System.out.println("Entering into PDP");
		driver.findElement(By.xpath(".//*[@id='addToCartButton']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='addToCartLayer']/a[1]")).click();
		Thread.sleep(5000);
	 }
	
	@Then ("^item added successfully to the basket$")
	
	public void PDPmessage(){
		
		System.out.println("item added successfully to the basket");
	}
	
	@When("^user is on Basketpage$")
	
	public void basketpage() throws InterruptedException{
		 
		 driver.findElement(By.xpath(".//*[@id='basketPaySlot']/div/div[2]/div/button")).click();
		 Thread.sleep(2000);
	 }
	
	@Then("^item ready for payment$")
	
	public void basketmessage() throws InterruptedException{
		
		System.out.println("Item ready for review");
		Thread.sleep(10000);
		
	}
	
	@When("^user is on finalreviewpage$")
	public void Finalreview() throws InterruptedException{
		 
		 
		 //driver.findElement(By.xpath(".//*[@id='extendedAddressForm']/div[1]/div[1]/div/div[1]/div/div/button"))
		 //String city= "Maidstone";
		 //driver.findElement(By.xpath("html/body/main/div[3]/div[3]/div/div/div/div[1]/div/div[1]/ul/div/li/div/div[3]/div/div/div/a")).click();
		 //Thread.sleep(5000);
		 driver.findElement(By.xpath(".//*[@id='extendedAddressForm']/div[1]/div[1]/div/div[1]/div/div/button")).click();
		 driver.findElement(By.xpath(".//*[@id='extendedAddressForm']/div[1]/div[1]/div/div[1]/div/div/div/ul/li[6]/a")).click();
		 driver.findElement(By.name("firstName")).sendKeys("tester");
		 driver.findElement(By.name("lastName")).sendKeys("testing");
		 driver.findElement(By.name("cellphone")).sendKeys("07458");
		 //driver.findElement(By.id("finder")).sendKeys("ME15 6LH, 31A, Lower Stone Street, Maidstone ");
		 //Thread.sleep(15000);
		 System.out.println("issue begins");
		 driver.findElement(By.xpath(".//*[@id='extendedAddressForm']/div[1]/div[1]/div/div[5]/a")).click();
		 System.out.println("issue occurs");
		 Thread.sleep(15000);
		 //driver.findElement(By.xpath(".//*[@id='addressSubmit']")).click();
		 driver.findElement(By.xpath(".//*[@id='address.line1']")).sendKeys("31A Lower Stone Street");
		 driver.findElement(By.xpath(".//*[@id='address.townCity']")).sendKeys("Maidstone");
		driver.findElement(By.xpath(".//*[@id='address.county']")).sendKeys("Kent");
		 driver.findElement(By.xpath(".//*[@id='address.postcode']")).sendKeys("ME156LH");
		 driver.findElement(By.xpath(".//*[@id='countrySelector']/div/div/div/button")).click();
		 driver.findElement(By.xpath(".//*[@id='countrySelector']/div/div/div/div/ul/li[5]/a")).click();
		 Thread.sleep(5000);
		 //driver.findElement(By.xpath(".//*[@id='addressSubmit']")).click();
		 //driver.findElement(By.xpath(".//*[.//*[@id='ui-id-164']//a[contains(.,'"+city+"')]")).submit();
		 Thread.sleep(10000);
		 driver.findElement(By.id("addressSubmit")).click();
		 Thread.sleep(10000);
		 
		 //shipping method
		 
		 driver.findElement(By.xpath("//*[@id='selectDeliveryMethodForm']/div[1]/div/div/div/div/button")).click();
		 //driver.findElement(By.xpath("")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath(".//*[@id='selectDeliveryMethodForm']/div[1]/div/div/div/div/div/ul/li[4]/a/span[1]")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath(".//*[@id='deliveryMethodSubmit']")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath(".//*[@id='extendedAddressForm']/div[1]/div/div[1]/label/span/span[1]")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("html/body/main/div[3]/div[3]/div/div/div[3]/div[3]/div/button")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath(".//*[@id='placeOrderForm1']/div[2]/div/label/span/span[1]")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath(".//*[@id='placeOrder']")).click();
		 Thread.sleep(10000);
	 }
	
	@Then("^product ready for delivery$")
	
	public void deliverymessage(){
		System.out.println("Product ready for delivery");
	}
}







	
	/*@When("^user is on homepage")
	public void jd_login() throws InterruptedException{
		
		//System.setProperty("webdriver.gecko.driver", "C:\\\\Automation\\geckodriver.exe");
		//driver = new FirefoxDriver();
		driver.get("http://www.jdwilliams.co.uk/");
		Thread.sleep(10000);
	}

	
	@When("^user click on signlink")
	
	public void signin() throws InterruptedException{
		
		driver.findElement(By.xpath(".//*[@id='r-hdMenu']/li[2]/a")).click();
		Thread.sleep(15000);
		
	}
	
	@When("^user enters username and password")
	
	public void userdetails() throws InterruptedException{
		
		driver.findElement(By.xpath(".//*[@id='accountNumber']")).sendKeys("test@jdwilliams.co.uk");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Password-1");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='signinForm']/div/div[3]/div/div[2]/a")).click();
	} 
	
	@Then("^ Login Successful")
	
	public void logout()
	
	{
		System.out.println("Signout successful");
	}*/

