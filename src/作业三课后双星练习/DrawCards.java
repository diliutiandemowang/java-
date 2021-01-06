package 作业三课后双星练习;

import java.util.*;
import java.math.*;

public class DrawCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rankofcard,suitofcard;
		
		rankofcard = (int)(Math.random()*13)+1;
		suitofcard = (int)(Math.random()*4)+1;
		
		System.out.print("The card you picked is ");
		if(rankofcard == 1) {
			System.out.print("Ace");
		}
		else if(rankofcard == 2) {
			System.out.print("2");
		}
		else if(rankofcard == 3) {
			System.out.print("3");
		}
		else if(rankofcard == 4) {
			System.out.print("4");
		}
		else if(rankofcard == 5) {
			System.out.print("5");
		}
		else if(rankofcard == 6) {
			System.out.print("6");
		}
		else if(rankofcard == 7) {
			System.out.print("7");
		}
		else if(rankofcard == 8) {
			System.out.print("8");
		}
		else if(rankofcard == 9) {
			System.out.print("9");
		}
		else if(rankofcard == 10) {
			System.out.print("10");
		}
		else if(rankofcard == 11) {
			System.out.print("Jack");
		}
		else if(rankofcard == 12) {
			System.out.print("Queen");
		}
		else if(rankofcard == 13) {
			System.out.print("King");
		}
		
		if(suitofcard == 1) {
			System.out.print(" of Clubs");
		}
		else if(suitofcard == 2) {
			System.out.print(" of Diamonds");
		}
		else if(suitofcard == 3) {
			System.out.print(" of Hearts");
		}
		else if(suitofcard == 4) {
			System.out.print(" of Spades");
		}
	}

}
