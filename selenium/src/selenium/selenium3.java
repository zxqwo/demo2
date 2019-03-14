package selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class selenium3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url10="http://www.baidu.com";
		driver.get(url10);
		//WebElement e1=driver.findElement(By.className("mnav"));  定位一个
		List<WebElement> e1=driver.findElements(By.className("mnav"));
		e1.get(1).click();
		//WebElement e3=driver.findElement(By.xpath("//*[@id=\"1\"]/h3/a"));
	//String e3Text=driver.getTitle();
		  String current= driver.getCurrentUrl();
		if(current.equals("https://www.hao123.com/"))
		{
			System.out.println(current);
			WebElement e=driver.findElement(By.id("search-input"));
			e.sendKeys("骑砍中文站");
			WebElement e2=driver.findElement(By.xpath("//*[@id=\"search-form\"]/div[2]/input"));
			e2.click();
			//WebElement e5=driver.findElement(By.xpath("//*[@id=\"1\"]/h3/a"));
			//e5.click();
		}else{
			driver.navigate().refresh();
		}
	}

}
