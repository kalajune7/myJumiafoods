package xpathpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Actions act=new Actions(driver);
		act.click().perform();
		 WebElement from = driver.findElement(By.id("fromCity"));
		 from.sendKeys("blr");
		List<WebElement> autosug = driver.findElements(By.xpath("//p[@class='font14 appendBottom5 blackText']"));
		String exp="Bengaluru, India";
		//String actual = onesug.getText();
		for(WebElement onesug:autosug)
			
		{ 
		String actual = onesug.getText();
			
			if(exp.equals(actual))
					{
					onesug.click();
					}
		}
		 WebElement to = driver.findElement(By.xpath("//span[.='To']"));
		 to.click();
//		 to.sendKeys("vtz");
//		
//		 List<WebElement> autosug1 = driver.findElements(By.xpath("//p[@class='font12 greyText appendBottom3']"));
//		 String exp1="Visakhapatnam, India";
//		 for(WebElement onesug1:autosug1)
//				
//			{ 
//				String actual1 = onesug1.getText();
//				
//				if(exp1.equals(actual1))
//						{
//						onesug1.click();
//						}
//			}
		  driver.findElement(By.xpath("//input[@placeholder=\"To\"]"))
		.sendKeys("vtz");
		
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
		driver.findElement(By.xpath("//div[@aria-label='Thu Jun 01 2023']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Mon Jul 03 2023']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		act.click().perform();





	}

}
