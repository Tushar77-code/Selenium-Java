package MyPackage;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker11 {

	public static void main(String[] args) {
		//Expected Date - 22 may 2026

		String expectedDay = "21";
		String expectedMonthYear = "July 2026";


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");

		WebElement calander = driver.findElement(By.xpath("//div[@class='dateInputWrapper___dfa43b dateHighlight___b79802']"));

		calander.click();


		
		while(true) {


			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			String  monthYearValue = driver.findElement(By.xpath("//p[@class='monthYear___1967d0']")).getText();

			if (monthYearValue.equals(expectedMonthYear)) {

				//if value not in table
				driver.findElement(By.xpath("//span[normalize-space()='"+ expectedDay +"']")).click();
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[2]/div/div/div/div/div/i[2]")).click();
			}
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");




	}

}
