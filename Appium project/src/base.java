import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
								
		DesiredCapabilities cap= new DesiredCapabilities();
		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");
	
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "sudarshanavd");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		//cap.setCapability("appPackage", "com.skype.raider");
		//cap.setCapability("appActivity", "com.skype4life.MainActivity");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text= 'Accessibility']")).click();
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]")).click();
				
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Bouncing Balls\"]")).click();
		
		Thread.sleep(10000);
		
		
	}

}
