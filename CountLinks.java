package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.drive.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		
		driver.navigate().to("https://www.calculator.net/");
		
		driver.manage().window().maximize();
		
		List <WebElement> linkElement = driver.findElements(By.tagName("a"));
		
		System.out.println("The Count of link is - "+ linkElement.size() );
		
		for (WebElement e1 : linkElement) {
			System.out.println(e1.getText());
		}
		
		driver.close();
	}

}
