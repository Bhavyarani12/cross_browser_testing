import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class fb {
@Test
	public void fb() throws InterruptedException {
	    
		
		 WebDriver	driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "‪‪‪‪C:\\geckodriver.exe");
		

		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://facebook.com");
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("bhavya");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys("hosamani");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='u_0_q']")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='u_0_x']")).sendKeys("abc");
		Thread.sleep(1000);
		
	driver.close();


	}

}
