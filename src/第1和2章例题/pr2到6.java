package 第1和2章例题;

import java.util.Scanner;

public class pr2到6 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a dagree in Fahrenheit:");
		double fahrenheit = input.nextDouble();
		double celsius = (5.0/9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " +
		  celsius + " in Celsius");
	}

}
