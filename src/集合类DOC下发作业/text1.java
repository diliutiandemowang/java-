package ������DOC�·���ҵ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class text1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//new ��������
		Book book1 = new Book(1001,"hello",114.0,"Hello������");
		Book book2 = new Book(1002,"world",514.0,"World������");
		Book book3 = new Book(1003,"!",1919.0,"��̾�ų�����");
		
		
		//����hashmap��,keyΪ���,valueΪ����
		HashMap<Integer,Book> bookHashMap = new HashMap<>();
		bookHashMap.put(book1.getNumber(),book1);
		bookHashMap.put(book2.getNumber(),book2);
		bookHashMap.put(book3.getNumber(),book3);
		
		
		//����list��,��ͼ������Ϊkey
		List<HashMap<Integer,Book>> booksList = new ArrayList<>();
		booksList.add(bookHashMap);
		
		System.out.println("���\t����\t����\t������");
		for(HashMap<Integer,Book> i : booksList) {
			Set<Integer> key = i.keySet(); //��ȡkey
			for(Integer j : key) {
				//ͨ��key��value
				System.out.println(i + "\t" + i.get(j).getName() + "\t" + i.get(j).getPrice() + "\t" + i.get(j).getPress());
			}
		}
	}
}
	

class Book { //����Book��
	private int number;
	private String name;
	private double price;
	private String press;

	public Book() {
	}	
	
	Book(int number,String name,double price,String press){
		this.number = number;
		this.name = name;
		this.price = price;
		this.press = press;	
	}
	
	int getNumber() {
		return number;
	}
	
	String getName() {
		return name;
	}
	
	double getPrice() {
		return price;
	}
	
	String getPress() {
		return press;
	}
}