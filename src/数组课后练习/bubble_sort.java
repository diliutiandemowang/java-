package ����κ���ϰ;

import java.util.Scanner;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		
		double numbers[] = new double[10];  //��ȡ����
		for(int i = 0 ; i< 10 ; i++) {
			numbers[i] = input.nextDouble();
		}
		
		double temp;  //�н�ֵ
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j+1 < 10-i ; j++) {
				if(numbers[j] > numbers[j+1]) {
					temp = numbers[j]; 
					numbers[j] = numbers[j+1]; 
					numbers[j+1] = temp;
				}
			}
		}
		
		for(int i = 0 ; i< 10 ; i++) {    //�������
			System.out.println(numbers[i] + "\n");
		}
	}

}