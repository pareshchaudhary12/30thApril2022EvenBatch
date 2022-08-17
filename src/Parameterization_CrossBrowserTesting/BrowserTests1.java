package Parameterization_CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTests1 {
	WebDriver driver;
	// browser setup
	@Parameters("browser")
	@Test (priority = 1)
	public void Crossbrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium All Jars\\chromedriver_win32 (102)\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium All Jars\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			System.out.println("Wrong browser selected by user");
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test(priority = 2)
	public void verifycurrenturl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
	
	@Test(priority = 3)
	public void verifyPageTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	@Test(priority = 4)
	public void verifyUsernamefield() {
		 WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		 Assert.assertTrue(username.isDisplayed());
		 username.sendKeys("Paresh");
	}
	@Test(priority = 5)
	public void verifyPasswordfield() {
		 WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		 Assert.assertTrue(password.isDisplayed());
		 password.sendKeys("Paresh@1236548799");
	}
	@Test(priority = 6)
	public void clickLoginBtn() {
		 WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
		 Assert.assertTrue(loginbtn.isEnabled());
		 loginbtn.click();
		 driver.close();
	}
}
