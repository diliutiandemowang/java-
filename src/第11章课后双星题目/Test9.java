package 第11章课后双星题目;

import java.util.ArrayList;
import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the array size is ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		System.out.println("Enter the array row by row: ");
		int [][] martix = new int[n][n];
		
		//生成随机数
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				martix[i][j] = (int)(Math.random() * 2);
				System.out.print(martix[i][j]);
			}
			System.out.print("\n");
		}
		
		//检查行
		int rowSum = sumRow(martix[0]);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		for(int i=0 ; i<n ; i++) {
			if(rowSum < sumRow(martix[i])) {
				rowSum = sumRow(martix[i]);
				list.clear();
				list.add(i);
			}
			else if(rowSum ==  sumRow(martix[i])) {
				list.add(i);
			}
		}
		System.out.print("The largest row index: ");
		for(int i=0 ; i<list.size()-1 ; i++) {
			System.out.print(list.get(i) + ", ");	
			System.out.print(list.get(list.size()-1));		
		}
		
		
		//检查列
		int columnSum = sumColumn(martix,0);
		list.clear();
		list.add(0);
		for(int i=0 ; i<n ; i++) {
			if(columnSum < sumColumn(martix[i])) {
				columnSum = sumColumn(martix[i]);
				list.clear();
				list.add(i);
			}
			else if(columnSum ==  sumColumn(martix[i])) {
				list.add(i);
			}
		}	
		System.out.print("\nThe largest column index: ");
		for(int i=0 ; i<list.size()-1 ; i++) {
			System.out.print(list.get(i) + ", ");	
			System.out.print(list.get(list.size()-1));		
		}		
	}
	
	private static int sumColumn(int[] is) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int sumRow(int row[]) {
		int sum = 0;
		for(int i=0 ; i<row.length ; i++) {
			sum += row[i];
		}
		return sum;
	}
		
	private static int sumColumn(int martix[][], int column) {
		int sum = 0;
		for(int i=0 ; i<martix.length ; i++) {
			sum += martix[i][column];
		}
		return sum;		
	}

}
