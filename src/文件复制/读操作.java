package �ļ�����;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("read.txt");//�ļ�������
			BufferedInputStream bis = new BufferedInputStream(fis);//����������
			String content = null;
			
			//�Զ��建����
			byte buffer[] = new byte[114514];
			int flag = 0;
			while((flag=bis.read(buffer))!=-1) {
				content += new String(buffer,0 , flag);
			}
			System.out.println(content);
			//�ر���������
			bis.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
