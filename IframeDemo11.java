package MyPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IframeDemo11 {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\tushar.chimurkar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://vinothqaacademy.com/iframe/");

		driver.switchTo().frame("popuppage");

		WebElement confirmButton = driver.findElement(By.name("confirmalertbox"));

		confirmButton.click();


		driver.switchTo().alert().accept();


		System.out.println("Run Sucessfully");



		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement frame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='Web Table']")));

		driver.switchTo().frame(frame);

		WebElement serchName = driver.findElement(By.id("nameInput"));

		serchName.sendKeys("John");

		WebElement check1 = driver.findElement(By.xpath("//tr[td[text()='John Doe']]//input[@type='checkbox']"));
		check1.click();

		WebElement check2 = driver.findElement(By.xpath("//tr[td[text()='Jane Smith']]//input[@type='checkbox']"));
		check2.click();

		Thread.sleep(2000);

		WebElement delete = driver.findElement(By.id("deleteBtn"));

		delete.click();










	}

}
