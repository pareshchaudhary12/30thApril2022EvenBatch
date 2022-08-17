package PomWithPagefactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium All Jars\\chromedriver_win32 (102)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void FacebookLoginPageTest() {
		
		LoginPage lp = new LoginPage(driver);
		lp.verifyFacebookLoginPageLogo();
		lp.verifyFacebookLoginPageTagline();
		lp.verifyFacebookLoginPageCreateNewAccountBtn();
		lp.verifyFacebookLoginPageCreatePage();
		lp.verifyFacebookLoginPageFooterLinks();
		lp.setFacebookLoginPageUsername();
		lp.setFacebookLoginPagePassword();
		lp.clickFacebookLoginPageLoginBtn();
	}
}
