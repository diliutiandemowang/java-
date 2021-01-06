package Êı×é¿ÎºóÁ·Ï°;

import java.util.Scanner;

public class countnumber1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[] = new int[101];
		int num=1;
		
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter the integers between 1 and 100: ");
		
		do {
			num = input.nextInt();
			number[num] += 1; 
		}while( num != 0);
		
		for(int i = 0; i < number.length ; i++) {
			if(number[i] == 1) {
				System.out.println(i + " occurs " + number[i] + " time ");
			}
			else if(number[i] > 1) {
				System.out.println(i + " occurs " + number[i] + " times ");				
			}
		}
	}

}
