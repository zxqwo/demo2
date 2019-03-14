package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url10="file:///E:/x64/frame.html";
		driver.get(url10);
		driver.switchTo().frame("frame");
		driver.findElement(By.id("input1")).sendKeys("给我一支烟");
	     Thread.sleep(5000); //延时5000ms
	    System.out.println(driver.getTitle());
		System.out.println(	driver.findElement(By.id("div1")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
//         driver.findElement(By.id("alert")).click();
//         Alert a=driver.switchTo().alert();//弹出弹框
//         Thread.sleep(5000);     //延时5000ms
//         a.accept();//点击确定
//     
//         driver.findElement(By.id("confirm")).click();
//         Alert ga=driver.switchTo().alert();
//         Thread.sleep(5000); //延时5000ms
//         ga.dismiss();//点击取消
//         
//         driver.findElement(By.id("prompt")).click();
//         Alert ka=driver.switchTo().alert();
//         ka.sendKeys("给我一支烟");
//         Thread.sleep(5000); //延时5000ms
//        // ka.dismiss();//点击取消
//         ka.accept();//点击确定
	}

}
