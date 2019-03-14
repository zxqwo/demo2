package selenium;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class tesbaidu {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
	
	WebDriver driver;
	ChromeOptions options=new ChromeOptions();
	options.addArguments("C:\\Users\\Lenovo\\AppData\\Local\\Google\\Chrome\\User Data");
	DesiredCapabilities capabilities =DesiredCapabilities.chrome();
	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	driver = new RemoteWebDriver(new URL("http://169.254.73.225:4444/wd/hub"), capabilities);
	 Thread.sleep(10000); //—” ±5000ms
	 
	driver.get("http://www.baidu.com");
	}

}
