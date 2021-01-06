package 作业三课后双星练习;

import java.util.*;
import java.math.*;

public class CheckIfInDoubleCircles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		
		double length1 = 0;
		length1 = Math.sqrt(Math.pow(y1-y2, 2) + Math.pow(x1-x2, 2));
		double length2 = 0;
		length2 = Math.abs(r1-r2);
		
		if(length1 <= length2) {
			System.out.print("circle2 is inside circle1");
		}
		else if(length1 <= (r1+r2)) {
			System.out.print("circle2 overlaps circle1");			
		}
		else {
			System.out.print("circle2 does not overlap circle1");			
		}
	
	
	}
}
