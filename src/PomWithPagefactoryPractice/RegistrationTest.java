package PomWithPagefactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {  // Test case  ==> These are your navigational steps.
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
	public void FacebookRegistrationPageTest() {
		
		RegistrationPage rgpage = new RegistrationPage(driver);
		rgpage.clickFacebookSignupLink();
		rgpage.verifyFacebookRegistrationPagefblogo();
		rgpage.verifyFacebookRegistrationPageAlreadyAccount();
		rgpage.setFacebookRegistrationPageFirstName("ABCDEFGH");
		rgpage.setFacebookRegistrationPageLastName();
		rgpage.setFacebookRegistrationPageMob_Email();
		rgpage.setFacebookRegistrationPagePassword();
		rgpage.setFacebookRegistrationPageBirthDay();
		rgpage.setFacebookRegistrationPageBirthMonth();
		rgpage.setFacebookRegistrationPageBirthYear();
		rgpage.setFacebookRegistrationPageGender("female");
		rgpage.clickFacebookRegistrationPageSubmitBtn();
	}
	
}
