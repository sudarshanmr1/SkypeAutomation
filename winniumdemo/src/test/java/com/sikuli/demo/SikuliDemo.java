
		
		package com.sikuli.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class SikuliDemo {
	
	private static String abc;






	public static void main(String[] args) throws InterruptedException, AWTException  {

     String testUrl;
    

  
 	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver;
        testUrl = "https://web.skype.com/skype:+18557770348?call";

        // Create a new instance of the Chrome driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        driver = new ChromeDriver();

        //maximize window
        //driver.manage().window().maximize();

        // And now use this to visit myBlog
        // Alternatively the same thing can be done like this
        // driver.navigate().to(testUrl);
        driver.get(testUrl);
        
        driver.findElement(By.name("loginfmt")).sendKeys("sudarshanmr1@gmail.com");
        
        Thread.sleep(100);
        
        driver.findElement(By.name("loginfmt")).sendKeys(Keys.ENTER);
        
        Thread.sleep(1000);
    	
               
        driver.findElement(By.name("passwd")).sendKeys("Krishna@123");
        
        Thread.sleep(1000);
        
        driver.findElement(By.name("passwd")).sendKeys(Keys.ENTER);
        
        
        Thread.sleep(1000);
        
      driver.findElement(By.id("#idSIButton9")).click();
        
 
        
        
        driver.quit();
        
    	
    }
	


    
	

	private static void prepare() {
		// TODO Auto-generated method stub
		
	}

}
