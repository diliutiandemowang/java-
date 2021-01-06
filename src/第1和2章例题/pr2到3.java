package 第1和2章例题;

import java.util.Scanner;

public class pr2到3 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three numbers:");
		
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		double average = (number1+number2+number3)/3;
		System.out.println("The average of "+ number1 + " " + number2 
		  + " " + number3 + " is " + average);
	}
}
