package MyPackage;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakescreenShot {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\tushar.chimurkar\\Desktop\\JavaPractice\\TestDemo\\Screenshots\\fullpage.png");
		
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
