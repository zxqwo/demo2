package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url10="https://www.sina.com.cn/";
		driver.get(url10);
		String c=driver.getWindowHandle();
		driver.findElement(By.linkText("娱乐")).click();
	Set <String>w=driver.getWindowHandles();
	System.out.println(w.size());
		for(String i:w)
		{
			if(i.equals(c))
			{
				driver.switchTo().window(i);
				driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/form/div[1]/h3")).click();
				   Thread.sleep(5000); //延时5000ms
				driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/form/div[1]/div[2]/ul/li[4]")).click();
			
			
//				WebElement z1=driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/form/div[1]/h3"));
//				z1.click();
		
				           
			break;
			
			}
			else
			{
				System.out.println("没找到，重新查找");
				continue;
			}
		}
		WebElement z1=driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/form/div[3]/input"));
		z1.sendKeys("中文站");
	WebElement e2=driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/form/input"));
	e2.click();          
		
	}
	
}
