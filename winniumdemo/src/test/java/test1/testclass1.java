package test1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.sikuli.script.*;


public class testclass1 {

	public static void main(String[] args) throws  MalformedURLException, InterruptedException, FindFailed  {
		
		try {
		// TODO Auto-generated method stub

		DesktopOptions options = new DesktopOptions();
             		
		options.setApplicationPath("C:\\Program Files (x86)\\Microsoft\\Skype for Desktop\\Skype.exe");
		
				
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),options);
		
		
		Thread.sleep(6000);
		
		Screen s = new Screen();
		
		String inputFilePath = "C:\\Users\\Admin\\Desktop\\pattern.sikuli\\";
		
		
		Pattern openButton = new Pattern(inputFilePath + "1647527115761.png"); //call button
		Pattern openButton1 = new Pattern(inputFilePath + "1647527369146.png");//dial pad
		Pattern openButton2 = new Pattern(inputFilePath + "1647527707905.png");//dial pad empty prompt
		Pattern openButton3 = new Pattern(inputFilePath + "1647528053928.png");//211
		Pattern openButton4 = new Pattern(inputFilePath + "1647591676518.png");//732..ani
		Pattern openButton5 = new Pattern(inputFilePath + "1647592640871.png");//sudarshan
		Pattern openButton6 = new Pattern(inputFilePath + "1647527369146.png");//dialpad reuse
		
		Thread.sleep(100);
		
		s.find(openButton);
		
		Thread.sleep(100);
		 	 
		 s.click(openButton);
		 
		 Thread.sleep(10000);
		
		 s.find(openButton1);
		 s.click(openButton1);
		//driver.findElement(By.name("Audio Call")).click();
		 Thread.sleep(8000);
		 s.find(openButton2);
		 s.click(openButton2);
		 s.type(openButton2,"211");
		
		 //***Reuse1*******
		 Thread.sleep(5000);
		 s.find(openButton5);    //sudarshan
		 s.click(openButton5);
		 Thread.sleep(1000);
		 s.find(openButton1);
		 s.click(openButton1); // resue dial pad
		 Thread.sleep(3000);
		 s.find(openButton2);
		 s.click(openButton2);
		 s.type(openButton2,"1125879200");
		//***Reuse1*******
		 
		 //***Reuse11*******
		 Thread.sleep(5000);
		 s.find(openButton5);    //sudarshan
		 s.click(openButton5);
		 Thread.sleep(1000);
		 s.find(openButton1);
		 s.click(openButton1); // resue dial pad
		 Thread.sleep(5000);
		 s.find(openButton2);
		 s.click(openButton2);
		 s.type(openButton2,"4120110979");
		//***Reuse11*******
			
		//***Reuse111*******
		 Thread.sleep(15000);
		 s.find(openButton5);    //sudarshan
		 s.click(openButton5);
		 Thread.sleep(1000);
		 s.find(openButton1);
		 s.click(openButton1); // resue dial pad
		 Thread.sleep(10000);
		 s.find(openButton2);
		 s.click(openButton2);
		 s.type(openButton2,"7323063814");
		//***Reuse111*******
		 
		//***Reuse1111*******
		 Thread.sleep(3000);
		 s.find(openButton5);    //sudarshan
		 s.click(openButton5);
		 Thread.sleep(1000);
		 s.find(openButton1);
		 s.click(openButton1); // resue dial pad
		 Thread.sleep(5000);
		 s.find(openButton2);
		 s.click(openButton2);
		 s.type(openButton2,"8982");
		//***Reuse1111******* 
		 
		 
		 /*
		 
		 Thread.sleep(8000);
		 s.find(openButton3);
		 s.click(openButton3);
		 s.type(openButton3,"7323063814");
		 Thread.sleep(10000);
		 s.find(openButton4);
		 s.click(openButton4);
		 s.type(openButton4,"4120110979");
		 //***Reuse*******
		 Thread.sleep(7000);
		 s.find(openButton5);    //sudarshan
		 s.click(openButton5);
		 Thread.sleep(7000);
		 s.find(openButton1);
		 s.click(openButton1); // resue dial pad
		//***Reuse*******
		 Thread.sleep(8000);
		 s.find(openButton3);
		 s.click(openButton3);
		 s.type(openButton3,"7323063814");*/
		 
		//driver.findElementByName("Enter numbers using the dial pad").click();
		
	
		
		
		System.out.println("done");
	}catch (NumberFormatException e) {
		System.out.println(
                "NumberFormatException occurred");
	    }
	}
}


