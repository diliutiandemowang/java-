package 作业三课后双星练习;

import java.util.Scanner;

public class CofTriangule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("First:");
		int a = input.nextInt();
		System.out.print("Second:");		
		int b = input.nextInt();
		System.out.print("Thrid:");		
		int c = input.nextInt();
		
		if(a+b>c && a+c>b && b+c>a) {
			System.out.print(a+b+c);
		}
		else {
			System.out.print("Wolfulness");
		}
		
		
	}

}
