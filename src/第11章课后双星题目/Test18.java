package 第11章课后双星题目;

import java.util.Arrays;
import java.util.Scanner;

public class Test18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter s: ");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		System.out.print(s);
	}
	public static String toCharacterArray(String s) {
		String[] arr = s.split("");
		String ss = new String();
		ss = (Arrays.toString(arr));
		return ss;
	}

}
