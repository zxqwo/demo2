package selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class selenium11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		/*FileHandler.copy(new File("E:\\a"), new File("E:\\b"),".txt"); //把a文件夹下面的txt的所有内容复制给b文件夹
		FileHandler.copy(new File("D:\\a\\1.txt"), new File("D:\\b\\5.txt")); */
		//往文件中写入内容
		FileOutputStream out=new FileOutputStream("E:\\a\\1.txt");
		String str="ssdad111f";
		byte[] b=str.getBytes();
		for(int i=0;i<str.length();i++)
		{
			out.write(b[i]);
		}
		out.close();
		String file = FileHandler.readAsString(new File("E:\\a\\1.txt"));  // 读取E:\\a\\1.txt中的内容
		System.out.println(file);     //打印E:\\a\\1.txt中的内容

	}

}
