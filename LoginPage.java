package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.drive.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://dev46.salesmate.io/login/#/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		username.click();
		username.sendKeys("Tushar46@yopmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.click();
		password.sendKeys("Tushar@123");
		
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]"));
		login.click();
		
	}

}
