package ����κ���ϰ;

import java.util.Scanner;


public class SortForString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		String str = cin.nextLine();  //��ȡ��һ���ַ�����
		str = sort(str);
		System.out.println(str);
	}
	
	public static String sort(String s){  //����
		char[] chs = s.toCharArray();     //�ַ���ת��Ϊ�ַ�����s
		java.util.Arrays.sort(chs);       
		String result = String.valueOf(chs);  //����������̬ת���� String
		return result;
	}
	

}
