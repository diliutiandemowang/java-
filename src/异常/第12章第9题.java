package �쳣;

import java.util.Scanner;

public class ��12�µ�9�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("enter a bin string: ");
			Bin2DecUseBinaryFormatException bin = new Bin2DecUseBinaryFormatException(input.next());
			System.out.println("the binary value for decimal number " + bin.getBinString() + " is " + bin.bin2Dec());
		}
		catch (BinaryFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
