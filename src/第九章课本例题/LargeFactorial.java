package µÚ¾ÅÕÂ¿Î±¾ÀıÌâ;

import java.util.*;
import java.math.*;


public class LargeFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		System.out.println(n + "! is \n" + factorial(n));
	}
	
	public static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;
		for(int i = 1; i <= n; i++)
			result = result.multiply(new BigInteger(i + ""));
		
		return result;
	}

}