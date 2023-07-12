package xpathpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemyTrip1 {

	
	

			public static void main(String[] args) throws Throwable {
				// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get("https://www.makemytrip.com/");
				Actions act = new Actions(driver);
				act.click().perform();
				WebElement from = driver.findElement(By.xpath("//span[text()='From']"));
				from.click();
				driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("blr");
				List<WebElement> benglrList = driver.findElements(By.xpath("//p[@class=\"font14 appendBottom5 blackText\"]"));
				for (WebElement lst : benglrList) {
					System.out.println(lst.getText());
				}
				String expexted = "Bengaluru, India";
				for (WebElement lst : benglrList) {
					if (lst.getText().equals(expexted)) {
						System.out.println("bengaluru is present");
						break;
					}
				}
				System.out.println();

				driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
				WebElement to = driver.findElement(By.xpath("//span[text()='To']"));
				to.click();
				driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("vtz");
				List<WebElement> vtglist = driver.findElements(By.xpath("//p[@class=\"font14 appendBottom5 blackText\"]"));

				String expectedVtg = "Visakhapatnam, India";

				for (WebElement vtg : vtglist) {
					if (vtg.getText().equals(expectedVtg)) {
						System.out.println("vtg is present");
						break;
					}
				}
				System.out.println();

				driver.findElement(By.xpath("//p[text()='Visakhapatnam, India']")).click();
				Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Departure']")).click();

		//Thu Jun 01 2023

				driver.findElement(By.xpath("//div[@aria-label='Thu Jun 01 2023']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Return']")).click();
				driver.findElement(By.xpath("//div[@aria-label='Mon Jul 03 2023']")).click();
				driver.findElement(By.xpath("//a[text()='Search']")).click();
				act.click().perform();
//				driver.findElement(By.xpath("//button[.='Refresh']"));
				// write data to excel sheet
	}
}
