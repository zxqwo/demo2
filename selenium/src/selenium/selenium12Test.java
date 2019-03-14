package selenium;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium12Test {
WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://localhost:8080/mobile_mysql/index.jsp";
		driver.get(url);
		WebElement e=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[1]/td[2]/input"));
		e.sendKeys("lisi");
		  WebElement e1=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[2]/td[2]/input"));
				e1.sendKeys("123");
				  WebElement e10=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[3]/td[1]/input"));
					e10.click();	
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.close(); //退出
	}

	@Test
	public void testMain() {
	
		  
		String a=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/table[2]/tbody/tr[1]/td/font/b")).getText();
		assertEquals(a,"lisi");
	}
	@Test
	public void testJK()
	{
		String a12=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/table[2]/tbody/tr[3]/td")).getText();
		assertEquals(a12,"会员姓名：李四");
		
	}
	@Test
	public void testLV()
	{
	
        Date time = new Date();
		SimpleDateFormat now = new SimpleDateFormat("yyyy年MM月dd日");
		String c = now.format(time);
		
        String z=c;
        String datetime=z;
        SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
        String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
        Calendar cal = Calendar.getInstance(); // 获得一个日历
        Date datet = null;
        try {
            datet = f.parse(datetime);
            cal.setTime(datet);
        } catch (ParseException ke) {
            ke.printStackTrace();
        }
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1; // 指示一个星期中的某天。
        if (w < 0)
            w = 0;
        System.out.println("今天是"+weekDays[w]);
        
        System.out.println(c+" "+weekDays[w]);
        String a1=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/table[2]/tbody/tr[2]/td")).getText();
        
		assertEquals(a1,c+" "+weekDays[w]);
	}

}
