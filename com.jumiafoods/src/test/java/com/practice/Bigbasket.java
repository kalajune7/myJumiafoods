package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bigbasket {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com/");
		WebElement category = driver.findElement(By.xpath("//a[contains(text(),' Shop by')]"));
		Actions act=new Actions(driver);
		act.moveToElement(category).perform();
		WebElement fruits = driver.findElement(By.xpath("//a[.='Fruits & Vegetables' and @qa=\"catL1\"]"));
		act.moveToElement(fruits).perform();
		WebElement fresh = driver.findElement(By.xpath("//div[@id=\"navbar\"]/descendant::a[text()='Fresh Vegetables']"));
		act.moveToElement(fresh).perform();
		
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@id=\"navbar\"]/descendant::li[contains(@ng-repeat,\"l3\")]"));
		for (WebElement we: options) {
			String value = we.getText();
			System.out.println(value);
			
		}
		WebElement herbs = driver.findElement(By.xpath("//ul[@id=\"navBarMegaNav\"]/following-sibling::div/descendant::li[.='Herbs & Seasonings']"));
		
		driver.close();
		
	}

}
