package 数组课后练习;

import java.util.Scanner;


public class SortForString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		String str = cin.nextLine();  //获取下一行字符内容
		str = sort(str);
		System.out.println(str);
	}
	
	public static String sort(String s){  //排序
		char[] chs = s.toCharArray();     //字符串转换为字符数组s
		java.util.Arrays.sort(chs);       
		String result = String.valueOf(chs);  //基本数据型态转换成 String
		return result;
	}
	

}
