package pre.propertiesEx;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropTest {
	private static void fileSave(Properties p) {
		//Properties�� XML ���Ϸ� ���� �����ϱ�
		
		p.setProperty("1", "�йи���,4,2000");
		p.setProperty("2", "�йи���,5,2023");
		p.setProperty("3", "����ο�,5,2004");
		
		try {
			FileOutputStream fos = new FileOutputStream("movies.xml");
			p.storeToXML(fos, "movies is fun.");
			fos.close();//���� ���� �� ����
			System.out.println("������ movies.xml ���Ͽ� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Properties p = new Properties();
		fileSave(p);
	}
}
