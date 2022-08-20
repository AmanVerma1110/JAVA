package amantest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Appiumtest {



	@Test
	public void AppiumTest() throws MalformedURLException
	{
	
		//AndroidDriver, IOS Driver
		//Appium code -> Apium Server -> Mobile
//		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//95002526//.appium//node_modules//appium//build//lib//main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();
		
		
		UiAutomator2Options options = new UiAutomator2Options ();
		
		options.setDeviceName("13696341770004B");
		options.setApp("C://Users//95002526//eclipse-workspace//appium//src//test//java//resurces//ApiDemos-debug.apk");
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), options);
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		
		
		
		
		
		
		
		driver.quit();
//		service.stop();
		// Actual aumation 
				
	
	}

}
