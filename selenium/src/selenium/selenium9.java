package selenium;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class selenium9 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url10="https://www.zhihu.com/signup?next=%2F";
		driver.get(url10);
		 String current= driver.getCurrentUrl();
	String c=("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[1]/form/button");  //登录
				if(c.equals("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[1]/div/div/form/button"))	
			{
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[2]/span")).click();
					WebElement ck=driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div[1]/input"));
					ck.sendKeys("13965457895");
					WebElement c1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/input"));
					c1.sendKeys("zzy1m999");
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[1]/form/button")).click();
			}
		else
		{
			Thread.sleep(5000); //延时5000ms
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[2]/span")).click();
			WebElement ck1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div[1]/input"));
			ck1.sendKeys("13965457895");
			WebElement cl1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/input"));
			cl1.sendKeys("zzy1m999");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[1]/form/button")).click();
		
		}
				//添加并获取用户名Cookie
				driver.manage().addCookie(new Cookie("username", "13965457895", "/", null));
				String name = driver.manage().getCookieNamed("username").getValue();
				String user = "用户名是： " + name;
				String use = "alert(\"" + user + "\");";
				System.out.println(use);
				
				//添加并获取密码cookie
				driver.manage().addCookie(new Cookie("password", "zzy1m999", "/", null));
				String pas = driver.manage().getCookieNamed("password").getValue();
				String pass = "密码是： " + pas;
				String pasword = "alert(\"" + pass + "\");";
				System.out.println(pasword);

	
	driver.quit();//关闭页面
	}
}
