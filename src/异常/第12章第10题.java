package 异常;

import java.util.ArrayList;
import java.util.List;

public class 第12章第10题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		try {
			while(true) {
				list.add(new Object());
			}
		}
		catch (Exception e) {
			System.exit(0);
		}
	}

}
