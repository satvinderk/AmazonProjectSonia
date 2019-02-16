package com.tt.ny.amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser1 {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\eclipse\\AmazonProjectSonia\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.manage().window().maximize();
		driver.getTitle();
		//driver.navigate();//use for backward,forward and refresh
	    System.out.println(driver.getTitle());
	    

	
	 if(driver.getTitle().equals("amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
	
		System.out.println("Test Pass");
	}
	else
		System.out.println("Test Fail");		
		
	
	// driver.close();
		
        driver.findElement(By.xpath("//*[@class='nav-a nav-a-2']")).click();
	    driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("satvinderk42@gmail.com");
	   driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("Sonia.1995");
	    driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
	    driver.findElement(By.xpath("//*[@class='nav-input']")).click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

}
