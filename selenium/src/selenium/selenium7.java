package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url10="file:///E:/x64/表单.html";
		driver.get(url10);
		 WebElement c=driver.findElement(By.xpath("/html/body/form/p[6]/select"));
		 Select s=new Select(c);    //选择的三种方式
		 s.selectByVisibleText("一月");
		 s.selectByIndex(0);      
		 s.selectByValue("11");
	}

}
