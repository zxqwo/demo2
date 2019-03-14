package selenium;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class selenium3Test {
	  static WebDriver driver;
	@DataProvider(name="da")
	public Object[][] data(){
	return new Object[][]{
	  {"skipp","abc123456"},	
		  {"geiwo","asdfg"},
		  {"sip","abc123456"},	
		  {"gwo","asdfg"},
	};
	} 
	@BeforeSuite
	public void beforeClass() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.baidu.com/");	
	  }
  @Test(dataProvider="da")
  public void CA(String zhanghao,String mima) throws InterruptedException  {
		WebElement e01=driver.findElement(By.xpath("	//*[@id=\"u1\"]/a[7]"));
		e01.click();
		Thread.sleep(2000); //延时2000ms
		WebElement e1=driver.findElement(By.xpath("//p[@title=\"用户名登录\"]"));
				e1.click();  //点击用户名登录
   driver.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys(zhanghao);
 		Thread.sleep(3000);
 		driver.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys(mima);
 	Thread.sleep(5000);
 driver.findElement(By.id("TANGRAM__PSP_10__submit")).click();
	Thread.sleep(5000);
 if(driver.findElement(By.id("TANGRAM__PSP_10__error")).isDisplayed())
{
	 System.out.println(driver.findElement(By.id("TANGRAM__PSP_10__error")).getText());//输出错误信息
	 Thread.sleep(5000);
File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
			try {
				FileUtils.copyFile(file, new File("D:/"+zhanghao+".jpg")); 
		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			driver.navigate().refresh(); //刷新
	 }
	else {
	}
  }
   }


	
