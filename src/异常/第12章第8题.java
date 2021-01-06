package 异常;

import java.util.Scanner;

public class 第12章第8题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("enter a hex string: ");
			HexToDecUseHexFormatException  hex = new HexToDecUseHexFormatException (input.next());
			System.out.println("the decimal value for hex number" + hex.getHexString() + " is " + hex.hexToDec());
		}
		catch(HexFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
