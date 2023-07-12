import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MajentoSite 
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement women = driver.findElement(By.id("ui-id-4"));
		Actions act=new Actions(driver);
		act.moveToElement(women).perform();
		WebElement tops = driver.findElement(By.id("ui-id-9"));
		act.moveToElement(tops).perform();
		WebElement jackets = driver.findElement(By.id("ui-id-11"));
		act.moveToElement(jackets).perform();
		jackets.click();
		driver.findElement(By.id("option-label-size-143-item-168")).click();
		driver.findElement(By.id("option-label-color-93-item-53")).click();
		//driver.findElement(By.xpath("(//strong[@class=\"product name product-item-name\"])[2]/following-sibling::div[4]/descendant::form/button[@class='action tocart primary']")).click();
		driver.findElement(By.xpath("(//button[@title='Add to Cart'])[2]")).click();
		String exp="Juno Jacket";
		String actual = driver.findElement(By.xpath("//span[.='Juno Jacket']")).getText();
		System.out.println(actual);
//		if(actual.contains(exp))
//		{
//			System.out.println("data is verified");
//		}
		
		Assert.assertEquals(exp, actual);
		
		System.out.println("data is verified");
		driver.close();
	}

}
