package xpathpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class olympics 
{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		driver.findElement(By.xpath("//button[.='Yes, I am happy']")).click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		List<WebElement> country = driver.findElements(By.xpath("//span[@data-cy=\"country-name\"]"));
		 List<WebElement> gold = driver.findElements(By.xpath("//div[@title='Gold']"));
		for(int i=0;i<country.size();i++)
		{
			System.out.println(country.get(i).getText()+"---->"+gold.get(i).getText());
		}
		driver.close();
	}
}
