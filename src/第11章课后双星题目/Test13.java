package 第11章课后双星题目;

import java.util.ArrayList;
import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter ten integers: ");
		ArrayList<Integer> list =new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		for(int i=0 ; i<10 ; i++) {
			list.add(input.nextInt());
		}
		removeDuplicate(list);
		for(int i=0 ; i<list.size() ; i++)
			System.out.print(list.get(i) + " ");
	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> temp =new ArrayList<Integer>();
		for(int i = 0 ; i<list.size(); i++)
			if(!temp.contains(list.get(i)))
				temp.add(list.get(i));
		
		list.clear();
		for(int i=0 ; i<temp.size(); i++)
			list.add(temp.get(i));
	}
}
