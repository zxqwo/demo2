package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url10="https://www.hao123.com/";
		driver.get(url10);
	/*	boolean flag=driver.findElement(By.id("su")).isDisplayed();
	if(flag==true)
	{
		driver.quit();//ÍË³ö
	}
	else
	{

		driver.findElement(By.id("su")).click();
	}
	}*/
File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);    //½ØÍ¼
try {
	FileUtils.copyFile(file, new File("D:/a.jpg"));     
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



}
}