package 文件复制;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class 写操作 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fos = new FileOutputStream("write.txt");//文件输入流			
			BufferedOutputStream bos = new BufferedOutputStream(fos);//缓冲输入流			
			String content = "welcome!";
			bos.write(content.getBytes(),0,content.getBytes().length);
			bos.flush();
			bos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
