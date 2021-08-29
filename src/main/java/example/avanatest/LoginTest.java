package example.avanatest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;		

public class LoginTest {
	private WebDriver driver;
	  @Test(priority=1)
	  public void registrasi() throws Exception {
		  //open web
		  driver.get("http://qa-test.stagingdevbox.com/register/");  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  //input nama
		  WebElement nama=driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-auth-register/section/div/div/div/div/div/form/div[1]/input"));
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  nama.sendKeys("test nama");
		  Thread.sleep(1000);
		  
		  //input email
		  WebElement email = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-auth-register/section/div/div/div/div/div/form/div[2]/input"));
		  email.sendKeys("bigorrella@lephamtuki.com");
		  Thread.sleep(1000);
		  //input password
		  WebElement password = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-auth-register/section/div/div/div/div/div/form/div[3]/input"));
		  password.sendKeys("test@q123");
		  Thread.sleep(1000);
		  
		  //input konfirmasi password
		  WebElement kpassword = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-auth-register/section/div/div/div/div/div/form/div[4]/input"));
		  kpassword.sendKeys("test@q123");
		  Thread.sleep(1000);
		  
		  //tap button register
		  WebElement b=driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-auth-register/section/div/div/div/div/div/form/button"));
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  b.click();
		  Thread.sleep(1000);
			/*String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page"));*/ 		
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "D:\\QUALITY ASSURANCE\\Project\\AUTOMATION\\eclipse-workspace\\QA Test\\chromedriver.exe");
		  driver = new ChromeDriver(); 
	  }
	
	  @AfterTest
	  public void afterTest() {
		  
	  }

}
