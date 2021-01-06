package 作业三课后双星练习;

import java.util.*;
import java.math.*;

public class CheckIfInDelta {

	
	//利用海伦公式，计算三个三角形面积和等于大三角形面积
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point's x- and y-coordinates: ");
		double x= input.nextDouble();
		double y= input.nextDouble();
		
		double length1 = 0;
		double length2 = 0;
		double length3 = 0;
		length1 = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		length2 = Math.sqrt(Math.pow(x-200, 2)+Math.pow(y, 2));
		length3 = Math.sqrt(Math.pow(x, 2)+Math.pow(y-100, 2));

		double xie = 0;
		xie = Math.sqrt(Math.pow(200, 2)+Math.pow(100, 2));
		
		double p1 = 0;
		p1 = (length1 + 100 + length3)/2;
		double p2 = 0;
		p2 = (length1 + length2 + 200)/2;
		double p3 = 0;
		p3 = (xie + length2 + length3)/2;
		
		double s1 = 0;
		s1 = Math.sqrt(p1*(p1-length1)*(p1-100)*(p1-length3));
		double s2 = 0;
		s2 = Math.sqrt(p2*(p2-length1)*(p2-length2)*(p2-200));
		double s3 = 0;
		s3 = Math.sqrt(p3*(p3-length2)*(p3-xie)*(p3-length3));		
		
		if((s1+s2+s3) == 10000) {
			System.out.print("The Point is in the triangle");
		}
		else {
			System.out.print("The Point is not in the triangle");
		}
	}

}