package 数组课后练习;

import java.util.Scanner;

public class binkTowList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = new int[6];
		int arr2[] = new int[5];
		
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Enter list1:");  //得到list1
		for(int i = 0 ; i < 6 ; ++i) {
			arr1[i] = cin.nextInt();			
		}
		System.out.print("Enter list2:");  //得到list2
		for(int i = 0 ; i < 5 ; ++i) {
			arr2[i] = cin.nextInt();			
		}
		
		int result[] =  merge(arr1 , arr2); //整合
		
		for(int i = 0 ; i < result.length ; ++i) {
			if(result[i] != 0) {
				for(int j = 0 ; j < result[i] ; ++j) {
					System.out.print(i + " ");
				}
			}
		}		
	}
		public static int[] merge(int[] list1, int[] list2) {
			int max = 0;
			for(int i = 0; i < list1.length; ++i) {
				if(list1[i] > max) {
					max = list1[i];
				}
			}
			for(int i = 0; i < list2.length; ++i) {
				if(list2[i] > max) {
					max = list2[i];
				}
			}
			int[] array = new int[max+1];
			
			for(int i = 0 ; i < list1.length ; ++i) {
				++array[list1[i]];
			}
			for(int i = 0 ; i < list2.length ; ++i) {
				++array[list2[i]];
			}
			return array;
		}
}