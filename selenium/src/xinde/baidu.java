package xinde;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*»ù´¡²ã*/
public class baidu {
	public static WebDriver driver;
 public static void open() {
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		 driver=new ChromeDriver();
		String url10="http://www.baidu.com";
		driver.get(url10);
 }
}

