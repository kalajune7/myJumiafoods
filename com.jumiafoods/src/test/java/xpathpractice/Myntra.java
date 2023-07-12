package xpathpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra
{
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement element = driver.findElement(By.xpath("//a[.='Beauty']"));
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
	 List<WebElement> elements = driver.findElements(By.xpath("//a[text()=\"Men's Grooming\"]/parent::li/following-sibling::li/a[@class=\"desktop-categoryLink\" and not(.='Beauty Gift') and not(.=\"Makeup Kit\")]"));
	for(int i=1;i<elements.size();i++)
	{
		System.out.println(elements.get(i).getText());
	}
}
}
