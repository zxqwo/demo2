package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url10="https://www.cnblogs.com";
		driver.get(url10);
		driver.findElement(By.xpath("//*[@id=\"cate_item_2\"]/a")).click();
		 WebElement c=driver.findElement(By.id("cate_item_2"));
			Actions action = new Actions(driver);        
			action.moveToElement(c).perform(); //–¸Õ£
			driver.findElement(By.xpath("//*[@id=\"cate_content_block_2\"]/div[2]/ul/li[1]/a")).click();
		Thread.sleep(5000); //—” ±5000ms
		WebElement e1=driver.findElement(By.id("zzk_q"));
		e1.sendKeys("java");
		driver.findElement(By.xpath("//*[@id=\"search_block\"]/div[1]/input[2]")).click();
		Thread.sleep(5000); //—” ±5000ms
		System.out.println("");
		 String current= driver.getCurrentUrl();
			if(current.equals("https://zzk.cnblogs.com/s?t=b&w=java"))
			{
				System.out.println("java");
			System.out.println("949420");
				}
		else {
	try {
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);    //ΩÿÕº
		FileUtils.copyFile(file, new File("D:/a.jpg"));     
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		driver.navigate().back();  //∑µªÿ…œ“ª“≥      
	}
	}
	}
	}

