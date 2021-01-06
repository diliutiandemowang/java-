package 数组课后练习;

import java.util.Scanner;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		
		double numbers[] = new double[10];  //读取数字
		for(int i = 0 ; i< 10 ; i++) {
			numbers[i] = input.nextDouble();
		}
		
		double temp;  //中介值
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j+1 < 10-i ; j++) {
				if(numbers[j] > numbers[j+1]) {
					temp = numbers[j]; 
					numbers[j] = numbers[j+1]; 
					numbers[j+1] = temp;
				}
			}
		}
		
		for(int i = 0 ; i< 10 ; i++) {    //输出数字
			System.out.println(numbers[i] + "\n");
		}
	}

}