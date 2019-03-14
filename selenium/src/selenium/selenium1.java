package selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url10="http://www.taobao.com";
		driver.get(url10);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"q\"]"));
	//	WebElement e=driver.findElement(By.id("q"));
		e.sendKeys("sss");
		driver.findElement(By.xpath("//*[@id=\"J_TSearchForm\"]/div[1]/button"));
		WebElement es=driver.findElement(By.xpath("//*[@id=\"J_TSearchForm\"]/div[1]/button"));
		es.click();
//		String uRl="https://www.tmall.com/";
//		Scanner sc = new Scanner(System.in);
//		String uRll= sc.nextLine();
//           //driver.get(uRl);
//           try {
//        	    driver.get(uRll);
//           }
//           catch(Exception e){
//        	   driver.navigate().refresh();刷新
//        	   driver.get(uRl);
//           }
//           //driver.navigate().forward();   //前进
//        //   driver.navigate().back();    //后退
//          String current= driver.getCurrentUrl(); //获取当前页面网址
//          if(uRl.equals(current))
//          {
         // String title=  driver.getTitle(); //获取当前页面标题
       	 // System.out.println(title);
//          }
//          else {
//        	  System.out.println(current);
//          }
//	}
}
}