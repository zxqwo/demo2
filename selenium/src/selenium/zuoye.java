package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zuoye {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url10="http://localhost:8080/Banksys_ssh/login.jsp";
		driver.get(url10);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"loginValidate_userNO\"]"));
		e.sendKeys("1546582589952");
		WebElement e1=driver.findElement(By.xpath("//*[@id=\"loginValidate_password\"]"));
		e1.sendKeys("123456");
		WebElement e01=driver.findElement(By.xpath("//*[@id=\"loginValidate_0\"]"));
		e01.click();
		driver.switchTo().frame("leftFrame");
		WebElement e02=driver.findElement(By.xpath("/html/body/p[2]/a/img"));
		e02.click();
		driver.switchTo().defaultContent();//�˳���ܵ�������
		driver.switchTo().frame("mainFrame");//�������ǱߵĿ��
		WebElement e03=driver.findElement(By.xpath("//*[@id=\"smoneyValidate_money\"]"));
		e03.sendKeys("1000");  //���1000
		Thread.sleep(5000); //��ʱ5000ms
		WebElement e024=driver.findElement(By.xpath("//*[@id=\"smoneyValidate\"]/table/tbody/tr[3]/td/div/input"));
		e024.click();//����
		WebElement e031=driver.findElement(By.xpath("//*[@id=\"smoneyValidate_money\"]"));
		e031.sendKeys("10000");  //���1000
		Thread.sleep(5000); //��ʱ5000ms
		WebElement e0241=driver.findElement(By.xpath("//*[@id=\"smoneyValidate_0\"]"));
		e0241.click();//ȷ��
		driver.switchTo().defaultContent();//�˳���ܵ�������
		driver.switchTo().frame("leftFrame");
		WebElement k=driver.findElement(By.xpath("/html/body/p[4]/a/img"));
		k.click();
		driver.switchTo().defaultContent();//�˳���ܵ�������
		driver.switchTo().frame("mainFrame");//�����ұߵĿ��
     	System.out.println(	driver.findElement(By.xpath("/html/body/center")).getText());
     	
	}

}
