package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewAutomationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.drive.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String Url = "https://www.saucedemo.com/";
		
		
		driver.get(Url);
		
		WebElement username = driver.findElement(By.id("user-name"));
		
		WebElement password = driver.findElement(By.id("password"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.name("login-button"));
		loginButton.click();
		
		
		

		

	}

}
