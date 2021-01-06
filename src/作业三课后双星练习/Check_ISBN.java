package 作业三课后双星练习;

import java.util.Scanner;

public class Check_ISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		Scanner input = new Scanner(System.in);
		
		
		int radius = input.nextInt();
		int sum_begin =radius;
		
		int sum = 0;
		for(int i = 9 ; i > 0 ; i--) {
			sum =sum + (radius % 10) * i;
			radius = radius / 10;
		}
		sum = sum % 11;
		int sum_end = sum_begin*10 + radius;
		
		if(sum == 10) {
			System.out.print("The ISBN-10 number is " + "X");
		}
		else {
			System.out.print("The ISBN-10 number is " + "0" +sum_end);			
		}
		
	}

}