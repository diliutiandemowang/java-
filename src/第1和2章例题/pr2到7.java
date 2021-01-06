package 第1和2章例题;

public class pr2到7 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSeconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		System.out.println("Current time is " + currentHour + ":"
		  + currentMinute + ":" + currentSeconds + " GMT");
	}
}
