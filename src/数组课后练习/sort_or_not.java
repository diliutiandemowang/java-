package ����κ���ϰ;

import java.util.Scanner;

public class sort_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner input = new Scanner(System.in);
		
		int number;
		System.out.print("Enter the size of the list:");
		number = input.nextInt();
		
		int numbers[] = new int[number];		
		for(int i = 0 ; i < number ; i++) {  //�õ�����
			System.out.print("Enter the contents of the list: ");
			numbers[i] = input.nextInt();
		}
		
		if(!isSorted(numbers[number])) {
			for(int i = 0 ; i< 10 ; i++) {    //�������
				System.out.println(numbers[i] + "\n");
			}
			System.out.println("The list is not sorted");
		}
		else {
			int temp;                            //ð������
			for(int i = 0 ; i < number ; i++) {            
				for(int j = 0 ; j+1 < number-i ; j++) {
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
			System.out.println("The list is already sorted");					
		}		
	}

	private static boolean isSorted(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean isSorted(int[] list) {
		for(int i = 1; i < list[0] ; i++) {
			if(list[i] > list[i+1]) {
				return false;
			}
		}
		return true;
	}

}
