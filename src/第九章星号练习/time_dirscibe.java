package �ھ����Ǻ���ϰ;

import java.util.Date;

public class time_dirscibe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long l = 10000; //����һ���µ�����ʱ��
		
		Date date = new Date();
		printDate(l,date);
		l *= 10;  //ÿ������10��
		
		for(int i=0; i < 7; i++) {
			date.setTime(l);
			printDate(l,date);
			l *= 10;
			
		}
	}
	
	public static void printDate(long l , Date date) {  //���ʱ��
		System.out.println(l + ":" + date.toString());
	}

}