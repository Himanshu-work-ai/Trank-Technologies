package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class basetest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp () {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tranktechnologies.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
//	@AfterMethod
//	public void close() {
//		driver.quit();
//	}

}
