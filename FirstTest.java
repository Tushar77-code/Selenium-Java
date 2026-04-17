package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome web browser 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		//capture title of webpage and print 
		
		String title = driver.getTitle();
		
		System.out.println("Page Title - "+ title);
		
		
		String URL = driver.getCurrentUrl();
		System.out.println("Page URL - "+ URL);
		
		

	}

}
