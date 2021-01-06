package 数组课后练习;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDifferentNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[] = new int[10]; //获取十个数
		int distinictList[] = new int[10];//给distinictList的值均为-1
		Arrays.fill(distinictList, -1);
		
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		
        for (int i = 0; i < 10; i++) {  //获取10个数
            number[i] = input.nextInt();        	
        }

        for (int i = 0; i < 10; i++) {  //寻找出现的数字并赋值给新数组
            for (int j = 0; j < 10;j++) {
                if (i == number[j])
                	distinictList[i] = number[j];
            }
        }
		
        for(int i = 0; i < 10 ; i++) {  //统计数字总和
        	if(distinictList[i] !=-1) {
        		count ++ ;
        	}        
		}
		
        System.out.print("The number of distinct number is " + count);
        System.out.print("\nThe distinct numbers are: ");
        
        for(int i =0 ; i < 10; i++) {
        	if(distinictList[i] != -1) {
        		System.out.print(distinictList[i] + " ");
        	}
        }
	}
}