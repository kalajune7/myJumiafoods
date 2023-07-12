package xpathpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Covid {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.covid19india.org/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='state-name fadeInUp']"));
		List<WebElement> cases = driver.findElements(By.xpath("//div[@class='state-name fadeInUp']/../following-sibling::div[2]"));
//		ArrayList<String> list=new ArrayList<String>();
//		for(int i=0;i<name.size();i++)
//		{
//			list.add(name.get(i).getText());
//		}
//	
//		for(String name1:list)
//		{
//			String x="//div[.='"+name1+"']/../following-sibling::div[2]";
//			Thread.sleep(2000);
//			String activecases = driver.findElement(By.xpath(x)).getText();
//			System.out.println(name1+"----->"+activecases);
//		}
		
		for(int i=0;i<name.size();i++)
		{	
			String c = name.get(i).getText();
			if(c.equalsIgnoreCase("punjab"))
			{
				System.out.println(c+"---->"+cases.get(i).getText());
			}
		}

		driver.quit();
		// div[@class='state-name fadeInUp']/../following-sibling::div[2]/div
		////div[@class='state-name fadeInUp']/../following-sibling::div[2]
	}

}
