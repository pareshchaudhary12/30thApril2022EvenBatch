package KeywordsPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPoolSizePractice {
	
	@Test (invocationCount = 5,threadPoolSize = 5)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium All Jars\\chromedriver_win32 (102)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
