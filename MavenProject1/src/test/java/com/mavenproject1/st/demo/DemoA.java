package com.mavenproject1.st.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoA
{
  
  @Test
  public void tc_01()
  {
	  WebDriverManager.chromedriver().setup();
	  //WebDriverManager.chromedriver().setup();
	   ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("testng",Keys.ENTER);
   }
}
