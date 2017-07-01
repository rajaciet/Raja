package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;


public class FirstTestCase {

	
		
		// TODO Auto-generated method stub
		
		public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.gecko.driver", "C:\\\\Automation\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.priorityplumbing.co.uk");
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("html/body/main/header/div[2]/div[1]/div[2]/ul/li[2]/a")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/button")).click();
			driver.findElement(By.xpath(".//*[@id='registerForm']/div[1]/div/div/div/ul/li[6]/a/span[1]")).click();
			driver.findElement(By.name("firstName")).sendKeys("test");
			driver.findElement(By.name("lastName")).sendKeys("user");
			driver.findElement(By.name("email")).sendKeys("testuser1@gmail.com");
			driver.findElement(By.name("mobileNumber")).sendKeys("07");
			driver.findElement(By.name("phoneNumber")).sendKeys("07");
			driver.findElement(By.name("pwd")).sendKeys("Password-1");
			driver.findElement(By.name("checkPwd")).sendKeys("Password-1");
			driver.findElement(By.xpath(".//*[@id='registerForm']/div[9]/button")).click();
			
			System.out.println("Website lauched successfully");
			
			Thread.sleep(100000);
			//driver.quit();
		

	}

}
