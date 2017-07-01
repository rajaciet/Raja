package automationFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class TestNG {
	
	
	
	public WebDriver driver;
	
	
	   
  @Test (priority=0, enabled=false)           //(groups={"User"})
  public void Test() throws InterruptedException {
	 // System.setProperty("webdriver.gecko.driver", "C:\\\\Automation\\geckodriver.exe");
	 // driver=new FirefoxDriver();
	  
	  //driver.get("https://www.priorityplumbing.co.uk");
	  
	  driver.findElement(By.xpath("html/body/main/header/div[2]/div[1]/div[2]/ul/li[2]/a")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/button")).click();
		driver.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div/ul/li[6]/a/span[1]")).click();
		driver.findElement(By.name("firstName")).sendKeys("test");
		driver.findElement(By.name("lastName")).sendKeys("user");
		driver.findElement(By.name("email")).sendKeys("testuser11@gmail.com");
		driver.findElement(By.name("mobileNumber")).sendKeys("07");
		driver.findElement(By.name("phoneNumber")).sendKeys("07");
		driver.findElement(By.name("pwd")).sendKeys("Password-1");
		driver.findElement(By.name("checkPwd")).sendKeys("Password-1");
		driver.findElement(By.xpath(".//*[@id='registerForm']/div[9]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("html/body/main/header/div[2]/div[1]/div[2]/ul/li[3]/a")).click();
		Thread.sleep(10000);
		System.out.println("Website lauched successfully");
		
		Thread.sleep(100000);
		//return null;
	  
	  
  }
  
 @Test (priority=1)             //(groups={"User"})
 public void signin() throws InterruptedException {
	 
	  driver=new FirefoxDriver();
	  
	  driver.get("https://www.priorityplumbing.co.uk");
	 
	 //System.setProperty("webdriver.gecko.driver", "C:\\\\Automation\\geckodriver.exe");
	  driver.findElement(By.xpath("html/body/main/header/div[2]/div[1]/div[2]/ul/li[2]/a")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.id("j_username")).sendKeys("testuser11@gmail.com");
	  Thread.sleep(10000);
	  driver.findElement(By.id("j_password")).sendKeys("Password-1");
	  Thread.sleep(10000);
	  driver.findElement(By.xpath(".//*[@id='loginForm']/div[3]/div[3]/button")).click();
	  
	  Thread.sleep(5000);
  
 }
 
 @Test(priority=2)
 
 public void search() throws InterruptedException{
	 
driver.findElement(By.xpath(".//*[@id='js-site-search-input']")).sendKeys("THJACT20");
driver.findElement(By.xpath("html/body/main/header/div[2]/div[2]/div/div/div/form/div/span/button")).click();
//System.out.println("Entering into PLP");
Thread.sleep(5000);
//driver.findElement(By.xpath("html/body/main/div[3]/div[1]/div[2]/div/ul/li[1]/a[3]")).click();
//Thread.sleep(5000);
	 
 }
 
 @Test(priority=3)
 
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
 
 @Test(priority=4)
 
 public void basketpage() throws InterruptedException{
	 
	 driver.findElement(By.xpath(".//*[@id='basketPaySlot']/div/div[2]/div/button")).click();
	 Thread.sleep(2000);
 }
 
 
 @Test(priority=5)
  
 public void Finalreview() throws InterruptedException{
 
 
	 //driver.findElement(By.xpath(".//*[@id='extendedAddressForm']/div[1]/div[1]/div/div[1]/div/div/button"))
	 //String city= "Maidstone";
	 driver.findElement(By.xpath("html/body/main/div[3]/div[3]/div/div/div/div[1]/div/div[1]/ul/div/li/div/div[3]/div/div/div/a")).click();
	 Thread.sleep(5000);
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
 
  @BeforeTest
 public void beforeMethod() {
 System.setProperty("webdriver.gecko.driver", "C:\\\\Automation\\geckodriver.exe");
 
 
	 System.out.println("TestRun Begins");
	   
  }

  @AfterTest
 public void afterMethod() throws InterruptedException {
	  
	  
	  
	 System.out.println("TestRun success");
	  
	 
	  
  }

}

