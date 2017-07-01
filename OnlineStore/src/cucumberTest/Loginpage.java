package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Automation\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.get("https://www.priorityplumbing.co.uk");
		 
		 //System.setProperty("webdriver.gecko.driver", "C:\\\\Automation\\geckodriver.exe");
		  driver.findElement(By.xpath("html/body/main/header/div[2]/div[1]/div[2]/ul/li[2]/a")).click();
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  Thread.sleep(10000);
		  driver.findElement(By.id("j_username")).sendKeys("testuser11@gmail.com");
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  Thread.sleep(10000);
		  driver.findElement(By.id("j_password")).sendKeys("Password-1");
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  Thread.sleep(10000);
		  driver.findElement(By.xpath(".//*[@id='loginForm']/div[3]/div[3]/button")).click();
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  Thread.sleep(10000);
		  driver.quit();
		  
		  //Thread.sleep(5000);
		

	}

}
