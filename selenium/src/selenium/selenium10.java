package selenium;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
                                                     
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class selenium10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///E:/x64/selenium_html/demo1.html";
		driver.get(url);
		/*拖动按钮
		  WebElement e=driver.findElement(By.id("drag"));
		WebElement e1=driver.findElement(By.xpath("/html/body/h1"));
		Thread.sleep(5000);
		(new  Actions(driver)).dragAndDropBy(e,-180,-30).perform();
		*/
		//多选下拉框 
		/*Actions a =new Actions(driver);
		WebElement e=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
		List<WebElement> options=driver.findElements(By.tagName("options"));
		Action a1=a.keyDown(Keys.SHIFT).click(options.get(0)).click(options.get(2));
		*/
		WebElement e=driver.findElement(By.id("user"));
		e.sendKeys("zxq");
		WebElement e1=driver.findElement(By.xpath("//*[@id=\"link\"]/a"));
		e1.click();
		driver.navigate().back();
		WebElement e2=driver.findElement(By.name("select"));
		Select select=new Select(e2);
		select.selectByIndex(2);
		driver.findElement(By.className("Saab")).click();
		
	WebElement e3= driver.findElement(By.name("checkbox1"));
		e3.click();
		WebElement e4= driver.findElement(By.name("checkbox2"));
		e4.click();
		
		Boolean bl=driver.findElement(By.xpath("//*[@id=\"button\"]/input")).isEnabled();
		Assert.assertFalse(bl,"校验按钮为不可输入状态");
		

		driver.findElement(By.xpath("//*[@id=\"alert\"]/input")).click();
		//跳转至alert弹框页面上
		Alert a=driver.switchTo().alert();
		Thread.sleep(3000);//延长时间点击
		//点击确定按钮
		a.accept();
		driver.findElement(By.id("load")).sendKeys("D:\\zxq.txt");
		
		String s=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"open\"]/a")).click();
		
		Set<String> w=driver.getWindowHandles();
		for(String i:w)
		{
			String title=driver.getTitle();
			if(i.equals(s))
			{
				driver.switchTo().window(i);
				break;
			}
			else {
				System.out.println();
			}
	}
    WebElement e5=driver.findElement(By.xpath("//*[@id=\"action\"]/input"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e5).perform();
		Thread.sleep(5000);
		WebElement e6=driver.findElement(By.xpath("//*[@id=\"wait\"]/input"));
		e6.click();
		Thread.sleep(20000);
		//driver.navigate().refresh();
	}}

