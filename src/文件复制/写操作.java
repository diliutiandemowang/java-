package �ļ�����;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class д���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fos = new FileOutputStream("write.txt");//�ļ�������			
			BufferedOutputStream bos = new BufferedOutputStream(fos);//����������			
			String content = "welcome!";
			bos.write(content.getBytes(),0,content.getBytes().length);
			bos.flush();
			bos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
