package selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class selenium11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		/*FileHandler.copy(new File("E:\\a"), new File("E:\\b"),".txt"); //��a�ļ��������txt���������ݸ��Ƹ�b�ļ���
		FileHandler.copy(new File("D:\\a\\1.txt"), new File("D:\\b\\5.txt")); */
		//���ļ���д������
		FileOutputStream out=new FileOutputStream("E:\\a\\1.txt");
		String str="ssdad111f";
		byte[] b=str.getBytes();
		for(int i=0;i<str.length();i++)
		{
			out.write(b[i]);
		}
		out.close();
		String file = FileHandler.readAsString(new File("E:\\a\\1.txt"));  // ��ȡE:\\a\\1.txt�е�����
		System.out.println(file);     //��ӡE:\\a\\1.txt�е�����

	}

}
