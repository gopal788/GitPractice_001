package Selenium_Demo.GitPractice;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleScenario_01
{
	public Logger log = Logger.getLogger(this.getClass().getName());
	@Test
	public void TC01() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		log.info("Successfully Chrome Browser Launched");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
		driver.get("https://www.amazon.com/your-account");
		log.info("Successfully Entered Amazon URL");
		driver.manage().window().maximize();
		Assert.assertEquals("Your Account", driver.getTitle());
		log.info("Successfully Verified Home Page Title");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h2[contains(text(),'Your Orders')]")).click();
		Thread.sleep(5000);
		driver.close();
		log.info("Successfully Closed Browser");//a[@class='action account wishlist-icon']
	}
}
