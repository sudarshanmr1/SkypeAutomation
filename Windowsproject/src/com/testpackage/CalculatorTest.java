package com.testpackage;
import org.junit.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.net.URL;
import io.appium.java_client.windows.WindowsDriver;

public class CalculatorTest {

    private static WindowsDriver driver = null;
    private static WebElement CalculatorResult = null;

    @BeforeClass
    public static void main(String[] args) throws InterruptedException, AWTException {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "\"C:\\Program Files (x86)\\Microsoft\\Skype for Desktop\\Skype.exe\"");
            capabilities.setCapability("platformname","windows");
            capabilities.setCapability("Devicename","windowsPC");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

           
            

        }catch(Exception e){
            e.printStackTrace();
        } finally {
        }
    }

}