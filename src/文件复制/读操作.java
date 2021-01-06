package 文件复制;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class 读操作 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("read.txt");//文件输入流
			BufferedInputStream bis = new BufferedInputStream(fis);//缓冲输入流
			String content = null;
			
			//自定义缓冲区
			byte buffer[] = new byte[114514];
			int flag = 0;
			while((flag=bis.read(buffer))!=-1) {
				content += new String(buffer,0 , flag);
			}
			System.out.println(content);
			//关闭最外层的流
			bis.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
