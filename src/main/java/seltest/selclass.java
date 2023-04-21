package seltest;
//import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
public class selclass {
        public static void main ( String args[]) throws InterruptedException{     	
		System.out.println("WELCOME");
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions chromeOptions =new ChromeOptions();
		chromeOptions.assArguments("--headless");
		chromeOptions.assArguments("--no-sandbox");
		chromeOptions.assArguments("--disable-dev-shm-usage");
		WebDriver driver =new ChromeDriver(chromeOptions);
		System.out.println("Welcome to Selenium Test scripts");
		driver.get("http://13.234.37.131:8085/contact.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("inputName")).sendKeys("Srija");
		driver.findElement(By.id("inputNumber")).sendKeys("9490984758");
		driver.findElement(By.id("inputMail")).sendKeys("reachsrija@gmail.com");
		driver.findElement(By.id("inputMessage")).sendKeys("Hello");
		driver.findElement(By.id("my-button")).click();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		if (url.equals("http://13.234.37.131:8085/contact.html"));{
		System.out.println("Script Executed Succesfully");
		}
	}
}
