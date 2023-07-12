package xpathpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonExcel
{
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 mobile phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		 List<WebElement> prices = driver.findElements(By.xpath("//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-2\"]/parent::div/following-sibling::div[@class=\"sg-row\"]/descendant::div[@class=\"a-row a-size-base a-color-base\"]/descendant::span[@class=\"a-price\"]"));
			FileInputStream fis=new FileInputStream(".//src//test//resources//TestData.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet("Sheet1");

	for(int i=1;i<prices.size();i++)
	{	
		sh.createRow(i).createCell(0).setCellValue(prices.get(i).getText());
	}
	FileOutputStream fout=new FileOutputStream(".//src//test//resources//TestData.xlsx");
	wb.write(fout);
	wb.close();
	driver.close();
	}

}
