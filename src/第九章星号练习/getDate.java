package 第九章星号练习;

import java.util.GregorianCalendar;

public class getDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GregorianCalendar  date = new GregorianCalendar();
		System.out.println(date.get(date.YEAR) + ":" + date.get(date.MONTH) + ":" + date.get(date.DAY_OF_MONTH)); //输出时间
		
		date.setTimeInMillis(1234567898765L);
		System.out.println(date.get(date.YEAR) + ":" + date.get(date.MONTH) + ":" + date.get(date.DAY_OF_MONTH));//输出时间12...5L

	}

}
