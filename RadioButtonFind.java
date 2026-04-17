package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.drive.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		driver.get("https://www.calculator.net/");
		
		List <WebElement> RadioButton = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("Number of Radio Button Present is Page - "+ RadioButton.size());
		
		driver.quit();
	
	

	}

}
