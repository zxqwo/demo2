package xinde;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*Ԫ�ز�*/
public class finele extends baidu {
	public static WebElement a;
	public  static void find() {
		a=driver.findElement(By.xpath("//*[@id=\"u1\"]/a[1]"));
}
}