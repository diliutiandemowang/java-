package ��1��2������;

import java.util.Scanner;

public class pr2��2 {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius:");
		double radius = input.nextDouble();
		double area = radius*radius*3.14159;
		System.out.println("The area for the circle of radius " + 
		  radius + " is " + area);
	}
}
