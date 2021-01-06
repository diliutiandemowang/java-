package 作业三课后双星练习;

import java.util.Scanner;

public class TodayIsWhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		int day = input.nextInt();
		
		int j = 0;
		int k = 0;
		int h = 0;
		j = year / 100;
		k = year % 100;

		h = (day + (26*(month+1))/10 + k + k/4 + j/4 + 5*j) % 7;
		
		if(h == 0) {
			System.out.print("Day of the week is Saturday");
		}
		else if(h == 1) {
			System.out.print("Day of the week is Sunday");
		}
		else if(h == 2) {
			System.out.print("Day of the week is Monday");
		}
		else if(h == 3) {
			System.out.print("Day of the week is Tuesday");
		}
		else if(h == 4) {
			System.out.print("Day of the week is Wednesday");
		}
		else if(h == 5) {
			System.out.print("Day of the week is Thursday");
		}
		else if(h == 6) {
			System.out.print("Day of the week is Friday");
		}		
	}

}