package selenium.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class selenium2Test {
	WebDriver driver;
	String url="http://localhost:8080/Banksys_ssh/";
  @BeforeClass
	  public void a() {
		  System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(url);
		    }
  @Test
  public void Af() {
		WebElement e=driver.findElement(By.xpath("//*[@id=\"loginValidate_userNO\"]"));
		e.sendKeys("1546582589952");
		WebElement e1=driver.findElement(By.xpath("//*[@id=\"loginValidate_password\"]"));
		e1.sendKeys("123456");
		WebElement e01=driver.findElement(By.xpath("//*[@id=\"loginValidate_0\"]"));
		e01.click();
		driver.switchTo().frame("leftFrame");
		driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		driver.switchTo().defaultContent();//�˳���ǰ���
  }
  @Test
  public void  Bbe() throws InterruptedException
  {
	  driver.switchTo().frame("mainFrame");
	  driver.findElement(By.xpath("//*[@id=\"fmoneyValidate_money\"]")).sendKeys("900");    //��һ��ȡ��
		Thread.sleep(5000); //��ʱ5000ms
	  driver.findElement(By.xpath("//*[@id=\"fmoneyValidate_0\"]")).click();
	
	  System.out.println(driver.findElement(By.xpath("/html/body/center")).getText());
	  }
  @Test
  public void za() throws InterruptedException {
		driver.switchTo().defaultContent();//�˳���ǰ���
		driver.switchTo().frame("leftFrame");//������ߵĿ��
		driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();//���ȡ��
		driver.switchTo().defaultContent();//�˳���ǰ���
		  driver.switchTo().frame("mainFrame");
		driver.findElement(By.name("money")).sendKeys("1200");//�ڶ���ȡ��
		Thread.sleep(5000); //��ʱ5000ms
		  driver.findElement(By.xpath("//*[@id=\"fmoneyValidate_0\"]")).click();
		  System.out.println(driver.findElement(By.xpath("/html/body/center")).getText());
  }
  @AfterClass
  public void GH(){
	  driver.close();//�ر�ҳ��
  }
}
