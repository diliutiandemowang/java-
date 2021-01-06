package 作业三课后双星练习;

import java.util.*;
import java.math.*;

public class CheckIfInDoubleRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();	
		
		double r1 = 0;
		double r2 = 0;
		r1 = Math.sqrt(Math.pow(x1-x2, 2));
		r2 = Math.sqrt(Math.pow(y1-y2, 2));
		
		if((r1+(w2/2))<(w1/2) && (r2+(h2/2))<(h1/2)) {
			System.out.print("r2 is inside r1");
		}
		else if(((r1+(w2/2))>(w1/2) && (r2+(h2/2))<(h1/2)) || ((r1+(w2/2))<(w1/2) && (r2+(h2/2))>(h1/2))){
			System.out.print("r2 overlaps r1");			
		}
		else {
			System.out.print("r2 does not overlap r1");						
		}
	}

}