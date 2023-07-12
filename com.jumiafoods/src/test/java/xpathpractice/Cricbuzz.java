package xpathpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricbuzz {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class=\"cb-ico cb-search-input-icon cb-search-input-icon-nav\"]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'js-cb-search-input')]")).sendKeys("sandeep sharma");
		driver.findElement(By.xpath("//a[.='SEARCH' and @class='text-white cb-srch-bttn cb-srch-high-zIndex' ]")).click();
		driver.findElement(By.xpath("//a[@ng-href=\"/profiles/8356/sandeep-sharma\"]")).click();
		
		
		
	}
}
