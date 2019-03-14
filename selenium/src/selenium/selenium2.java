package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url10="http://www.baidu.com";
		driver.get(url10);
		WebElement e1=driver.findElement(By.xpath("//*[@id=\"u1\"]/a[1]"));
		e1.click();
		WebElement e=driver.findElement(By.id("ww"));
			e.sendKeys("Âå¿ËÍõ¹ú");
			WebElement e2=driver.findElement(By.xpath("//*[@id=\"s_btn_wr\"]"));
			e2.click();
			try {
			//WebElement e3=driver.findElement(By.xpath("//*[@id=\"1\"]/h3/a"));
			String e3Text=driver.getTitle();
			System.out.println(e3Text);
			}catch(Exception a){
				driver.navigate().back();
			}
}
}