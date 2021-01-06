package Êı×é¿ÎºóÁ·Ï°;
import java.util.Scanner;

public final class ListKuaite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		int[] nums = new int[10];
		int number;
		System.out.print("Enter list size: ");
		number = cin.nextInt();
		System.out.print("Enter list content: ");		
		for(int i = 0; i < number; ++i){
			nums[i] = cin.nextInt();
		}
		int num = partition(nums);
		System.out.println("After the parttion, the list is ");
		for(int i = 0; i < nums.length; ++i)
			System.out.print(nums[i] + " ");
	}
 
	public static int partition(int[] list){
		int temp = 0;
		int j = 0;
		for(int i = 1; i < list.length; ++i){
			if(list[i] <= list[j]){
				temp = list[i];
				list[i] = list[j];
				list[j] = temp;
				
				temp = list[j+1];
				list[j+1] = list[i];
				list[i] = temp;
				
				++j;
			}
		}
		return j;
	}
		
}