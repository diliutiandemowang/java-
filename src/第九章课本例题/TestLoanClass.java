package µÚ¾ÅÕÂ¿Î±¾ÀıÌâ;

import java.util.Scanner;

public class TestLoanClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter annual interest rate,for example,8.25: ");
		double annualIntersetRate = input.nextDouble();
		
		System.out.print("Enter number og years as an integer: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();
		
		Loan loan = new Loan(annualIntersetRate, numberOfYears, loanAmount);
		
		System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nTHE total payment is %.2f\n",
				loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
	}

}
