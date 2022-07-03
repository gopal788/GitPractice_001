package Selenium_Demo.GitPractice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleScenario_01
{
	@Test
	public void TC01()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("https://www.amazon.com/your-account");
		driver.manage().window().maximize();
		Assert.assertEquals("Your Account", driver.getTitle());
		driver.close();
	}
}
