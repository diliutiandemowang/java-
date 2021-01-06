package 作业三课后双星练习;

import java.util.Scanner;

public class LotteryTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//生成三位数
		int lottery = (int)(Math.random() * 1000);
		
		//用户输入
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digites): ");
		int guess = input.nextInt();
		
		//获得每位数字
		int lotteryDigit1  = lottery / 100;
		int lotteryDigit2  = (lottery / 10) % 10;
		int lotteryDigit3  = lottery % 100;
		
		//从用户得到数字
		int guessDigit1  = guess / 100;
		int guessDigit2  = (guess / 10) % 10;
		int guessDigit3  = guess % 100;		

		System.out.println("The lottery number is " + lottery);
		
		//检查中奖情况
		if (guess == lottery) {
			System.out.println("Exact match: you win $10,000");
		}
		else if((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
				|| (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3)
				|| (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)
				|| (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)) {
			System.out.println("Exact match: you win $3,000");			
		}
		else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
				||guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
				||guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) {
			System.out.println("Exact match: you win $1,000");	
		}
		else {
			System.out.println("Sorry, no match");	
		}
	}

}
