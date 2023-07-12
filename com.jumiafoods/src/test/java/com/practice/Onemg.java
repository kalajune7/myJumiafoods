package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Onemg 
{
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.get("https://www.1mg.com/");
	driver.findElement(By.xpath("//div[@class='style__close-icon___3FflV']")).click();
	driver.findElement(By.xpath("//div[.='Cancel']")).click();
	driver.findElement(By.xpath("//div[.='Lab Tests']")).click();
	WebElement element = driver.findElement(By.xpath("//h3[.='Comprehensive Gold Full Body Checkup']"));
	driver.switchTo().frame("google_esf");
	driver.findElement(By.xpath("//button[.='Cancel']")).click();
			
	int y=element.getLocation().getY();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollby(0,"+y+")");
	
	driver.close();
	
}

}
