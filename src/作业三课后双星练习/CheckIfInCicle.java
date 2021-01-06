package 作业三课后双星练习;

import java.util.*;
import java.math.*;

public class CheckIfInCicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("enter a point with two coordinates: ");
		double x= input.nextDouble();
		double y= input.nextDouble();
		
		double length = 0;
		length = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		
		if(length < 10) {
			System.out.print(String.format("Point (%.1f, %.1f) is in the circle",x,y));
		}
		else {
			System.out.print(String.format("Point (%.1f, %.1f) is not in the circle",x,y));
		}
	}

}
