package 第九章星号练习;

import java.util.Date;

public class time_dirscibe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long l = 10000; //设置一个新的流逝时间
		
		Date date = new Date();
		printDate(l,date);
		l *= 10;  //每次增加10倍
		
		for(int i=0; i < 7; i++) {
			date.setTime(l);
			printDate(l,date);
			l *= 10;
			
		}
	}
	
	public static void printDate(long l , Date date) {  //输出时间
		System.out.println(l + ":" + date.toString());
	}

}